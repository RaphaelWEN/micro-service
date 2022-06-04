package com.wenq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wenq.entity.Dept;
import com.wenq.mapper.DeptMapper;
import com.wenq.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author WenQiang
 * @since 2022-05-26
 */
@Service("iDeptService")
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Dept get(Integer deptNo) {
        return deptMapper.selectByPrimaryKey(deptNo);
    }

    @Override
    public List<Dept> selectAll() {
        return deptMapper.getAll();
    }
}
