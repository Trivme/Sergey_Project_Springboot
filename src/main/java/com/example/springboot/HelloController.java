package com.example.springboot;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                 "<body>\n" +
                    "<h2>Login page</h2>\n" +
                    "<form action=\"/login\" method=\"get\">" +
                    "Login:    <input type=\"text\" name=\"login\"><br>" +
                    "Password: <input type=\"password\" name=\"password\"><br>" +
                    "<input type=\"submit\" name=\"Submit\">"+
                    "</form>" +
                 "</body>\n" +
                "</html>\n";
    }

    @RequestMapping("/login")
    @ResponseBody
        public String login(@RequestParam String login, @RequestParam String password) {
            System.out.println("Login :" + login);
            System.out.println("Password :" + password);
            return "Login: " + login + "       "  + "Password: " + password ;
        }

    @RequestMapping("/test")
    public String test() {
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                  "<head>\n" +
                    "<title>tesT Page</title>\n" +
                  "</head>\n" +
                  "<body>\n" +
                    "<h1>Java is cool!</h1>\n" +
                  "</body>\n" +
                "</html>";
    }

}
