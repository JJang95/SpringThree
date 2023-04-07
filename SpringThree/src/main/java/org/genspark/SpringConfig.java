package org.genspark;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public Student student() {
        return new Student(1, "Jonathan Jang", phones(), address());
    }

    @Bean
    public List<Phone> phones() {
        List<Phone> phones = new ArrayList<Phone>();
        phones.add(new Phone("1234567890"));
        phones.add(new Phone("1234567891"));
        return phones;
    }

    @Bean
    public Address address() {
        return new Address("Newark", "NJ", "USA", "07101");
    }

}
