package com.alex.sw_task.api;

import com.alex.sw_task.api.dto.ServiceRequest;
import com.alex.sw_task.api.dto.ServiceResponse;
import com.alex.sw_task.service.ServiceEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/services")
@CrossOrigin(maxAge = 3600)
public class ServiceController {
	private final ServiceEntityService serviceEntityService;

	@Autowired
	public ServiceController(ServiceEntityService serviceEntityService) {
		this.serviceEntityService = serviceEntityService;
	}

	@PostMapping
	public ResponseEntity<ServiceResponse> createService(@RequestBody ServiceRequest serviceRequest) {
		ServiceResponse serviceResponse = this.serviceEntityService.createService(serviceRequest);
		return new ResponseEntity<>(serviceResponse, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<ServiceResponse> updateService(@PathVariable String id, @RequestBody ServiceRequest serviceRequest) {
		ServiceResponse updatedService = this.serviceEntityService.updateService(id, serviceRequest);
		return new ResponseEntity<>(updatedService, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ServiceResponse> getServiceById(@PathVariable String id) {
		ServiceResponse serviceResponse = this.serviceEntityService.getServiceById(id);
		return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
	}
}
