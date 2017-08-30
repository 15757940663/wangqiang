package org.qf.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.qf.domain.TbEmp;
import org.qf.domain.TbEmpExample;

public interface TbEmpMapper {
    long countByExample(TbEmpExample example);

    int deleteByExample(TbEmpExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbEmp record);

    int insertSelective(TbEmp record);

    List<TbEmp> selectByExample(TbEmpExample example);

    TbEmp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbEmp record, @Param("example") TbEmpExample example);

    int updateByExample(@Param("record") TbEmp record, @Param("example") TbEmpExample example);

    int updateByPrimaryKeySelective(TbEmp record);

    int updateByPrimaryKey(TbEmp record);
}