package cn.bdqn.xiaofeizhe1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class sumController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("getAll")
    public  String getAll(String callback){
       String info =  restTemplate.getForObject("http://TIGONGZHE/getAll",String.class);
       return  callback+"("+info+")";
    }
}
