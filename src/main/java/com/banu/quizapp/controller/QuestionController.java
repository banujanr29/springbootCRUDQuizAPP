package com.banu.quizapp.controller;

import com.banu.quizapp.model.Question;
import com.banu.quizapp.service.QuestionService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {


     private final QuestionService questionService;

     public QuestionController(QuestionService questionService) {
         this.questionService = questionService;
     }

    @GetMapping("/allQuestions")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("/difficulty/{difficultylevel}")
    public List<Question> getQuestionsByDifficulty(@PathVariable String difficultylevel) {
        return questionService.getQuestionByDifficulty(difficultylevel);
    }

    @PostMapping("/addQuestion")
    public String addQuestion(@RequestBody Question question) {
         return questionService.addQuestion(question);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteQuestion(@PathVariable Integer id) {
         return questionService.deleteQuestion(id);
    }



}
