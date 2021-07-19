package com.example.springbootkotlin;

import org.springframework.stereotype.Service;


@Service
public class MessageService(val db: MessageRepository) {

    fun findMessages(): List<Message> = db.findMessages()

    fun post(message: Message){
        db.save(message)
    }
}
