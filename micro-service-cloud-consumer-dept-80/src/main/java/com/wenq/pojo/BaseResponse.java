package com.wenq.pojo;

import lombok.Data;

/**
 * @BelongsProject: spring-cloud-demo2
 * @BelongsPackage: com.wenq.pojo
 * @Author: WenQiang
 * @CreateTime: 2022-06-04 18:57
 * @Description:
 */
@Data
public class BaseResponse<T> {
    private String message;
    private String code;
    private String traceId;
    private String possibleReason;
    private String suggestMeasure;
    private T data;
}
