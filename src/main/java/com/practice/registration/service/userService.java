package com.practice.registration.service;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.practice.registration.repository.userRepository;

import java.util.logging.Logger;

@Service
public class userService {
    private userRepository userRepository;

    @Autowired
    public userService(userRepository userRepository) {
        this.userRepository = userRepository;
    }

//    public long countAndPrintFormData() {
//        long count = userRepository.count();
//        System.out.println("Number of data in the table: " + count);
//        return count;
//    }
    public long getCountOfRecords() {
        return userRepository.count();
    }


//    private static final Logger logger = LoggerFactory.getLogger(userService.class);
//
//    // Other code remains the same
//
//    public long getCountOfRecords1() {
//        long count = userRepository.count();
//        logger.info("Number of records: {}", count);
//        return count;
//    }

}
