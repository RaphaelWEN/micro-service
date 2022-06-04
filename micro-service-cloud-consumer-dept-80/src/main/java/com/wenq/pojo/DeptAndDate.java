package com.wenq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @BelongsProject: spring-cloud-demo2
 * @BelongsPackage: com.wenq.pojo
 * @Author: WenQiang
 * @CreateTime: 2022-06-04 18:45
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeptAndDate {
    private String deptName;
    private String effectiveDate;
}
