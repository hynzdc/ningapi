package com.yupi.project.model.dto.interfaceinfo;

import lombok.Data;

/**
 * @author hyn
 * @version 1.0.0
 * @description 新增请求
 * @date 2023/4/19
 */
@Data
public class InterfaceInfoAddRequest {
    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 接口地址
     */
    private String url;

    /**
     * 请求参数
     */
    private String requestParams;

    /**
     * 请求头
     */
    private String requestHeader;

    /**
     * 响应头
     */
    private String responseHeader;

    /**
     * 请求类型
     */
    private String method;


}
