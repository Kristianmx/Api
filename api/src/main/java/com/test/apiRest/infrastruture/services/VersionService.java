package com.test.apiRest.infrastruture.services;

import com.test.apiRest.api.dto.request.VersionRequest;
import com.test.apiRest.api.dto.response.VersionResponse;
import com.test.apiRest.domain.entities.Version;
import com.test.apiRest.domain.repositories.VersionRepository;
import com.test.apiRest.infrastruture.abstract_services.IVersionService;
import com.test.apiRest.infrastruture.helpers.SupportService;
import com.test.apiRest.infrastruture.helpers.mappers.VersionMapper;
import lombok.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class VersionService implements IVersionService {

    @Autowired
    private final VersionRepository versionRepository;

    @Autowired
    private final SupportService<Version> versionSupport;

    @Autowired
    private final VersionMapper versionMapper;

    @Override
    public VersionResponse create(VersionRequest request) {
        Version version = this.versionMapper.toEntity(request);
        return this.versionMapper.toResponse(this.versionRepository.save(version));
    }

    @Override
    public VersionResponse update(Integer id, VersionRequest request) {
        Version version = this.versionSupport.findByID(this.versionRepository, id, "Version");
        BeanUtils.copyProperties(request, version);
        return this.versionMapper.toResponse(this.versionRepository.save(version));
    }

    @Override
    public List<VersionResponse> getAll() {
        return this.versionMapper.toListResponse(this.versionRepository.findAll());
    }

    @Override
    public VersionResponse find(Integer id) {
        Version version = this.versionSupport.findByID(this.versionRepository, id, "Version");
        return this.versionMapper.toResponse(version);
    }

    @Override
    public void delete(Integer id) {
        Version version = this.versionSupport.findByID(this.versionRepository, id, "Version");
        this.versionRepository.delete(version);
    }
}
