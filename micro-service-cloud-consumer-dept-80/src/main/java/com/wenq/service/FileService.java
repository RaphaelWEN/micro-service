package com.wenq.service;

import java.io.FileOutputStream;
import java.io.FileReader;

/**
 * @BelongsProject: spring-cloud-demo2
 * @BelongsPackage: com.wenq.service
 * @Author: WenQiang
 * @CreateTime: 2022-06-02 15:34
 * @Description:
 */
public interface FileService {
    /**
     * 根据url获取文件下载地址
     * @param targetUrl 目标url链接
     * @return 文件下载地址
     */
    String getDownloadUrl(String targetUrl);

    /**
     * 文件是否解析成功
     * @param parseUrl  文件需要解析的url
     * @param fileReader 文件读取流
     * @return 文件是否解析成功
     */
    Boolean isParsed(String parseUrl, FileReader fileReader);
}
