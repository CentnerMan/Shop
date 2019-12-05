package ru.vlsv.shopuserui.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.vlsv.shopuserui.service.repr.SystemUser;

import java.util.List;
import java.util.Optional;

public interface UserService extends UserDetailsService {

    Optional<SystemUser> findById(Long id);

    Optional<SystemUser> findByUserName(String username);

    boolean existsUserByEmail(String email);

    boolean save(SystemUser systemUser);

    void delete(Long id);

    List<SystemUser> findAll();
}