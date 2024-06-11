package com.example.onlineShop.Repositories;

import com.example.onlineShop.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepositoryInt extends JpaRepository<user,Long> {
  //  @Query("select u from user u where u.userName= :userName and  u.password = :password")
   // public user login(String userName ,String password);
  @Query("select u from user u where u.userName = :userName and u.password = :password")
  user login(@Param("userName") String userName, @Param("password") String password);
}

