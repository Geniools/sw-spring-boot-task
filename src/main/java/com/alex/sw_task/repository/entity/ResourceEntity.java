package com.alex.sw_task.repository.entity;

import lombok.Data;

import java.util.List;

@Data
public class ResourceEntity {
	private String id;
	private List<OwnerEntity> owners;
}
