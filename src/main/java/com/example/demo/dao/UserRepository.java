package com.example.demo.dao;
import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

//@Transactional(readOnly = true)
public interface UserRepository extends JpaRepository<User, Integer>{
    /*@Transactional
    @Modifying
    @Query("delete from User u where u.id = :id")
    int delete(@Param("id") Integer id);*/
}
