package com.greenfoxacademy.mysqlexercise.repositories;

import com.greenfoxacademy.mysqlexercise.models.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {

    Assignee findByName(String name);

}
