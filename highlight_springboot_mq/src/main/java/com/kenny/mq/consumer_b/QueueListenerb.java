package com.kenny.mq.consumer_b;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class QueueListenerb {
    @JmsListener(destination = "publish.queue", containerFactory = "jmsListenerContainerQueue")
    @SendTo("out.queue")
    public String receive(String text) {
        System.out.println("QueueListener: consumer-b 收到一条信息:" + text);
        return "consumer-b received : " + text;
    }
}
