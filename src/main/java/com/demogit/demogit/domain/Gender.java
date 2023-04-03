package com.demogit.demogit.domain;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.stream.Stream;

public enum Gender {
    M("M"),
    F("F");

    private final String code;

    Gender(String code){
        this.code= code;
    }

    public String getCode(){
        return code;
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static Gender findByCode(String code){
        return Stream.of(Gender.values())
                    .filter(c -> c.code.equals(code))
                    .findFirst()
                    .orElse(null);
    }



}
