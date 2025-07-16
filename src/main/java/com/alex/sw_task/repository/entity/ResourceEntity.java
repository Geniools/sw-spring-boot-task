package com.alex.sw_task.repository.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ResourceEntity implements Serializable {
	private String id;
	private List<OwnerEntity> owners;
}
