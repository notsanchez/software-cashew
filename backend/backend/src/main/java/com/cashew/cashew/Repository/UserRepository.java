package com.cashew.cashew.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cashew.cashew.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "SELECT * FROM user WHERE user.email = ?1 AND user.password = ?2", nativeQuery = true)
    User authWithEmailAndPassword(String email, String password);

    @Query(value = "INSERT INTO user (name, email, password, cpf) VALUES (?1, ?2, ?3, ?4)", nativeQuery = true)
    User registerNewUser(String name, String email, String password, String cpf);
}
