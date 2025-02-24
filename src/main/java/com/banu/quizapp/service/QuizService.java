package com.banu.quizapp.service;


import com.banu.quizapp.dao.QuizDao;
import org.springframework.stereotype.Service;

@Service
public class QuizService {

    private QuizDao quizDao;

    public QuizService(QuizDao quizDao){
        this.quizDao = quizDao;
    }
}
