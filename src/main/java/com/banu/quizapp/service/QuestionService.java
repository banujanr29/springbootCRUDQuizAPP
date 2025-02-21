package com.banu.quizapp.service;


import com.banu.quizapp.model.Question;
import com.banu.quizapp.dao.QuestionDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {


     private final QuestionDao questionDao;

     public QuestionService(QuestionDao questionDao) {
         this.questionDao = questionDao;
     }

    public List<Question> getAllQuestions() {
        return questionDao.findAll();


    }

    public List<Question> getQuestionByDifficulty(String difficultylevel) {
        return questionDao.findByDifficultylevel(difficultylevel);
    }


    public String addQuestion(Question question) {
         questionDao.save(question);
         return "success";

    }

    public String deleteQuestion(Integer id) {
         questionDao.deleteById(id);
         return "deleted";
    }
}
