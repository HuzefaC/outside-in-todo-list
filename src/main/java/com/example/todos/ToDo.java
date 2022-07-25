package com.example.todos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ToDo {

  @Id
  @GeneratedValue
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "description", nullable = false)
  private String description;

  @Column(name = "isDone", nullable = false)
  private Boolean isDone;

  public ToDo() {
    //Micronaut Data requires a empty constructor implementation
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Boolean getDone() {
    return isDone;
  }

  public void setDone(Boolean done) {
    isDone = done;
  }

  public Long getId() {
    return id;
  }
}
