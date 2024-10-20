package dev.k._llms;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZhiPuAiChatController {

    private final ChatClient chatClient;

    public ZhiPuAiChatController(@Qualifier("zhipuChatClient") ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    @GetMapping("/zhipu")
    public String zp() {
        return chatClient.prompt()
                .user("讲个笑话")
                .call()
                .content();
    }
}
