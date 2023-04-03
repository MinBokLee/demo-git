package com.demogit.demogit.service;

import com.demogit.demogit.domain.Sample;
import com.demogit.demogit.dto.SampleReqDTO;
import com.demogit.demogit.repository.SampleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class SampleService {

    private final SampleRepository sampleRepository;

    public void save(SampleReqDTO sampleReqDTO) {
    boolean Yn = sampleRepository.existsByEmail(sampleReqDTO.getEmail());
    log.info("Yn----------------------->"+ Yn);
    if(Yn) {
        System.out.println("이메일 중복");
    }else{
        Sample sampleData = Sample.builder()
                .email(sampleReqDTO.getEmail())
                .mobile(sampleReqDTO.getMobile())
                .name(sampleReqDTO.getName())
                .gender(sampleReqDTO.getGender())
                .build();
        sampleRepository.save(sampleData);

    }

    }
}
