package com.alex.sw_task.api.dto;

import com.alex.sw_task.repository.entity.ResourceEntity;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
public class ServiceResponse implements Serializable {
	private String id;
	private List<ResourceEntity> resources;
}
