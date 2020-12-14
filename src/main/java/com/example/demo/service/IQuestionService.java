package com.example.demo.service;

import com.example.demo.entity.QuestionEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface IQuestionService {
    public ResponseEntity<?> findAll();
    public Optional<QuestionEntity> findById(Integer id);
    public void deleteById(Integer id);
    public void save(QuestionEntity question,Integer id);
    public void saveAll(List<QuestionEntity> questionEntityList,Character lv) ;

}
