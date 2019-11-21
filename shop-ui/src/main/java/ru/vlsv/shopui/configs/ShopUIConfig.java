package ru.vlsv.shopui.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * GeekBrains Java, Shop.
 *
 * @author Anatoly Lebedev
 * @version 1.0.0 21.11.2019
 * @link https://github.com/Centnerman
 */

@Configuration
@PropertySource("classpath:private.properties")
@ComponentScan("ru.vlsv.shopui")
public class ShopUIConfig {
}
