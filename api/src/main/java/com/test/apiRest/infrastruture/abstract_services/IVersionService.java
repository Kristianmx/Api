package com.test.apiRest.infrastruture.abstract_services;

import com.test.apiRest.api.dto.request.VersionRequest;
import com.test.apiRest.api.dto.response.VersionResponse;
import com.test.apiRest.domain.entities.Version;

public interface IVersionService extends CrudService<VersionRequest, VersionResponse,Integer>{
}
