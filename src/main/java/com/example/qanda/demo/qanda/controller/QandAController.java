package com.example.qanda.demo.qanda.controller;


import java.util.List;

import com.example.qanda.demo.qanda.model.QandAEntity;
import com.example.qanda.demo.qanda.service.QandAServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//------[CREATED BY @kushan] 2020-10-02


@RestController
@RequestMapping("/questions")
public class QandAController {

    @Autowired
    QandAServices services;

    @GetMapping
    public ResponseEntity<List<QandAEntity>> getAllQuestions(){
        List<QandAEntity> list = services.getAllQuestions();
        return new ResponseEntity<List<QandAEntity>>(list, new HttpHeaders(), HttpStatus.OK);
    }
}
