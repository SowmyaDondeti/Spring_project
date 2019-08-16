package org.launchcode.projectcycle.springproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloMessage
{
    @RequestMapping(value = "menu")
    public String helloUrlSegment(HttpServletRequest request){
        return "menu_items.html";
    }

}
