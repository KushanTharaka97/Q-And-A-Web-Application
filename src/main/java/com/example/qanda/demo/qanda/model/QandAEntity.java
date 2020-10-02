package com.example.qanda.demo.qanda.model;

import javax.persistence.*;

//Now let’s create our Model class or JPA Entity in the application.
// The model class will use to hold the data , these classes are used to structure the data in the form of JPA Entity class.
@Entity
@Table(name ="qandaTable")
public class QandAEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "question")
    private String question;

    @Column(name = "answer_a")
    private String answer_a;

    @Column(name = "answer_b")
    private String answer_b;

    @Column(name = "answer_c")
    private String answer_c;

    @Column(name = "answer_d")
    private String answer_d;

    @Column(name = "correctAnswer")
    private String correctAnswer;
}
