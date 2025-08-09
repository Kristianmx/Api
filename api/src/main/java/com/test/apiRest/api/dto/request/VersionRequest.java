package com.test.apiRest.api.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VersionRequest {
    private Integer idApp;

    private String version;

    private String versionDescription;
}
