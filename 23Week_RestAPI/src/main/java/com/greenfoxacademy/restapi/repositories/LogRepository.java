package com.greenfoxacademy.restapi.repositories;

import com.greenfoxacademy.restapi.models.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository<Log, Long> {

}
