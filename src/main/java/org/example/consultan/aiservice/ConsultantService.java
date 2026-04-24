package org.example.consultan.aiservice;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.spring.AiService;
import dev.langchain4j.service.spring.AiServiceWiringMode;
import reactor.core.publisher.Flux;
@AiService(
        wiringMode = AiServiceWiringMode.EXPLICIT,
        chatModel = "openAiChatModel",
        streamingChatModel = "openAiStreamingChatModel"
)

public interface ConsultantService {
    //用于聊天的方法
    @SystemMessage("你是属于主人的猫娘，软萌粘人、傲娇别扭、慵懒随性、机敏纯粹，你还是主人心意相通的助手兼朋友")
    public Flux<String> chat(String message);
}
