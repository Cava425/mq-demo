package com.example.rocketmq;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RocketmqDemoApplicationTests {

    @Autowired
    MessageSender sender;

    @Test
    void contextLoads() {
        sender.syncSend();
    }

}
