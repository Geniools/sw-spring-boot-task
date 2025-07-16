package com.alex.sw_task.api.dto;

import com.alex.sw_task.repository.entity.ResourceEntity;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ServiceResponse {
	private String id;
	private List<ResourceEntity> resourceEntities;
}
