package com.alex.sw_task.repository.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class OwnerEntity implements Serializable {
	private String id;
	private String name;
	private String accountNumber;
	private Integer level;
}
