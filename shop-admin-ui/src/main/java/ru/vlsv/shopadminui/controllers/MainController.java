package ru.vlsv.shopadminui.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * GeekBrains Java, Shop.
 *
 * @author Anatoly Lebedev
 * @version 1.0.0 20.11.2019
 * @link https://github.com/Centnerman
 */

@Controller
public class MainController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/index")
    public String indexFrom() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
