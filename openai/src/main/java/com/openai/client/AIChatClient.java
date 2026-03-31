package com.openai.client;

import com.openai.entity.StateRecordData;

public interface AIChatClient {
    String conversationalChat(String input, int conversationId);
    StateRecordData retrieve(String input);
}
