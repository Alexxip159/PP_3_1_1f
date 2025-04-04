package ru.alexxip59.pp_3_1_1f.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.alexxip59.pp_3_1_1f.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}