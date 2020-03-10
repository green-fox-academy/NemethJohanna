package com.greenfoxacademy.mysql.services;

import com.greenfoxacademy.mysql.models.Assignee;
import com.greenfoxacademy.mysql.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssigneeService {

    private AssigneeRepository assigneeRepository;

    @Autowired
    public AssigneeService(AssigneeRepository assigneeRepository) {
        this.assigneeRepository = assigneeRepository;
    }

    public Iterable<Assignee> list() {
        return assigneeRepository.findAll();
    }
}
