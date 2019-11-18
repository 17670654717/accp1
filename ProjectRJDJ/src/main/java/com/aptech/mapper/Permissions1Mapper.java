package com.aptech.mapper;

import com.aptech.domain.Permissions1;
import com.aptech.domain.Permissions1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Permissions1Mapper {
    int countByExample(Permissions1Example example);

    int deleteByExample(Permissions1Example example);

    int deleteByPrimaryKey(Integer permissions1Id);

    int insert(Permissions1 record);

    int insertSelective(Permissions1 record);

    List<Permissions1> selectByExample(Permissions1Example example);

    Permissions1 selectByPrimaryKey(Integer permissions1Id);

    int updateByExampleSelective(@Param("record") Permissions1 record, @Param("example") Permissions1Example example);

    int updateByExample(@Param("record") Permissions1 record, @Param("example") Permissions1Example example);

    int updateByPrimaryKeySelective(Permissions1 record);

    int updateByPrimaryKey(Permissions1 record);
}