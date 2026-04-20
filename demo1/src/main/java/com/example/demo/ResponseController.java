package com.example.demo;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@RestController   //@RestController = @Controller 返回静态页面（视图） + @ResponseBody 返回数据
@Controller
@RequestMapping("/response")
public class ResponseController {

    @RequestMapping("/returnPage")
    public String returnPage(){
        List<Integer> list = List.of(1,2,3);

        return "/index.html"; //直接返回页面信息
    }

    @ResponseBody
    @RequestMapping("/returnHtml")
    public String returnHtml(){
        return "<h1>我是一级标题</h1>";
    }

    @ResponseBody
    @RequestMapping("/returnJson")
    public Person returnJson(){
        return new Person("lisa" , 18 , "男");
    }


    @ResponseBody
    @RequestMapping("/returnJson2")
    public Map<String , String> returnJson2(){
        Map<String , String> map = new HashMap<>();
        map.put("id" , "1");
        map.put("name" , "zhangsan");
        return map;
    }

    @ResponseBody
    @RequestMapping("/setStatus")
    public String setStatus(HttpServletResponse response){
        response.setStatus(400);
        return "设置状态码成功";
    }
}
