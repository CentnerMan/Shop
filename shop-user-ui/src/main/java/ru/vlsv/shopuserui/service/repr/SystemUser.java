package ru.vlsv.shopuserui.service.repr;


import lombok.Data;
import lombok.NoArgsConstructor;
import ru.vlsv.shopdatabase.entities.Role;
import ru.vlsv.shopdatabase.entities.User;

import java.io.Serializable;
import java.util.Set;

@Data
@NoArgsConstructor
public class SystemUser implements Serializable {

    private Long id;

    private String username;

    private String password;

    private String firstName;

    private String lastName;

    private String email;

    private Set<Role> roles;

    public SystemUser(String username, String password, String firstName,
                      String lastName, String email) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public SystemUser(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
        this.roles = user.getRoles();
    }
}
