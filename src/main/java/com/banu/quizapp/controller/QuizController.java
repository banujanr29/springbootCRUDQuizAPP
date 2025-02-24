package com.banu.quizapp.controller;

import com.banu.quizapp.service.QuizService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private QuizService quizService;
    public QuizController(QuizService quizService) {
        this.quizService = quizService;;
    }

    @PostMapping("/create")
    public ResponseEntity<String> createQuiz(@RequestParam String difficultylevel, @RequestParam int numQ, @RequestParam String title) {
        return createQuiz(difficultylevel, numQ, title);
    }

}
