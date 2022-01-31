package com.smileframework.apiassistant.apiassistant.common.entity.definition;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name = "api_definition")
public class ApiDefinition {
    /**
     * 主键id
     */
    @Id
    @Column(name = "id")
    private Long id;

    /**
     * 文档名称
     */
    @Column(name = "document_name")
    private String documentName;

    /**
     * 文件夹id
     */
    @Column(name = "folder_id")
    private Long folderId;

    /**
     * 项目id
     */
    @Column(name = "project_id")
    private Long projectId;

    /**
     * controller注释
     */
    @Column(name = "controller_desc")
    private String controllerDesc;

    /**
     * 接口名称
     */
    @Column(name = "api_name")
    private String apiName;

    /**
     * 接口描述
     */
    @Column(name = "api_desc")
    private String apiDesc;

    /**
     * http方法
     */
    @Column(name = "http_method")
    private String httpMethod;

    /**
     * 请求路径
     */
    @Column(name = "uri")
    private String uri;

    /**
     * 请求类型 RequestBody/FormData
     */
    @Column(name = "request_body_type")
    private String requestBodyType;

    /**
     * 请求对象json
     */
    @Column(name = "request_json")
    private String requestJson;

    /**
     * 返回对象json
     */
    @Column(name = "response_json")
    private String responseJson;

}
