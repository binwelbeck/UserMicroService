//package com.example.demo.bootstrap;
//
//import com.example.demo.domain.User;
//import com.example.demo.repositories.UserRepository;
//import lombok.extern.log4j.Log4j;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.logging.Logger;
//
////@Component
////@Log4j
//public class UserLoader implements CommandLineRunner {
//
//    private final UserRepository userRepository ;
//
//    public UserLoader(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//            loadUserObjects();
//        System.out.println("USER ------------"+userRepository.count());
//        System.out.println(userRepository.findAll());
//    }
//    private void loadUserObjects() {
//        if (userRepository.count() == 0) {
//            userRepository.save(User.builder()
//                    .username("bin")
//                    .password("binkid")
//                    .registeredBy("nahome")
//                    .role("admin")
//                    .bank_id("bankid")
//                    .build()
//            ) ;
//            userRepository.save(User.builder()
//                    .username("bin1")
//                    .password("bink1id")
//                    .registeredBy("1nahome")
//                    .role("1admin")
//                    .bank_id("1bankid")
//                    .build()
//            ) ;
//        }
//    }
//}
