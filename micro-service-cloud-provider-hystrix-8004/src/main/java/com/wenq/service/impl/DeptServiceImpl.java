package com.wenq.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.wenq.service.DeptService;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @BelongsProject: spring-cloud-demo2
 * @BelongsPackage: com.wenq.service.impl
 * @Author: WenQiang
 * @CreateTime: 2022-05-28 16:26
 * @Description:
 */
@Service("DeptService")
public class DeptServiceImpl implements DeptService {
    @Override
    public String deptInfo_ok(Integer id) {
        return "线程池： "+ Thread.currentThread().getName() + "  deptInfo_ok,id: " + id;
    }
    //一旦该方法失败并抛出了异常信息后，会自动调用  @HystrixCommand 注解标注的 fallbackMethod 指定的方法
    //规定 5 秒钟以内就不报错，正常运行，超过 5 秒就报错，调用指定的方法
    @HystrixCommand(fallbackMethod = "dept_TimeoutHandler",commandProperties = {@HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "4999")})
    @Override
    public String deptInfo_Timeout(Integer id) {
        int outTime = 5;
        try{
            TimeUnit.SECONDS.sleep(outTime);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + "  deptInfo_Timeout,id:   " + id + "  耗时: " + outTime;
    }


    // 当服务出现故障后，调用该方法给出友好提示
    public String dept_TimeoutHandler(Integer id) {
        return  "网站提醒您，系统繁忙请稍后再试！"+"线程池：" + Thread.currentThread().getName() + "  deptInfo_Timeout,id:   " + id;
    }
}
