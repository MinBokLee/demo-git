package com.demogit.demogit.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@DynamicUpdate
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="SAMPLE")
public class Sample {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false, length = 20)
    private String mobile;

    @Column(nullable = false, length = 30, unique = true)
    private String email;

    @Column
    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    @Builder
    public Sample(String name, String mobile, String email, Gender gender) {
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.gender = gender;
    }

    public void Name(String name){
        this.name =name;
    }
}


