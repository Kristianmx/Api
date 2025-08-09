package com.test.apiRest.api.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VersionCompanyRequest {

    private Integer idCompany;
    private Integer idVersion;
    private String versionCompanyDescription;
}
