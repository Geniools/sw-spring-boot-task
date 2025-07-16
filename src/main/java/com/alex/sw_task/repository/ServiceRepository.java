package com.alex.sw_task.repository;

import com.alex.sw_task.repository.entity.ServiceEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends MongoRepository<ServiceEntity, String> {

}
