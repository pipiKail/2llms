package dev.k._llms;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.ai.zhipuai.ZhiPuAiChatModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public ChatClient openAIChatClient(OpenAiChatModel chatModel) {
		return ChatClient.create(chatModel);
	}

//	@Bean
//	public ChatClient anthropicChatClient(AnthropicChatModel chatModel) {
//		return ChatClient.create(chatModel);
//	}

	@Bean
	public ChatClient zhipuChatClient(ZhiPuAiChatModel chatModel) {
		return ChatClient.create(chatModel);
	}

}
