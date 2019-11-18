package com.aptech.mapper;

import com.aptech.domain.Viprecharge;
import com.aptech.domain.ViprechargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViprechargeMapper {
    int countByExample(ViprechargeExample example);

    int deleteByExample(ViprechargeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Viprecharge record);

    int insertSelective(Viprecharge record);

    List<Viprecharge> selectByExample(ViprechargeExample example);

    Viprecharge selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Viprecharge record, @Param("example") ViprechargeExample example);

    int updateByExample(@Param("record") Viprecharge record, @Param("example") ViprechargeExample example);

    int updateByPrimaryKeySelective(Viprecharge record);

    int updateByPrimaryKey(Viprecharge record);
}