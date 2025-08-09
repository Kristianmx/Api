package com.test.apiRest.api.dto.response;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VersionResponse {
    private Integer versionId;
    private ApplicationResponse application;
    private String version;
    private String versionDescription;
}
