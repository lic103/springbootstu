package com.example.demo.service.impl;

import com.example.demo.mapper.AreaMapper;
import com.example.demo.model.Area;
import com.example.demo.service.AreaService;
import com.example.demo.service.DataBaseDAO;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AreaServiceImpl extends DataBaseDAO implements AreaService {

    @Autowired
    private AreaMapper areaMapper;
    @Override
    public int addArea(Area area) {
        return areaMapper.insertSelective(area);
    }
    @Override
    public int editArea(Area area) {
        return areaMapper.updateByPrimaryKeySelective(area);
    }

/*    @Override
    public List<Area> findAllArea(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        return areaMapper.selectAllArea();
    }*/

    @Override
    public int deleteArea(Integer areaId) {
        return areaMapper.deleteByPrimaryKey(areaId);
    }

    @Override
    public Area getArea(Integer areaId) {
        return areaMapper.selectByPrimaryKey(areaId);
    }
}
