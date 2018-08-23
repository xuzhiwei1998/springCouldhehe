package cn.bdqn.domefeign.service;

import cn.bdqn.pojo.Grade;
import cn.bdqn.pojo.yaoping;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
@FeignClient("tigongzhe")
public interface FeignService {
     @RequestMapping("getAll")
     public  String getAll();



    @RequestMapping("getAll1")
    public  String getAll1();



    @RequestMapping("add1")
    public  String add1(@RequestBody yaoping yaping);

    @ResponseBody
    @RequestMapping("getAllbyName/{barCode}")
    public  String getAllbyName(@PathVariable(value = "barCode") int barCode);

    @ResponseBody
    @RequestMapping("del/{id}")
    public  String del(@PathVariable(value = "id") int id);

    @ResponseBody
    @RequestMapping("add")
    public  String add(@RequestBody Grade grade);

    @ResponseBody
    @RequestMapping("upd")
    public  String upd(@RequestBody Grade grade);
}
