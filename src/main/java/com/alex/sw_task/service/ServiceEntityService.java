package com.alex.sw_task.service;

import com.alex.sw_task.api.dto.ServiceRequest;
import com.alex.sw_task.api.dto.ServiceResponse;

public interface ServiceEntityService {
	ServiceResponse getServiceById(String id);

	ServiceResponse updateService(String id, ServiceRequest serviceRequest);

	ServiceResponse createService(ServiceRequest serviceRequest);
}
