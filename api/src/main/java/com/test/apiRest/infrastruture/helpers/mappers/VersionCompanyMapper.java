package com.test.apiRest.infrastruture.helpers.mappers;

import com.test.apiRest.api.dto.request.VersionCompanyRequest;
import com.test.apiRest.api.dto.response.VersionCompanyResponse;
import com.test.apiRest.domain.entities.VersionCompany;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface VersionCompanyMapper  extends GenericMapper<VersionCompanyRequest, VersionCompanyResponse, VersionCompany>{
}
