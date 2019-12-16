package ru.vlsv.shopdatabase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vlsv.shopdatabase.entities.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findUserByUsername(String userName);

    boolean existsUserByEmail(String email);

    Optional<User> findUserByEmail(String email);
}
