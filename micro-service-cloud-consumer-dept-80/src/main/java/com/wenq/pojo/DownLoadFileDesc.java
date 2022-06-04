package com.wenq.pojo;

import lombok.Data;

/**
 * @BelongsProject: spring-cloud-demo2
 * @BelongsPackage: com.wenq.pojo
 * @Author: WenQiang
 * @CreateTime: 2022-06-04 19:06
 * @Description:
 */
@Data
public class DownLoadFileDesc {
    private String fileName;
    private String url;
}
