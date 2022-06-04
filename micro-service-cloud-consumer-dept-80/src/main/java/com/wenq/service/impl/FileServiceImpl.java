package com.wenq.service.impl;

import com.wenq.service.FileService;
import org.springframework.beans.factory.annotation.Value;

import java.io.FileReader;

/**
 * @BelongsProject: spring-cloud-demo2
 * @BelongsPackage: com.wenq.service.impl
 * @Author: WenQiang
 * @CreateTime: 2022-06-04 18:33
 * @Description:
 */
public class FileServiceImpl implements FileService {
    @Value("${url.targetUrl}")
    private String targetUrl;

    @Value("${url.parseUrl}")
    private String parseUrl;

    @Override
    public String getDownloadUrl(String targetUrl) {
        return "1";
    }

    @Override
    public Boolean isParsed(String parseUrl, FileReader fileReader) {
        return null;
    }
}
