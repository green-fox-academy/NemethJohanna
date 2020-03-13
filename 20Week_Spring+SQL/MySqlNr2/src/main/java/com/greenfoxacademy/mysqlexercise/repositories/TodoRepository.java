package com.greenfoxacademy.mysqlexercise.repositories;

import com.greenfoxacademy.mysqlexercise.models.Assignee;
import com.greenfoxacademy.mysqlexercise.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

    Iterable<Todo> findAllByIsDone(Boolean isDone);
    Iterable<Todo> findByTitleContains(String title);
    Iterable<Todo> findAllByAssignee (Assignee name);
}
