package com.smileframework.apiassistant.apiassistant.definition;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/definition/")
public class APIDefinitionController {

    /**
     * 上传接口
     */
    @PostMapping("/upload")
    public void upload() {
    }

}
