package com.alex.sw_task.api;

import com.alex.sw_task.api.dto.ServiceRequest;
import com.alex.sw_task.api.dto.ServiceResponse;
import com.alex.sw_task.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/services")
public class ServiceController {
	private final ServiceService serviceService;

	@Autowired
	public ServiceController(ServiceService serviceService) {
		this.serviceService = serviceService;
	}

	@PostMapping
	public ResponseEntity<ServiceResponse> createService(@RequestBody ServiceRequest serviceRequest) {
		// This method should be implemented to create a new ServiceResponse
		// TODO: Implement the logic to create a new service
		return null;
	}

	@PutMapping("/{id}")
	public ResponseEntity<ServiceResponse> updateService(@PathVariable String id, @RequestBody ServiceRequest serviceRequest) {
		// This method should be implemented to update a ServiceResponse
		// TODO: Implement the logic to update the service
		return null;
	}

	@GetMapping("/{id}")
	public ResponseEntity<ServiceResponse> getServiceById(@PathVariable String id) {
		// This method should be implemented to return a ServiceResponse by ID
		// TODO: Implement the logic to fetch the service by ID
		return null;
	}
}
