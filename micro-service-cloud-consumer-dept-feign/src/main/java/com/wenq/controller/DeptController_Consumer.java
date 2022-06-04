package com.wenq.controller;

import com.wenq.entity.Dept;
import com.wenq.service.DeptFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @BelongsProject: spring-cloud-demo2
 * @BelongsPackage: com.wenq.controller
 * @Author: WenQiang
 * @CreateTime: 2022-05-28 14:29
 * @Description:
 */
@RestController
public class DeptController_Consumer {

    @Autowired
    private DeptFeignService deptFeignService;

    @RequestMapping(value = "/consumer/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") int id){
        return deptFeignService.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list", method = RequestMethod.GET)
    public List<Dept> list(){
        return deptFeignService.list();
    }

    @RequestMapping(value = "/consumer/dept/feign/timeout",method = RequestMethod.GET)
    public String DeptFeignTimeout(){
        // openFeign-ribbon 客户端一般默认等待一秒钟，超过该时间就会报错
        return deptFeignService.deptFeignTimeout();
    }


}
