package com.suusarent.suusarentback.presistence.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("select u from User u where u.email = ?1 and u.password = ?2 and u.status = ?3")
    Optional<User> findUserBy(String email, String password, String status);

    @Query("select (count(u) > 0) from User u where upper(u.email) = upper(:email)")
    boolean userExistsBy(String email);


}
