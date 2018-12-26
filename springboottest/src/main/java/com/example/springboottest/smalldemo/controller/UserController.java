package com.example.springboottest.smalldemo.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @RestController=@Controller+@ResponseBody
 * 相当于对类中每个方法都添加了@ResponseBody,不能返回页面(@ResponseBody注解不能返回页面)
 * 请求路径映射注解，新的注解定义：@GetMapping @PutMapping @PostMapping @DeleteMapping
 * @GetMapping=@RequestMapping（Method=GET）
 * @Auther: WangHuidong
 * @Date: 2018/12/25
 * @Description:
 */
//@Controller
@RestController
public class UserController {

    //@ResponseBody
    //@RequestMapping("/hello")
    @GetMapping("/hello")
    public String sayHello(){
        return "这里是SpringBoot测试!";
    }
}
