package com.aptech.mapper;

import com.aptech.domain.Vipintegral;
import com.aptech.domain.VipintegralExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VipintegralMapper {
    int countByExample(VipintegralExample example);

    int deleteByExample(VipintegralExample example);

    int deleteByPrimaryKey(String vipid);

    int insert(Vipintegral record);

    int insertSelective(Vipintegral record);

    List<Vipintegral> selectByExample(VipintegralExample example);

    Vipintegral selectByPrimaryKey(String vipid);

    int updateByExampleSelective(@Param("record") Vipintegral record, @Param("example") VipintegralExample example);

    int updateByExample(@Param("record") Vipintegral record, @Param("example") VipintegralExample example);

    int updateByPrimaryKeySelective(Vipintegral record);

    int updateByPrimaryKey(Vipintegral record);
}