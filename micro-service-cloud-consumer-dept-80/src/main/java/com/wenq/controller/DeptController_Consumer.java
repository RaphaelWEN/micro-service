package com.wenq.controller;

import com.wenq.entity.Dept;
import com.wenq.pojo.BaseResponse;
import com.wenq.pojo.DeptAndDate;
import com.wenq.pojo.DownLoadFileDesc;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/**
 * @BelongsProject: spring-cloud-demo2
 * @BelongsPackage: com.wenq.controller
 * @Author: WenQiang
 * @CreateTime: 2022-05-27 11:05
 * @Description:
 */
@RestController
@Slf4j
public class DeptController_Consumer {
    // 这种方式是直调用服务方的方法，根本没有用到 Spring Cloud
    //private static final String REST_URL_PROVIDER_PREFIX = "http://localhost:8001/";

    //面向微服务编程，即通过微服务的名称来获取调用地址
    //可以配置化
    // 使用注册到 Spring Cloud Eureka 服务注册中心中的服务，即 application.name
    private static final String REST_URL_PROVIDER_PREFIX = "http://MICROSERVICECLOUDPROVIDERDEPT";

    //RestTemplate 是一种简单便捷的访问 restful 服务模板类，
    // 是 Spring 提供的用于访问 Rest 服务的客户端模板工具集，
    // 提供了多种便捷访问远程 HTTP 服务的方法
    @Autowired
    private RestTemplate restTemplate;

    //获取指定部门信息
    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Integer id) {
        try{
            return restTemplate.getForObject(REST_URL_PROVIDER_PREFIX + "/dept/get/" + id, Dept.class);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    //获取部门列表
    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list() {
        return restTemplate.getForObject(REST_URL_PROVIDER_PREFIX + "/dept/list", List.class);
    }

    @RequestMapping(value = "/consumer/parse")
    public void parse() throws ParseException {
        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.YEAR,2021);
        instance.set(Calendar.MONTH,0);
        instance.set(Calendar.DAY_OF_MONTH,1);
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String downloadUrl = "http://imc.lg.china-yongfeng.com/imc/kpi/api/" +
                "kpi/kpiFunctionalDepartmentInfo/getFileUrlByDepNameAndDate";
        String parseUrl = "http://imc.lg.china-yongfeng.com/imc/kpi/api/" +
                "kpi/kpiFunctionalDepartmentInfo/parseProductDepartmentInfo";
        for (int i = 0; i < 87; i++) {
            instance.add(Calendar.DAY_OF_MONTH,1);
            String date_i = format.format(instance.getTime());
//            restTemplate.postForObject()
        }
    }

    public String getDownloadUrl(){
        DeptAndDate deptAndDate = new DeptAndDate();
        deptAndDate.setDeptName("生产部");
        deptAndDate.setEffectiveDate("2021-12-31");
        BaseResponse baseResponse = restTemplate.postForObject("http://imc.lg.china-yongfeng.com/imc/kpi/api/" +
                "kpi/kpiFunctionalDepartmentInfo/getFileUrlByDepNameAndDate", deptAndDate, BaseResponse.class);
        assert baseResponse != null;
        DownLoadFileDesc data = (DownLoadFileDesc) baseResponse.getData();
        return data.getUrl();
    }


}
