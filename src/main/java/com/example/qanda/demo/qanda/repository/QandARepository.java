package com.example.qanda.demo.qanda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.qanda.demo.qanda.model.QandAEntity;

//The Spring JPA comes up with a JpaRepository interface .
// This interface defines all the methods used for CRUD operations on the entity.
@Repository
public interface QandARepository extends JpaRepository<QandAEntity,Long>{

}
