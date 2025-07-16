package com.alex.sw_task.service.impl;

import com.alex.sw_task.api.dto.ServiceRequest;
import com.alex.sw_task.api.dto.ServiceResponse;
import com.alex.sw_task.exception.ServiceNotFoundException;
import com.alex.sw_task.repository.ServiceRepository;
import com.alex.sw_task.repository.entity.ServiceEntity;
import com.alex.sw_task.service.ServiceEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ServiceEntityServiceImpl implements ServiceEntityService {
	private final ServiceRepository serviceRepository;

	@Autowired
	public ServiceEntityServiceImpl(ServiceRepository serviceRepository) {
		this.serviceRepository = serviceRepository;
	}

	@Override
	@Cacheable(value = "services", key = "#id")
	public ServiceResponse getServiceById(String id) {
		ServiceEntity serviceEntity = serviceRepository.findById(id)
				.orElseThrow(() -> new ServiceNotFoundException("Service with id: " + id + " not found."));
		return this.mapToResponse(serviceEntity);
	}

	@Override
	@CachePut(value = "services", key = "#id")
	public ServiceResponse updateService(String id, ServiceRequest serviceRequest) {
		// Fetch the existing service by ID
		ServiceEntity existingService = serviceRepository.findById(id).
				orElseThrow(() -> new ServiceNotFoundException("Service with id: " + id + " not found."));

		// Update the resources of the existing service
		existingService.setResources(serviceRequest.getResources());

		// Save the updated service back to the repository
		ServiceEntity updatedService = serviceRepository.save(existingService);
		// Map the updated service entity to a response DTO
		return this.mapToResponse(updatedService);
	}

	@Override
	@CachePut(value = "services", key = "#result.id")
	public ServiceResponse createService(ServiceRequest serviceRequest) {
		ServiceEntity service = ServiceEntity.builder()
				.id(serviceRequest.getId())
				.resources(serviceRequest.getResources())
				.build();

		// Save to MongoDB
		ServiceEntity savedService = this.serviceRepository.save(service);
		return this.mapToResponse(savedService);
	}

	/**
	 * Helper method that maps a ServiceEntity to a ServiceResponse.
	 *
	 * @param serviceEntity the ServiceEntity to map
	 * @return the mapped ServiceResponse
	 */
	private ServiceResponse mapToResponse(ServiceEntity serviceEntity) {
		return ServiceResponse.builder()
				.id(serviceEntity.getId())
				.resources(serviceEntity.getResources())
				.build();
	}
}
