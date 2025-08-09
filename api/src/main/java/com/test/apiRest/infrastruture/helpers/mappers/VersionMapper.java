package com.test.apiRest.infrastruture.helpers.mappers;

import com.test.apiRest.api.dto.request.VersionRequest;
import com.test.apiRest.api.dto.response.VersionResponse;
import com.test.apiRest.domain.entities.Version;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface VersionMapper extends GenericMapper<VersionRequest, VersionResponse, Version> {
}
