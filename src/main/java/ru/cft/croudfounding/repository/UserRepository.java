package ru.cft.croudfounding.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.cft.croudfounding.repository.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
