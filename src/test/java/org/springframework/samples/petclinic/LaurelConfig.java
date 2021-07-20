package org.springframework.samples.petclinic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.samples.petclinic.sfg.LaurelWordProducer;

@Configuration
public class LaurelConfig {

    @Bean
    LaurelWordProducer laurelWordProducer() {
        return new LaurelWordProducer();
    }
}
