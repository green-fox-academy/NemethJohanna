package com.greenfoxacademy.mysql.repositories;

import com.greenfoxacademy.mysql.models.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {

}
