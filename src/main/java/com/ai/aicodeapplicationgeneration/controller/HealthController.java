package com.ai.aicodeapplicationgeneration.controller;

import com.ai.aicodeapplicationgeneration.common.BaseResponse;
import com.ai.aicodeapplicationgeneration.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping("/")
    public BaseResponse<String> healthCheck() {
        return ResultUtils.success("ok");
    }
}
