package com.example.demo.mapper;

import com.example.demo.model.Area;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;


public interface AreaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_area
     *
     * @mbggenerated Tue Jul 03 15:06:33 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_area
     *
     * @mbggenerated Tue Jul 03 15:06:33 CST 2018
     */
    int insert(Area record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_area
     *
     * @mbggenerated Tue Jul 03 15:06:33 CST 2018
     */
    int insertSelective(Area record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_area
     *
     * @mbggenerated Tue Jul 03 15:06:33 CST 2018
     */
    Area selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_area
     *
     * @mbggenerated Tue Jul 03 15:06:33 CST 2018
     */
    int updateByPrimaryKeySelective(Area record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_area
     *
     * @mbggenerated Tue Jul 03 15:06:33 CST 2018
     */
    int updateByPrimaryKey(Area record);

}