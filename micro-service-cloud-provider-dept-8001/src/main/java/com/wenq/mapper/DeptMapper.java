package com.wenq.mapper;

import com.wenq.entity.Dept;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author WenQiang
 * @since 2022-05-26
 */
@Mapper
public interface DeptMapper extends BaseMapper<Dept> {
    //根据主键获取数据
    Dept selectByPrimaryKey(Integer deptNo);

    //获取表中的全部数据
    List<Dept> getAll();

}
