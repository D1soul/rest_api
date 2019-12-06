package com.spring.rest_api.db_init_service;

import com.spring.rest_api.entities.User;
import com.spring.rest_api.repository.UsersRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@Service
public class InitializeUsersDB {
    private Logger logger = LoggerFactory.getLogger(InitializeUsersDB.class);

    @Autowired
    private UsersRepository usersRepository;

    @PostConstruct
    public void initializeDB() {
        User user = new User();
        user.setFirstName("Pavel");
        user.setLastName("Durov");
        user.setBirthDate(new Date(new GregorianCalendar(1984, Calendar.OCTOBER, 10).getTime().getTime()));
        user.setEmail("vk@mail.com");
        user.setPassword("PavelDurov");
        usersRepository.save(user);

        user = new User();
        user.setFirstName("Mark");
        user.setLastName("Zuckerberg");
        user.setBirthDate(new Date(new GregorianCalendar(1984, Calendar.MAY, 14).getTime().getTime()));
        user.setEmail("facebook@mail.com");
        user.setPassword("MarkZuckerberg");
        usersRepository.save(user);

        user = new User();
        user.setFirstName("Jack");
        user.setLastName("Dorsey");
        user.setBirthDate(new Date(new GregorianCalendar(1976, Calendar.NOVEMBER, 19).getTime().getTime()));
        user.setEmail("twitter@mail.com");
        user.setPassword("JackDorsey");
        usersRepository.save(user);
    }
}
