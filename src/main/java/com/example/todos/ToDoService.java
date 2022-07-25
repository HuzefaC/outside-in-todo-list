package com.example.todos;

import jakarta.inject.Singleton;

@Singleton
public class ToDoService {

  private final ToDoRepository toDoRepository;

  public ToDoService(ToDoRepository toDoRepository) {
    this.toDoRepository = toDoRepository;
  }

  public ToDo save(ToDo toDo) {
    return toDoRepository.save(toDo);
  }
}
