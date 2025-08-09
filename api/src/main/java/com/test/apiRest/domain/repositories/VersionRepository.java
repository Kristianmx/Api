package com.test.apiRest.domain.repositories;

import com.test.apiRest.domain.entities.Version;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VersionRepository extends JpaRepository<Version,Integer> {
}
