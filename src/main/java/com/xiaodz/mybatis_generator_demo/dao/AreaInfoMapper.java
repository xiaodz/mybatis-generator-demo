package com.xiaodz.mybatis_generator_demo.dao;

import com.xiaodz.mybatis_generator_demo.model.AreaInfo;
import com.xiaodz.mybatis_generator_demo.model.AreaInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreaInfoMapper {
    long countByExample(AreaInfoExample example);

    int deleteByExample(AreaInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AreaInfo record);

    int insertSelective(AreaInfo record);

    List<AreaInfo> selectByExample(AreaInfoExample example);

    AreaInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AreaInfo record, @Param("example") AreaInfoExample example);

    int updateByExample(@Param("record") AreaInfo record, @Param("example") AreaInfoExample example);

    int updateByPrimaryKeySelective(AreaInfo record);

    int updateByPrimaryKey(AreaInfo record);
}