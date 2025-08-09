package com.test.apiRest.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "version")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Version {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer versionId;


    @OneToOne
    @JoinColumn(name = "id_app", unique = true,nullable = false)
    private Application application;

    @Column(nullable = false,length = 50)
    private String version;

    @Column(length = 150)
    private String versionDescription;

    @OneToMany(mappedBy = "version", cascade = CascadeType.ALL)
    private List<VersionCompany> versionCompanies;


}
