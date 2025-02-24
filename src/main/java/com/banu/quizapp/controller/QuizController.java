package com.banu.quizapp.controller;

import com.banu.quizapp.model.QuestionWrapper;
import com.banu.quizapp.model.Quiz;
import com.banu.quizapp.service.QuizService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private QuizService quizService;
    public QuizController(QuizService quizService) {
        this.quizService = quizService;;
    }

    @PostMapping("/create")
    public ResponseEntity<String> createQuiz(@RequestParam String difficultylevel, @RequestParam Integer numQ, @RequestParam String title) {
        return quizService.createQuiz(difficultylevel, numQ, title);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable Integer id) {
        return quizService.getQuizQuestion(id);
    }

}
