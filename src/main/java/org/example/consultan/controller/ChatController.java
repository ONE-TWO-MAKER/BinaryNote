package org.example.consultan.controller;

import dev.langchain4j.model.openai.OpenAiChatModel;
import org.example.consultan.aiservice.ConsultantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@CrossOrigin(origins = "*")
@RestController
public class ChatController {
    @Autowired
    private ConsultantService consultantService;
    @RequestMapping(value = "/chat",produces="text/html;charset=utf-8")
    public Flux<String> Chat(String message) {
        Flux<String> result=consultantService.chat(message);
        return result;
    }

//    @RequestMapping("/chat")
//    public String Chat(String message) {
//        String result=consultantService.chat(message);
//        return result;
//    }


//    @Autowired
//    private OpenAiChatModel model;
//    @RequestMapping("/chat")
//    public String Chat(String message) {
//        String result=model.chat(message);
//        return result;
//    }
}
