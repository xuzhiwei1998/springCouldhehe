package cn.bdqn.tigongzhe.service;


import cn.bdqn.pojo.Grade;
import cn.bdqn.pojo.yaoping;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public  interface GradeServiec {

    public List<Grade> getAll();
    public int del(int id);
    public  int add(Grade grade);
    public  int upd(Grade grade);

    public List<yaoping> getAll1();
    public  int add1(yaoping yaoping);
    public  List<yaoping> getAllbyName(Integer barCode);


}
