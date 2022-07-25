package com.example.todos;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

class ToDoControllerShould {
  private final ToDoService toDoService = mock(ToDoService.class);

  @Test
  void should_add_todo() {
    ToDoController toDoController = new ToDoController(toDoService);
    ToDo toDo = new ToDo();
    ToDo savedToDo = toDoController.saveToDo(toDo);
    verify(toDoService).save(toDo);
  }

}
