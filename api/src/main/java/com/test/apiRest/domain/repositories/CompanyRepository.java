package com.test.apiRest.domain.repositories;

import com.test.apiRest.domain.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Integer> {

    @Query("SELECT c from company c WHERE c.codigoCompany = :code")
    Company findByCode(@Param("code") String code);
}
