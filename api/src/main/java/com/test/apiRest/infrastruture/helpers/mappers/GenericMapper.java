package com.test.apiRest.infrastruture.helpers.mappers;

import java.util.List;

public interface GenericMapper <Request, Response, Entity>{
    Entity toEntity(Request request);
    Response toResponse(Entity entity);
    List<Response> toListResponse(List<Entity> entityList);
}
