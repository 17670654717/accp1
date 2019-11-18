package com.aptech.mapper;

import com.aptech.domain.Vipdeal;
import com.aptech.domain.VipdealExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VipdealMapper {
    int countByExample(VipdealExample example);

    int deleteByExample(VipdealExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Vipdeal record);

    int insertSelective(Vipdeal record);

    List<Vipdeal> selectByExample(VipdealExample example);

    Vipdeal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Vipdeal record, @Param("example") VipdealExample example);

    int updateByExample(@Param("record") Vipdeal record, @Param("example") VipdealExample example);

    int updateByPrimaryKeySelective(Vipdeal record);

    int updateByPrimaryKey(Vipdeal record);
}