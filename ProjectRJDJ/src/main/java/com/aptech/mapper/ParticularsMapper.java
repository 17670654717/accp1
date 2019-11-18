package com.aptech.mapper;

import com.aptech.domain.Particulars;
import com.aptech.domain.ParticularsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParticularsMapper {
    int countByExample(ParticularsExample example);

    int deleteByExample(ParticularsExample example);

    int deleteByPrimaryKey(Integer particularsid);

    int insert(Particulars record);

    int insertSelective(Particulars record);

    List<Particulars> selectByExample(ParticularsExample example);

    Particulars selectByPrimaryKey(Integer particularsid);

    int updateByExampleSelective(@Param("record") Particulars record, @Param("example") ParticularsExample example);

    int updateByExample(@Param("record") Particulars record, @Param("example") ParticularsExample example);

    int updateByPrimaryKeySelective(Particulars record);

    int updateByPrimaryKey(Particulars record);
}