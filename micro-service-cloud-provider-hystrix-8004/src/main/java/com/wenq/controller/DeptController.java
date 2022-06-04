package com.wenq.controller;

import com.wenq.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: spring-cloud-demo2
 * @BelongsPackage: com.wenq.controller
 * @Author: WenQiang
 * @CreateTime: 2022-05-28 16:45
 * @Description:
 */
@RestController
@Slf4j
public class DeptController {

    @Autowired
    private DeptService deptService;
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/dept/hystrix/ok/{id}")
    public String deptInfo_ok(@PathVariable("id") Integer id){
        String result = deptService.deptInfo_ok(id);
        log.info("端口号："+ serverPort + "  result:" + result);
        return result + "  端口号：" + serverPort;
    }

    @RequestMapping(value = "/dept/hystrix/timeout/{id}")
    public String deptInfo_Timeout(@PathVariable("id") Integer id){
        String result = deptService.deptInfo_Timeout(id);
        log.info("端口号："+ serverPort + "  result:" + result);
        return result + "  端口号：" + serverPort;
    }
}
