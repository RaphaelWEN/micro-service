package com.wenq.service;

import com.wenq.entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author wenqiang
 * @version 1.0
 * @date 2022/5/28 14:24
 */
@Component
@FeignClient(name = "MICROSERVICECLOUDPROVIDERDEPT")
public interface DeptFeignService {
    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    Dept get(@PathVariable("id") int id);

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    List<Dept> list();

    @RequestMapping(value = "/dept/feign/timeout",method = RequestMethod.GET)
    String deptFeignTimeout();
}
