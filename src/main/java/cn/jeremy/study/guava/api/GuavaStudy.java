package cn.jeremy.study.guava.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guava")
public class GuavaStudy
{

    @RequestMapping("hello")
    String hello()
    {
        return "hello";
    }
}
