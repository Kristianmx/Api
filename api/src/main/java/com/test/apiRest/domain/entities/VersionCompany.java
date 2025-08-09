package com.test.apiRest.domain.entities;
import jakarta.persistence.*;
import lombok.*;
@Entity(name = "version_company")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VersionCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer versionCompanyId;

    @OneToOne
    @JoinColumn(name = "company_id", unique = true)
    private Company company;

    @ManyToOne
    @JoinColumn(name = "id_version")
    private Version version;

    @Column(length = 150)
    private String versionCompanyDescription;
}
