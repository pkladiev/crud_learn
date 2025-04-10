package ru.kladiev.core_service.repository;

import ru.kladiev.core_service.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // Spring Data JPA автоматически создаст реализацию
}