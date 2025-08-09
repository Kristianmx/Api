package com.test.apiRest.api.dto.response;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompanyCompletResponse {
    private String CodigoCompany;
    private String nameCompany;
    private String app_name;
    private String version;
}
