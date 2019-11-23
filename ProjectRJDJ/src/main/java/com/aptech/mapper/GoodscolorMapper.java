package com.aptech.mapper;

import com.aptech.domain.Goodscolor;
import com.aptech.domain.GoodscolorExample;
import com.aptech.domain.Goodssize;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface GoodscolorMapper {
    int countByExample(GoodscolorExample example);

    int deleteByExample(GoodscolorExample example);

    int deleteByPrimaryKey(Integer goodscolorid);

    int insert(Goodscolor record);

    int insertSelective(Goodscolor record);

    List<Goodscolor> selectByExample(GoodscolorExample example);

    Goodscolor selectByPrimaryKey(Integer goodscolorid);

    int updateByExampleSelective(@Param("record") Goodscolor record, @Param("example") GoodscolorExample example);

    int updateByExample(@Param("record") Goodscolor record, @Param("example") GoodscolorExample example);

    int updateByPrimaryKeySelective(Goodscolor record);

    int updateByPrimaryKey(Goodscolor record);
    @Select("select * from goodscolor where color = #{name}")
    Goodscolor querycolorbyname(@Param("name")String name);
    
    @Select("select * from goodssize where size = #{name}")
    Goodssize querysizebyname(@Param("name")String name);
}