package com.actorandfilm.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MainController {
    @GetMapping({"", "/"})
    public String main(){
        return "index";
    }
}
