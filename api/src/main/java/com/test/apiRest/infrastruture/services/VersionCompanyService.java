package com.test.apiRest.infrastruture.services;


import com.test.apiRest.api.dto.request.VersionCompanyRequest;
import com.test.apiRest.api.dto.response.VersionCompanyResponse;
import com.test.apiRest.domain.entities.VersionCompany;
import com.test.apiRest.domain.repositories.VersionCompanyRepository;
import com.test.apiRest.infrastruture.abstract_services.IVersionCompanyService;
import com.test.apiRest.infrastruture.helpers.SupportService;
import com.test.apiRest.infrastruture.helpers.mappers.VersionCompanyMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class VersionCompanyService implements IVersionCompanyService {

    @Autowired
    private final VersionCompanyRepository versionCompanyRepository;

    @Autowired
    private final SupportService<VersionCompany> versionCompanySupport;

    @Autowired
    private final VersionCompanyMapper versionCompanyMapper;

    @Override
    public VersionCompanyResponse create(VersionCompanyRequest request) {
        VersionCompany versionCompany = this.versionCompanyMapper.toEntity(request);
        return this.versionCompanyMapper.toResponse(this.versionCompanyRepository.save(versionCompany));
    }

    @Override
    public VersionCompanyResponse update(Integer id, VersionCompanyRequest request) {
        VersionCompany versionCompany = this.versionCompanySupport.findByID(this.versionCompanyRepository, id, "VersionCompany");
        BeanUtils.copyProperties(request, versionCompany);
        return this.versionCompanyMapper.toResponse(this.versionCompanyRepository.save(versionCompany));
    }

    @Override
    public List<VersionCompanyResponse> getAll() {
        return this.versionCompanyMapper.toListResponse(this.versionCompanyRepository.findAll());
    }

    @Override
    public VersionCompanyResponse find(Integer id) {
        VersionCompany versionCompany = this.versionCompanySupport.findByID(this.versionCompanyRepository, id, "VersionCompany");
        return this.versionCompanyMapper.toResponse(versionCompany);
    }

    @Override
    public void delete(Integer id) {
        VersionCompany versionCompany = this.versionCompanySupport.findByID(this.versionCompanyRepository, id, "VersionCompany");
        this.versionCompanyRepository.delete(versionCompany);
    }
}

