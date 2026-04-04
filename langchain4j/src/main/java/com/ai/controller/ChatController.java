package com.ai.controller;

import com.ai.model.request.ChatRequest;
import com.ai.model.response.ChatResponse;
import dev.langchain4j.model.chat.ChatModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ChatController {

    private final ChatModel chatModel;

    public ChatController(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    @PostMapping("/chat")
    public ChatResponse chatWithContext(@RequestBody ChatRequest request) {
        String aiResponse = chatModel.chat(request.message());
        return new ChatResponse(aiResponse);
    }
}
