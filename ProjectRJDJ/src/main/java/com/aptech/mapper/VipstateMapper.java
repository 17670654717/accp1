package com.aptech.mapper;

import com.aptech.domain.Vipstate;
import com.aptech.domain.VipstateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VipstateMapper {
    int countByExample(VipstateExample example);

    int deleteByExample(VipstateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Vipstate record);

    int insertSelective(Vipstate record);

    List<Vipstate> selectByExample(VipstateExample example);

    Vipstate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Vipstate record, @Param("example") VipstateExample example);

    int updateByExample(@Param("record") Vipstate record, @Param("example") VipstateExample example);

    int updateByPrimaryKeySelective(Vipstate record);

    int updateByPrimaryKey(Vipstate record);
}