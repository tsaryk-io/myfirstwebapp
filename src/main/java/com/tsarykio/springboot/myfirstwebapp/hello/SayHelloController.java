package com.tsarykio.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    // creating "say-hello" => "Hello! What are you learning today?"
    // http://localhost:8080/say-hello
    @RequestMapping("say-hello")
    @ResponseBody // because a simple String cannot be returned, needs a view
    public String sayHello() {
        return "Hello! What are you learning today?";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody // because a simple String cannot be returned, needs a view
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>Something</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("Something body");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }

    // "say-hello-jsp" -> sayHello.jsp

    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp(){
        return "sayHello";
    }
}
