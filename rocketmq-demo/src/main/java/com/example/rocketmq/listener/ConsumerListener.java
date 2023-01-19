package com.example.rocketmq.listener;

import org.apache.rocketmq.spring.annotation.ConsumeMode;
import org.apache.rocketmq.spring.annotation.MessageModel;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.annotation.SelectorType;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

@Component
@RocketMQMessageListener(topic = "test_topic_a", consumerGroup = "producer_group_a",
        selectorExpression = "TagA", selectorType = SelectorType.TAG,
        messageModel = MessageModel.CLUSTERING, consumeMode = ConsumeMode.CONCURRENTLY)
public class ConsumerListener implements RocketMQListener<String> {
    @Override
    public void onMessage(String message) {
        try {
            System.out.println("接收到rocketmq消息:" + message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
