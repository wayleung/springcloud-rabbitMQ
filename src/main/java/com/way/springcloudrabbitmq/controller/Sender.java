package com.way.springcloudrabbitmq.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Auther: Way Leung wayleung13@163.com
 * @Date: 9/6/2018 18:02
 * @Description:
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public String send(String name){

        String context  = "hello "+name+" ,now the time is"+new Date();
        this.rabbitTemplate.convertAndSend("hello",context);
        return context;
    }
}
