package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/test")
    public String test() {
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "  <head>\n" +
                "    <title>This is a title</title>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <p>Hello world!</p>\n" +
                "  </body>\n" +
                "</html>";
    }

}
