package com.alex.sw_task.api.dto;

import com.alex.sw_task.repository.entity.ResourceEntity;
import lombok.Data;

import java.util.List;

@Data
public class ServiceRequest {
	private String id;
	private List<ResourceEntity> resources;
}
