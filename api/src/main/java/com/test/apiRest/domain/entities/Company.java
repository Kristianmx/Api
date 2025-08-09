package com.test.apiRest.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "company")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer idCompany;

    @Column(unique = true,nullable = false,length = 25)
    private String codigoCompany;

    @Column(nullable = false,length = 50)
    private String nameCompany;

    @Column(length = 150)
    private String descriptionCompany;

    @OneToOne(mappedBy = "company", cascade = CascadeType.ALL)
    private VersionCompany versionCompany;
}
