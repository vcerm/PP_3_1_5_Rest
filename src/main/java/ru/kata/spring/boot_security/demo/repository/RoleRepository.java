package ru.kata.spring.boot_security.demo.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.kata.spring.boot_security.demo.entity.Role;

@Qualifier("Role")
public interface RoleRepository extends JpaRepository<Role, Long> {
}
