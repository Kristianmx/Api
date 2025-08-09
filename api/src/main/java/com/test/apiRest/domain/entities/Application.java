package com.test.apiRest.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "application")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Application {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer appId;

    @Column(unique = true,nullable = false,length = 25)
    private String appCode;

    @Column(nullable = false,length = 50)
    private String appName;

    @Column(length = 150)
    private String appDescription;

    @OneToOne(mappedBy = "application", cascade = CascadeType.ALL)
    private Version version;
}
