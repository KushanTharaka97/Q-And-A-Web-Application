package com.example.qanda.demo.qanda.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.qanda.demo.qanda.model.QandAEntity;
import com.example.qanda.demo.qanda.repository.QandARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//------[CREATED BY @kushan] 2020-10-02

@Service
public class QandAServices {

//    at the moment I have implemented only one service ,
//    we have to develop tthis in really broadway manner
    @Autowired
    QandARepository repository;

    public List<QandAEntity> getAllQuestions(){
        List<QandAEntity> questionList = repository.findAll();

        if(questionList.size()>0){
            return  questionList;
        }else{
            return new ArrayList<QandAEntity>();
        }

    }
}
