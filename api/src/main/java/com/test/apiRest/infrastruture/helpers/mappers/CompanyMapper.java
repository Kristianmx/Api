package com.test.apiRest.infrastruture.helpers.mappers;

import com.test.apiRest.api.dto.request.CompanyRequest;
import com.test.apiRest.api.dto.response.CompanyResponse;
import com.test.apiRest.domain.entities.Company;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CompanyMapper extends GenericMapper<CompanyRequest, CompanyResponse, Company>{
}
