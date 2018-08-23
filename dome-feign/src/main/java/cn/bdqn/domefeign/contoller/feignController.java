package cn.bdqn.domefeign.contoller;

import cn.bdqn.domefeign.service.FeignService;
import cn.bdqn.pojo.Grade;
import cn.bdqn.pojo.yaoping;
import cn.bdqn.tigongzhe.service.GradeServiec;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class feignController {

    @Autowired
    private FeignService feignService;

    @RequestMapping(value = "getAll")
    public  String getAll(String callback){
      return  callback+"("+feignService.getAll()+")";
    }

    @RequestMapping(value = "/del/{id}")
    public String del(@PathVariable(value = "id") int id, String callback){
        System.out.print(id);
        return  callback +"("+feignService.del(id)+")";
    }

    @RequestMapping(value = "add",method = RequestMethod.POST)
    public  String add(Grade grade,String callback){
        return  callback +"("+feignService.add(grade)+")";
    }


    @RequestMapping(value = "upd",method = RequestMethod.POST)
    public  String upd(Grade grade,String callback){
        return  callback +"("+feignService.upd(grade)+")";
    }

    @RequestMapping(value = "getAll1")
    public  String getAll1(String callback){
        return  callback+"("+feignService.getAll1()+")";
    }

    @RequestMapping("add1")
    public  String add1(yaoping yaoping, String callback){
        return  callback +"("+feignService.add1(yaoping)+")";
    }


    @RequestMapping(value = "/getAllbyName/{barCode}")
    public String getAllbyName(@PathVariable(value = "barCode") int barCode,  String callback){
        System.out.print(barCode);
        return  callback +"("+feignService.getAllbyName(barCode)+")";
    }


}
