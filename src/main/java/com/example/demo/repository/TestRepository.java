package com.example.demo.repository;

import com.example.demo.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TestRepository extends JpaRepository<TestEntity,Integer> {
    @Query(value = "select * from tbl_tests where test_name = :name",nativeQuery=true)
    Optional<TestEntity> findByName(String name);

}