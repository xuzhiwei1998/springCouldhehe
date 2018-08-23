package cn.bdqn.tigongzhe.service.impl;

import cn.bdqn.pojo.Grade;
import cn.bdqn.pojo.yaoping;
import cn.bdqn.tigongzhe.dao.GradeDao;
import cn.bdqn.tigongzhe.service.GradeServiec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("gradeService")
public class GradeServiceImpl implements GradeServiec {
    @Autowired
    private GradeDao gradeDao;

    public List<Grade> getAll() {
        return gradeDao.getAll();
    }

    @Override
    public int del(int id) {
        return gradeDao.del(id);
    }

    @Override
    public int add(Grade grade) {
        return gradeDao.add(grade);
    }

    @Override
    public int upd(Grade grade) {
        return gradeDao.upd(grade);
    }

    @Override
    public List<yaoping> getAll1() {
        return gradeDao.getAll1();
    }


    @Override
    public int add1(yaoping yaoping) {
        return gradeDao.add1(yaoping);
    }

    @Override
    public List<yaoping> getAllbyName(Integer barCode) {
        return gradeDao.getAllbyName(barCode);
    }
}
