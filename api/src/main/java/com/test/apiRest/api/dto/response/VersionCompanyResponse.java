package com.test.apiRest.api.dto.response;



import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VersionCompanyResponse {
    private Integer versionCompanyId;
    private CompanyResponse company;
    private VersionResponse version;
    private String versionCompanyDescription;
}
