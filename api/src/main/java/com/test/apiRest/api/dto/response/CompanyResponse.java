package com.test.apiRest.api.dto.response;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompanyResponse {
    private Integer idCompany;
    private String codigoCompany;
    private String nameCompany;
    private String descriptionCompany;

}
