package ru.gb.mychat.mychat.server;

// лаунчер
public class ChatRunner {

    public static void main(String[] args) {
        ChatServer server = new ChatServer();
        server.run();
    }
}