package ru.vlsv.shopuserui.websocket;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class ChatMessage {

    private String username;

    private String message;

    private LocalDateTime localDateTime;

    public ChatMessage(String username, String message) {
        this();
        this.username = username;
        this.message = message;
    }

    @Override
    public String toString() {
        return "ChatMessage{" +
                "username='" + username + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
