package com.example.todos;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

@MicronautTest
class ToDoControllerTest {

  @Inject
  @Client("/api/todos")
  HttpClient httpClient;

  @Test
  void save_todo() {
    ToDo toDo = new ToDo();
    toDo.setDescription("Drink Water");
    toDo.setDone(false);

    HttpResponse<ToDo> responseToDo = this.httpClient
        .toBlocking()
        .exchange(HttpRequest.POST("/", ToDo.class).body(toDo), ToDo.class);

    ToDo savedToDo = responseToDo.getBody().get();

    assertThat(responseToDo.getStatus(), equalTo(HttpStatus.OK));
    assertThat(toDo.getDescription(), equalTo(savedToDo.getDescription()));
    assertThat(toDo.getDone(), equalTo(savedToDo.getDone()));
  }


}
