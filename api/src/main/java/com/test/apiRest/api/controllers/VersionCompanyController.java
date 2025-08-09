package com.test.apiRest.api.controllers;

import com.test.apiRest.api.dto.request.VersionCompanyRequest;
import com.test.apiRest.api.dto.response.VersionCompanyResponse;
import com.test.apiRest.infrastruture.services.VersionCompanyService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("version-company")
@AllArgsConstructor
public class VersionCompanyController {

    @Autowired
    private final VersionCompanyService versionCompanyService;

    @PostMapping
    public ResponseEntity<VersionCompanyResponse> create(@RequestBody VersionCompanyRequest request) {
        return ResponseEntity.ok(versionCompanyService.create(request));
    }

    @PutMapping("/{id}")
    public ResponseEntity<VersionCompanyResponse> update(@PathVariable Integer id, @RequestBody VersionCompanyRequest request) {
        return ResponseEntity.ok(versionCompanyService.update(id, request));
    }

    @GetMapping
    public ResponseEntity<List<VersionCompanyResponse>> getAll() {
        return ResponseEntity.ok(versionCompanyService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<VersionCompanyResponse> find(@PathVariable Integer id) {
        return ResponseEntity.ok(versionCompanyService.find(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        versionCompanyService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
