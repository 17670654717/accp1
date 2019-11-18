package com.aptech.mapper;

import com.aptech.domain.Vipinfo;
import com.aptech.domain.VipinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VipinfoMapper {
    int countByExample(VipinfoExample example);

    int deleteByExample(VipinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Vipinfo record);

    int insertSelective(Vipinfo record);

    List<Vipinfo> selectByExample(VipinfoExample example);

    Vipinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Vipinfo record, @Param("example") VipinfoExample example);

    int updateByExample(@Param("record") Vipinfo record, @Param("example") VipinfoExample example);

    int updateByPrimaryKeySelective(Vipinfo record);

    int updateByPrimaryKey(Vipinfo record);
}