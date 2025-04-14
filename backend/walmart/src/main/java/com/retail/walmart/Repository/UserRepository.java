package com.retail.walmart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retail.walmart.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
