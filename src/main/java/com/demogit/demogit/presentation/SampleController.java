package com.demogit.demogit.presentation;

import com.demogit.demogit.dto.SampleReqDTO;
import com.demogit.demogit.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class SampleController {

    private final SampleService sampleService;

    @GetMapping("/sample")
    public String sample(){
        return "sample";
    }

    @PostMapping("/save")
    public void signUp(@Valid @RequestBody SampleReqDTO sampleReqDTO){
        System.out.println("데이터 저장");

        sampleService.save(sampleReqDTO);
    }

}
