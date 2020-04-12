package com.gzsxt.springboot;

import com.gzsxt.springboot.mail.MyMailSender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private MyMailSender myMailSender;

    @Test
    void contextLoads() {
        myMailSender.say();
    }

}
