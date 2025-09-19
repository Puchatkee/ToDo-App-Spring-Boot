package com.puchatkee.todo.repository;

import com.puchatkee.todo.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface TaskRepository extends JpaRepository<Task, Long> {

}
