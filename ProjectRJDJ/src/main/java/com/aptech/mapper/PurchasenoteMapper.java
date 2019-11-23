package com.aptech.mapper;

import com.aptech.domain.Purchasenote;
import com.aptech.domain.PurchasenoteExample;
import com.aptech.domain.Supplier;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchasenoteMapper {
    int countByExample(PurchasenoteExample example);

    int deleteByExample(PurchasenoteExample example);

    int deleteByPrimaryKey(Integer purchaseid);

    int insert(Purchasenote record);

    int insertSelective(Purchasenote record);

    List<Purchasenote> selectByExample(PurchasenoteExample example);

    Purchasenote selectByPrimaryKey(Integer purchaseid);

    int updateByExampleSelective(@Param("record") Purchasenote record, @Param("example") PurchasenoteExample example);

    int updateByExample(@Param("record") Purchasenote record, @Param("example") PurchasenoteExample example);

    int updateByPrimaryKeySelective(Purchasenote record);

    int updateByPrimaryKey(Purchasenote record);
    int selectcon(String purchaseid);

    List<Purchasenote> selectpurchasenote();
    
    int delete001(Purchasenote pu);
    
    List<Purchasenote> selectpurchasenoteok(String deliverytime2,String deliverytime1,String supplier2,String purchaseid);
     List<Purchasenote> selectpurchasenoteid(Purchasenote purchaseid);
}