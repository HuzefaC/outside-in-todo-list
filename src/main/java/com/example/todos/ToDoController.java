package com.example.todos;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

@Controller("/api/todos")
public class ToDoController {

  private ToDoService toDoService;

  public ToDoController(ToDoService toDoService) {
    this.toDoService = toDoService;
  }

  @Post("/")
  public ToDo saveToDo(@Body ToDo toDo) {
    return this.toDoService.save(toDo);
  }
}
