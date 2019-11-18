package com.aptech.mapper;

import com.aptech.domain.PositionAuthority;
import com.aptech.domain.PositionAuthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PositionAuthorityMapper {
    int countByExample(PositionAuthorityExample example);

    int deleteByExample(PositionAuthorityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PositionAuthority record);

    int insertSelective(PositionAuthority record);

    List<PositionAuthority> selectByExample(PositionAuthorityExample example);

    PositionAuthority selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PositionAuthority record, @Param("example") PositionAuthorityExample example);

    int updateByExample(@Param("record") PositionAuthority record, @Param("example") PositionAuthorityExample example);

    int updateByPrimaryKeySelective(PositionAuthority record);

    int updateByPrimaryKey(PositionAuthority record);
}