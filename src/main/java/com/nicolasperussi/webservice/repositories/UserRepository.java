package com.nicolasperussi.webservice.repositories;

import com.nicolasperussi.webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
