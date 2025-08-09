package com.test.apiRest.api.controllers;

import com.test.apiRest.api.dto.request.ApplicationRequest;
import com.test.apiRest.api.dto.response.ApplicationResponse;
import com.test.apiRest.infrastruture.services.ApplicationService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/application")
@AllArgsConstructor
public class ApplicationController {

    @Autowired
    private final ApplicationService applicationService;

    @PostMapping
    public ResponseEntity<ApplicationResponse> create(@RequestBody ApplicationRequest request) {
        return ResponseEntity.ok(applicationService.create(request));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApplicationResponse> update(@PathVariable Integer id, @RequestBody ApplicationRequest request) {
        return ResponseEntity.ok(applicationService.update(id, request));
    }

    @GetMapping
    public ResponseEntity<List<ApplicationResponse>> getAll() {
        return ResponseEntity.ok(applicationService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApplicationResponse> find(@PathVariable Integer id) {
        return ResponseEntity.ok(applicationService.find(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        applicationService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
