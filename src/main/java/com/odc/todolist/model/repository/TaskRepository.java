package com.odc.todolist.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odc.todolist.model.Task;

public interface TaskRepository extends JpaRepository<Task, Integer>{

    
}
