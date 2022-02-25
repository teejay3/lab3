package com.example.demo;

import com.example.demo.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner{
    @Autowired
    private final UserRepository userRepository;

    public CommandLineAppStartupRunner(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String...args)throws Exception
    {
        //System.out.println(userRepository.findById(1).get());
        //List<User> listStudents = userRepository.findAll();
        //System.out.println("User found " + listStudents.size());
    }
}
