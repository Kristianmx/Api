package com.test.apiRest.infrastruture.helpers.mappers;

import com.test.apiRest.api.dto.request.ApplicationRequest;
import com.test.apiRest.api.dto.response.ApplicationResponse;
import com.test.apiRest.domain.entities.Application;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ApplicationMapper extends GenericMapper<ApplicationRequest, ApplicationResponse, Application>{
}
