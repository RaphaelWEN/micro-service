package com.wenq.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @BelongsProject: spring-cloud-demo2
 * @BelongsPackage: com.wenq.entity
 * @Author: WenQiang
 * @CreateTime: 2022-05-26 11:29
 * @Description:
 */
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
    private Integer deptNo;
    private String deptName;
    private String dbSource;
}
