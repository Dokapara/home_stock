  package com.example.sample2.repository;
 
  import java.util.List;
   
  import org.springframework.data.jpa.repository.JpaRepository;
  import org.springframework.stereotype.Repository;
   
  import com.example.sample2.MessageData;
   
  @Repository
  public interface MessageDataRepository 
      extends JpaRepository<MessageData, Long> {
   
    public List<messagedata> findAllByOrderByPostedDesc();
  }        
</messagedata>
