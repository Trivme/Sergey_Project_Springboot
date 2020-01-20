package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Controller {

    @RequestMapping("/")
    public String index() {
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "<h2>Login to your account</h2>" +
                    "<form>" +
                    "Login: <input type=\"text\" name=\"login\"><br>" +
                    "Password: <input type=\"password\" name=\"password\"><br>" +
                    "<input type=\"submit\" name=\"Submit\">"+
                    "</form>" +
                "</body>\n" +
                "</html>\n";
    }

    @RequestMapping("/test")
    public String test() {
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "  <head>\n" +
                "    <title>tesT Page</title>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <h1>Java is cool!</h1>\n" +
                "  </body>\n" +
                "</html>";
    }

}
