package com.test.apiRest.api.controllers;

import com.test.apiRest.api.dto.request.VersionRequest;
import com.test.apiRest.api.dto.response.VersionResponse;
import com.test.apiRest.infrastruture.services.VersionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/version")
@AllArgsConstructor
public class VersionController {

    @Autowired
    private final VersionService versionService;

    @PostMapping
    public ResponseEntity<VersionResponse> create(@RequestBody VersionRequest request) {
        return ResponseEntity.ok(versionService.create(request));
    }

    @PutMapping("/{id}")
    public ResponseEntity<VersionResponse> update(@PathVariable Integer id, @RequestBody VersionRequest request) {
        return ResponseEntity.ok(versionService.update(id, request));
    }

    @GetMapping
    public ResponseEntity<List<VersionResponse>> getAll() {
        return ResponseEntity.ok(versionService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<VersionResponse> find(@PathVariable Integer id) {
        return ResponseEntity.ok(versionService.find(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        versionService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
