package com.test.apiRest.api.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationRequest {

    private String appCode;

    private String appName;

    private String appDescription;
}
