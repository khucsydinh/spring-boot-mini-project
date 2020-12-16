package com.example.demo.repository;

import com.example.demo.entity.QuestionTestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionTestRepository extends JpaRepository<QuestionTestEntity,Integer> {
    public List<QuestionTestEntity> findAll();
    public List<QuestionTestEntity> findAllByTest_Id(Integer id);
}
