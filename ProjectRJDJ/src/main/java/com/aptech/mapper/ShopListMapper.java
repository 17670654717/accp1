package com.aptech.mapper;

import com.aptech.domain.ShopList;
import com.aptech.domain.ShopListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopListMapper {
    int countByExample(ShopListExample example);

    int deleteByExample(ShopListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopList shop);

    int insertSelective(ShopList record);

    List<ShopList> selectByExample(ShopListExample example);
    
    List<ShopList> selectByUaccount(String uaccount);

    ShopList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopList record, @Param("example") ShopListExample example);

    int updateByExample(@Param("record") ShopList record, @Param("example") ShopListExample example);

    int updateByPrimaryKeySelective(ShopList record);

    int updateByPrimaryKey(ShopList record);
}