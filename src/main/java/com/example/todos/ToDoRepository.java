package com.example.todos;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {

}
