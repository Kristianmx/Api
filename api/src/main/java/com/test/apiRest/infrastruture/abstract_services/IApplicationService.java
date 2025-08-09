package com.test.apiRest.infrastruture.abstract_services;

import com.test.apiRest.api.dto.request.ApplicationRequest;
import com.test.apiRest.api.dto.response.ApplicationResponse;
import com.test.apiRest.domain.entities.Application;

public interface IApplicationService extends CrudService<ApplicationRequest, ApplicationResponse,Integer> {
}
