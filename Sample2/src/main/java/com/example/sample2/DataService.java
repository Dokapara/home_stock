package com.example.sample2;
 
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.sample2.repository.MessageDataRepository;
@Transactional
@Service
public class DataService {
  @Autowired
  MessageDataRepository repository;
   
  public DataService() {
    super();
  }
   
  public List<? extends DataInterface> getAll() {
    return repository.findAllByOrderByPostedDesc();
  }
   
  public DataInterface getById(long id) {
    Optional<? extends DataInterface> op = repository.findById(id);
    return op.get();
  }
   
  public void add(DataInterface item) {
    repository.saveAndFlush((MessageData)item);
  }
}        
