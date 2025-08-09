package com.test.apiRest.infrastruture.services;

import com.test.apiRest.api.dto.request.ApplicationRequest;
import com.test.apiRest.api.dto.response.ApplicationResponse;
import com.test.apiRest.domain.entities.Application;
import com.test.apiRest.domain.repositories.ApplicationRepository;
import com.test.apiRest.infrastruture.abstract_services.IApplicationService;
import com.test.apiRest.infrastruture.helpers.SupportService;
import com.test.apiRest.infrastruture.helpers.mappers.ApplicationMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ApplicationService implements IApplicationService {
    @Autowired
    private final ApplicationRepository applicationRepository;

    @Autowired
    private final SupportService<Application> applicationSupport;

    @Autowired
    private final ApplicationMapper applicationMapper;
    @Override
    public ApplicationResponse create(ApplicationRequest request) {
        Application application = this.applicationMapper.toEntity(request);
        return this.applicationMapper.toResponse(this.applicationRepository.save(application));
    }

    @Override
    public ApplicationResponse update(Integer id, ApplicationRequest request) {
        Application application = this.applicationSupport.findByID(this.applicationRepository,id, "Application");

        BeanUtils.copyProperties(request,application);

        return  this.applicationMapper.toResponse(this.applicationRepository.save(application));
    }

    @Override
    public List<ApplicationResponse> getAll() {
        return this.applicationMapper.toListResponse(this.applicationRepository.findAll());
    }

    @Override
    public ApplicationResponse find(Integer id) {
        Application application = this.applicationSupport.findByID(this.applicationRepository,id,"Application");
        return this.applicationMapper.toResponse(application);
    }

    @Override
    public void delete(Integer id) {
        Application application = this.applicationSupport.findByID(this.applicationRepository,id,"Application");
        this.applicationRepository.delete(application);
    }
}
