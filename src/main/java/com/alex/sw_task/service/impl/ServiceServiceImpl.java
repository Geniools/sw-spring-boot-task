package com.alex.sw_task.service.impl;

import com.alex.sw_task.api.dto.ServiceRequest;
import com.alex.sw_task.api.dto.ServiceResponse;
import com.alex.sw_task.repository.ServiceRepository;
import com.alex.sw_task.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceServiceImpl implements ServiceService {
	private ServiceRepository serviceRepository;

	@Autowired
	public ServiceServiceImpl(ServiceRepository serviceRepository) {
		this.serviceRepository = serviceRepository;
	}

	@Override
	public ServiceResponse getServiceById(String id) {
		return null;
	}

	@Override
	public ServiceResponse updateService(String id, ServiceRequest serviceRequest) {
		return null;
	}

	@Override
	public ServiceResponse createService(ServiceRequest serviceRequest) {
		return null;
	}
}
