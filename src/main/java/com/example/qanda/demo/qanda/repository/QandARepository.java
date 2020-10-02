package com.example.qanda.demo.qanda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.qanda.demo.qanda.model.QandAEntity;

@Repository
public interface QandARepository extends JpaRepository<QandAEntity,Long>{

}
