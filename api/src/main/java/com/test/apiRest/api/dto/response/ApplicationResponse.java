package com.test.apiRest.api.dto.response;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationResponse {
    private Integer appId;
    private String appCode;
    private String appName;
    private String appDescription;
}
