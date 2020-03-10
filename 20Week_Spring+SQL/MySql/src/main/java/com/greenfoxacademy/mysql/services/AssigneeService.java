package com.greenfoxacademy.mysql.services;

import com.greenfoxacademy.mysql.models.Assignee;
import com.greenfoxacademy.mysql.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    public Assignee findAssigneeById(Long id){
        Optional<Assignee> optional = assigneeRepository.findById(id);
        return optional.orElse(null);
    }
    public void save(Assignee assignee) {
        assigneeRepository.save(assignee);
    }

    public Assignee addAssignee(Assignee assignee) {
        return assigneeRepository.save(assignee);
    }

    public void delete (Long id){
        assigneeRepository.deleteById(id);
    }
}
