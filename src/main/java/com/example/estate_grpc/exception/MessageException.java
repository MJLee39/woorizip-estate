package com.example.estate_grpc.exception;

public class MessageException extends Exception{
    public MessageException() {}

    public MessageException(String message) {
        super(message);
    }
}
