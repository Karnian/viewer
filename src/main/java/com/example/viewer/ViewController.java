package com.example.viewer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ViewController {
    @Autowired
    public ViewClient viewClient;

    @RequestMapping("/")
    public String home(){
        return "please write /status/id";
    }

    @RequestMapping("/view")
    @ResponseBody
    public String mainHome(){
        return viewClient.mainHome();
    }

    @RequestMapping("/view/{status}")
    @ResponseBody
    public String Contributors(@PathVariable String status){
        return viewClient.contributors(status);
    }

    @RequestMapping("/view/{status}/{id}")
    @ResponseBody
    public String Contributors_id(@PathVariable String status, @PathVariable String id){
        return viewClient.contributors_id(status, id);
    }



    /*
    // 1. 작성한 서비스를 가져오고
    private final TestService testService;

    // 2. 서비스를 사용하기 위한 생성자를 만들어줍니다.
    public TestController(TestService testService) {
        this.testService = testService;
    }*/
    // 1) 메인 페이지로 접근
    // 2) Feign Client가 /testfeign 으로 get 호출
    // 3) 반환값 받고 메인에서 보여줍니다.
    //@GetMapping("/")
    //public String main() {
    //    return testService.testFeign();
    //}
/*
    // Feign Client 요청에 응답을 주기 위한 컨트롤러
    @GetMapping("/testfeign")
    public String testFeign() {
        return "Hello Feign Cleint~ 찡긋";
    }

    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return testService.test();
    }*/
}
