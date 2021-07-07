package ru.vlsv.shopdatabase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlsv.shopdatabase.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
