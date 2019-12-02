package ru.vlsv.shopuserui.controller.repr;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.vlsv.shopuserui.controller.validation.EmailNotRegistered;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
public class SignupForm {

    @NotBlank
    @EmailNotRegistered
    private String email;
}
