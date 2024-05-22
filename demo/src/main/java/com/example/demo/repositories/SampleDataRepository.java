package com.example.demo.repositories;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.SampleData;
 
@Repository
public interface SampleDataRepository 
      extends JpaRepository<SampleData, Long> {
   public List<SampleData> findByName(String find);
    
    
    }     
//public interface SampleDataRepository 
//    extends JpaRepository<SampleData, Long> {
// 

