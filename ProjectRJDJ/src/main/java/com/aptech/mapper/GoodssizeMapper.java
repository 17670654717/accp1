package com.aptech.mapper;

import com.aptech.domain.Goodssize;
import com.aptech.domain.GoodssizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodssizeMapper {
    int countByExample(GoodssizeExample example);

    int deleteByExample(GoodssizeExample example);

    int deleteByPrimaryKey(Integer goodssizeid);

    int insert(Goodssize record);

    int insertSelective(Goodssize record);

    List<Goodssize> selectByExample(GoodssizeExample example);

    Goodssize selectByPrimaryKey(Integer goodssizeid);

    int updateByExampleSelective(@Param("record") Goodssize record, @Param("example") GoodssizeExample example);

    int updateByExample(@Param("record") Goodssize record, @Param("example") GoodssizeExample example);

    int updateByPrimaryKeySelective(Goodssize record);

    int updateByPrimaryKey(Goodssize record);
}