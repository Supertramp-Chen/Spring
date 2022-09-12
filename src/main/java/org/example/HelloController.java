package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController//可以指定一个根路径
public class HelloController {
    //http://localhost:8080/search?q=spring
    //写一个search接口
    @GetMapping("/search")
    //拿到名为q的参数
    public String search(@RequestParam("q")String search) {
        return "你正在搜索" + search;
    }

}