package com.example.todos;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

class ToDoServiceShould {

  private final ToDoRepository toDoRepository = mock(ToDoRepository.class);

  @Test
  void should_save_todo() {
    ToDoService toDoService = new ToDoService(toDoRepository);
    ToDo toDo = new ToDo();

    toDoService.save(toDo);

    verify(toDoRepository).save(toDo);
  }
}
