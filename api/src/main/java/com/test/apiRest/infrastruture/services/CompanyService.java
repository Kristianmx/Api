package com.test.apiRest.infrastruture.services;

import com.test.apiRest.api.dto.request.CompanyRequest;
import com.test.apiRest.api.dto.response.CompanyCompletResponse;
import com.test.apiRest.api.dto.response.CompanyResponse;
import com.test.apiRest.domain.entities.Company;
import com.test.apiRest.domain.repositories.CompanyRepository;
import com.test.apiRest.infrastruture.abstract_services.ICompanyService;
import com.test.apiRest.infrastruture.helpers.SupportService;
import com.test.apiRest.infrastruture.helpers.mappers.CompanyMapper;
import lombok.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CompanyService implements ICompanyService {

    @Autowired
    private final CompanyRepository companyRepository;

    @Autowired
    private final SupportService<Company> companySupport;

    @Autowired
    private final CompanyMapper companyMapper;

    @Override
    public CompanyResponse create(CompanyRequest request) {
        Company company = this.companyMapper.toEntity(request);
        return this.companyMapper.toResponse(this.companyRepository.save(company));
    }

    @Override
    public CompanyResponse update(Integer id, CompanyRequest request) {
        Company company = this.companySupport.findByID(this.companyRepository, id, "Company");
        BeanUtils.copyProperties(request, company);
        return this.companyMapper.toResponse(this.companyRepository.save(company));
    }

    @Override
    public List<CompanyResponse> getAll() {
        return this.companyMapper.toListResponse(this.companyRepository.findAll());
    }

    @Override
    public CompanyResponse find(Integer id) {
        Company company = this.companySupport.findByID(this.companyRepository, id, "Company");
        return this.companyMapper.toResponse(company);
    }

    @Override
    public CompanyCompletResponse findByCodeCompany(String code) {
        Company company = this.companyRepository.findByCode(code);

        CompanyCompletResponse response = new CompanyCompletResponse();
        if (company!=null) {
            response.setNameCompany(company.getNameCompany());
            response.setCodigoCompany(company.getCodigoCompany());
            response.setVersion(company.getVersionCompany().getVersion().getVersion());
            response.setApp_name(company.getVersionCompany().getVersion().getApplication().getAppName());
        }
        return response;
    }

    @Override
    public void delete(Integer id) {
        Company company = this.companySupport.findByID(this.companyRepository, id, "Company");
        this.companyRepository.delete(company);
    }
}

