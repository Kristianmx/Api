package com.test.apiRest.infrastruture.abstract_services;


import com.test.apiRest.api.dto.request.CompanyRequest;
import com.test.apiRest.api.dto.response.CompanyCompletResponse;
import com.test.apiRest.api.dto.response.CompanyResponse;
import com.test.apiRest.domain.entities.Company;

public interface ICompanyService extends CrudService<CompanyRequest, CompanyResponse,Integer>{
    CompanyCompletResponse findByCodeCompany(String code);
}
