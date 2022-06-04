package com.wenq.service;

/**
 * @BelongsProject: spring-cloud-demo2
 * @BelongsPackage: com.wenq.service
 * @Author: WenQiang
 * @CreateTime: 2022-05-28 16:23
 * @Description:
 */
public interface DeptService {

    // hystrix 熔断器示例 ok
    String deptInfo_ok(Integer id);

    //hystrix 熔断器超时案例
    String deptInfo_Timeout(Integer id);
}
