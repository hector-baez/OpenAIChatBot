package com.example.chatscreen.model

sealed class MessageType {
    data class User(val text: String, var isError: Boolean = false): MessageType()
    data class Bot(val text: String): MessageType()
    object Loading: MessageType()
}