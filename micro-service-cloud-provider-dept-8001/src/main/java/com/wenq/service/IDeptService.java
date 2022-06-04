package com.wenq.service;

import com.wenq.entity.Dept;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.validation.constraints.Max;
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
