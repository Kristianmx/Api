package com.test.apiRest.infrastruture.abstract_services;


import com.test.apiRest.api.dto.request.VersionCompanyRequest;
import com.test.apiRest.api.dto.response.VersionCompanyResponse;
import com.test.apiRest.domain.entities.VersionCompany;

public interface IVersionCompanyService extends CrudService<VersionCompanyRequest, VersionCompanyResponse,Integer>{
}
