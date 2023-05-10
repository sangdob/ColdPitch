package com.ColdPitch.domain.Service;

import com.ColdPitch.domain.Repository.HelloRepository;
import com.ColdPitch.domain.entity.Hello;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class HelloService {
    private final HelloRepository helloRepository;

    public Hello save(Hello hello) {
        return helloRepository.save(hello);
    }
}
