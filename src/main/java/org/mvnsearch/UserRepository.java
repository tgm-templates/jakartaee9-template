package org.mvnsearch;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import jakarta.enterprise.context.ApplicationScoped;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;

@ApplicationScoped
public class UserRepository {
    private final Faker faker = new Faker();

    @PostConstruct
    public void init() {

    }

    @PreDestroy
    public void close() {
    }

    public User findUserById(Long id) {
        Name name = faker.name();
        return new User(id, name.firstName(), name.lastName());
    }

    public User findRandomUser() {
        Name name = faker.name();
        return new User(new Random().nextLong(), name.firstName(), name.lastName());
    }
}
