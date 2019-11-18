package com.aptech.mapper;

import com.aptech.domain.Permissions2;
import com.aptech.domain.Permissions2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Permissions2Mapper {
    int countByExample(Permissions2Example example);

    int deleteByExample(Permissions2Example example);

    int deleteByPrimaryKey(Integer permissions2Id);

    int insert(Permissions2 record);

    int insertSelective(Permissions2 record);

    List<Permissions2> selectByExample(Permissions2Example example);

    Permissions2 selectByPrimaryKey(Integer permissions2Id);

    int updateByExampleSelective(@Param("record") Permissions2 record, @Param("example") Permissions2Example example);

    int updateByExample(@Param("record") Permissions2 record, @Param("example") Permissions2Example example);

    int updateByPrimaryKeySelective(Permissions2 record);

    int updateByPrimaryKey(Permissions2 record);
}