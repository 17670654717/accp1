package com.aptech.mapper;

import com.aptech.domain.Goods;
import com.aptech.domain.GoodsExample;
import com.aptech.domain.goods_2;
import com.aptech.domain.goodsonline;
import com.aptech.domain.goodstype_2;
import com.aptech.domain.ljhgoods;

import java.util.List;

import javax.validation.constraints.Pattern;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface GoodsMapper {
    int countByExample(GoodsExample example);

    int deleteByExample(GoodsExample example);

    int deleteByPrimaryKey(Integer goodsid);

    int insert(Goods record);

    int insertSelective(Goods record);

    List<Goods> selectByExample(GoodsExample example);

    Goods selectByPrimaryKey(Integer goodsid);

    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
    
    ljhgoods selectgoodsid(Integer goodsid);
    
    List<Goods> selectgoood();
    
    @Select("select * from goods")
    List<ljhgoods> selectsy();
    
    @Select("SELECT a.`Goodsid`,a.`Goodsname`,a.`barcode`,a.`specification`,a.`inventory`,d.`GoodsTypename`,a.`sales_price`,a.`cost_price`,a.`online_store`,a.`picture`,\r\n" + 
    		"a.`brand`,b.`color`,c.`size`,a.`Goodsmessage` FROM goods a\r\n" + 
    		"JOIN goodscolor b ON a.`Goodscolorid`=b.`Goodscolorid`\r\n" + 
    		"JOIN goodssize c ON a.`Goodssizeid`=c.`Goodssizeid`\r\n" + 
    		"JOIN goodstype d ON a.`GoodsTypeid` = d.`GoodsTypeid`\r\n" + 
    		"WHERE a.`online_store` like #{online} AND d.`GoodsTypename` like #{goodstypename} AND (a.`Goodsname` LIKE #{name} OR a.`barcode` LIKE #{name})")
    List<goods_2> querygoods_2(@Param("online")String online,@Param("goodstypename")String goodstypename,@Param("name")String name);
    
    @Select("SELECT a.`Goodsid`,a.`Goodsname`,a.`barcode`,a.`specification`,a.`inventory`,d.`GoodsTypename`,a.`sales_price`,a.`cost_price`,a.`online_store`,a.`picture`,\r\n" + 
    		"a.`brand`,b.`color`,c.`size`,a.`Goodsmessage` FROM goods a\r\n" + 
    		"JOIN goodscolor b ON a.`Goodscolorid`=b.`Goodscolorid`\r\n" + 
    		"JOIN goodssize c ON a.`Goodssizeid`=c.`Goodssizeid`\r\n" + 
    		"JOIN goodstype d ON a.`GoodsTypeid` = d.`GoodsTypeid`\r\n" + 
    		"WHERE a.Goodsid=#{id}")
    goods_2 querygoods_2byid(@Param("id")Integer id);
    
    @Select("SELECT online_store FROM goods GROUP BY online_store")
    List<goodsonline> querygoodsonline_2();
    
    @Select("SELECT * FROM goodstype")
    List<goodstype_2> querygoodstypename_2();
}