package cn.bdqn.tigongzhe.controller;

import cn.bdqn.pojo.Grade;
import cn.bdqn.pojo.yaoping;
import cn.bdqn.tigongzhe.service.GradeServiec;
import com.alibaba.fastjson.JSON;
import jdk.nashorn.internal.objects.NativeJSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.lang.reflect.Method;
import java.util.List;


@RestController
public class GradeController {

   @Autowired
    private GradeServiec gradeServiec;

   @RequestMapping(value = "getAll")
    public  String getAll(){
        List<Grade>   list = gradeServiec.getAll();
        return JSON.toJSONString(list);

    }
    @ResponseBody
    @RequestMapping(value = "/del/{id}")
    public  String del( @PathVariable int id){

       return JSON.toJSONString(gradeServiec.del(id));

    }

    @RequestMapping( value = "add")
    public  String add( @RequestBody Grade grade){
        return JSON.toJSONString(gradeServiec.add(grade));

    }


    @ResponseBody
    @RequestMapping(value = "upd" ,method = RequestMethod.POST)
    public  String upd(Grade grade){
        return JSON.toJSONString(gradeServiec.upd(grade));

    }

    @RequestMapping(value = "getAll1")
    public  String getAll1(){
        List<yaoping>   list = gradeServiec.getAll1();
        return JSON.toJSONString(list);

    }

    @RequestMapping("add1")
    public  String add1( @RequestBody yaoping yaoping){
        return JSON.toJSONString(gradeServiec.add1(yaoping));

    }


    @ResponseBody
    @RequestMapping(value = "/getAllbyName/{barCode}")
    public  String getAllbyName( @PathVariable Integer barCode){

        return JSON.toJSONString(gradeServiec.getAllbyName(barCode));

    }




}
