package com.aptech.mapper;

import com.aptech.domain.Viplevel;
import com.aptech.domain.ViplevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViplevelMapper {
    int countByExample(ViplevelExample example);

    int deleteByExample(ViplevelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Viplevel record);

    int insertSelective(Viplevel record);

    List<Viplevel> selectByExample(ViplevelExample example);

    Viplevel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Viplevel record, @Param("example") ViplevelExample example);

    int updateByExample(@Param("record") Viplevel record, @Param("example") ViplevelExample example);

    int updateByPrimaryKeySelective(Viplevel record);

    int updateByPrimaryKey(Viplevel record);
}