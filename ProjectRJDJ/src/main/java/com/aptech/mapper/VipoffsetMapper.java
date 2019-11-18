package com.aptech.mapper;

import com.aptech.domain.Vipoffset;
import com.aptech.domain.VipoffsetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VipoffsetMapper {
    int countByExample(VipoffsetExample example);

    int deleteByExample(VipoffsetExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Vipoffset record);

    int insertSelective(Vipoffset record);

    List<Vipoffset> selectByExample(VipoffsetExample example);

    Vipoffset selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Vipoffset record, @Param("example") VipoffsetExample example);

    int updateByExample(@Param("record") Vipoffset record, @Param("example") VipoffsetExample example);

    int updateByPrimaryKeySelective(Vipoffset record);

    int updateByPrimaryKey(Vipoffset record);
}