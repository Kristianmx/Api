package com.test.apiRest.api.controllers;

import com.test.apiRest.api.dto.request.CompanyRequest;
import com.test.apiRest.api.dto.response.CompanyCompletResponse;
import com.test.apiRest.api.dto.response.CompanyResponse;
import com.test.apiRest.infrastruture.services.CompanyService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
@AllArgsConstructor
public class CompanyController {

    @Autowired
    private final CompanyService companyService;

    @PostMapping
    public ResponseEntity<CompanyResponse> create(@RequestBody CompanyRequest request) {
        return ResponseEntity.ok(companyService.create(request));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CompanyResponse> update(@PathVariable Integer id, @RequestBody CompanyRequest request) {
        return ResponseEntity.ok(companyService.update(id, request));
    }

    @GetMapping
    public ResponseEntity<List<CompanyResponse>> getAll() {
        return ResponseEntity.ok(companyService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CompanyResponse> find(@PathVariable Integer id) {
        return ResponseEntity.ok(companyService.find(id));
    }

    @GetMapping("/findByCode/{code}")
    public ResponseEntity<CompanyCompletResponse> findByCode(@PathVariable String code) {
        return ResponseEntity.ok(companyService.findByCodeCompany(code));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        companyService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
