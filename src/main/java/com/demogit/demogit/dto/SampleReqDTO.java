package com.demogit.demogit.dto;

import com.demogit.demogit.domain.Gender;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class SampleReqDTO {

    @NotBlank(message = "{notBlank}")
    @Pattern(regexp = "^[A-Za-z가-힣]+$", message = "{pattern.name}")
    private String name;

    @NotBlank(message = "{notBlank}")
    @Pattern(regexp = "(^\\d{3})(\\d{3,4}(\\d{4}))$", message = "{pattern.mobile}")
    private String mobile;

    @NotBlank(message = "{notBlank}")
    @Email(message = "{pattern.email}", regexp = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$")    private String email;

    @Enumerated(value = EnumType.STRING)
    private Gender gender;
}
