package com.wenq.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wenq.entity.Dept;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author WenQiang
 * @since 2022-05-26
 */
public interface IDeptService extends IService<Dept> {
    Dept get(Integer deptNo);
    List<Dept> selectAll();
}
