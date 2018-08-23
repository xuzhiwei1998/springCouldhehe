2package cn.bdqn.html.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class htmlController {

    @RequestMapping("warehousing")
    public  String warehousing(){
        return "warehousing";
    }

    @RequestMapping("show")
    public  String t(){
        return "show";
    }

    @RequestMapping("cashier")
    public  String cashier(){
        return "cashier";
    }



}
