package com.example.sample2;
 
import java.util.Calendar;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
 
@Entity
public class MessageData implements DataInterface {
 
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column
  private long id;
   
  @Column(length=50, nullable=false)
  private String name;
 
  @Column(length=255, nullable=false)
  private String message;
   
  @Column
  private Date posted;
 
  public MessageData() {
    super();
    this.posted = Calendar.getInstance().getTime();
  }
   
  public MessageData(long id, String name, String message) {
    this();
    this.id = id;
    this.name = name;
    this.message = message;
  }
 
  public long getId() {
    return id;
  }
 
  public void setId(long id) {
    this.id = id;
  }
 
  public String getName() {
    return name;
  }
 
  public void setName(String name) {
    this.name = name;
  }
 
  public String getMessage() {
    return message;
  }
 
  public void setMessage(String message) {
    this.message = message;
  }
 
  public Date getPosted() {
    return posted;
  }
 
  public void setPosted(Date posted) {
    this.posted = posted;
  }
}        
