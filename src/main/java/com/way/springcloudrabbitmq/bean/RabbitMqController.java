package com.way.springcloudrabbitmq.bean;

import com.way.springcloudrabbitmq.controller.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//import javax.servlet.http.HttpSession;

/**
 * @Auther: Way Leung wayleung13@163.com
 * @Date: 9/7/2018 10:37
 * @Description:
 */
@RestController
@RequestMapping(value = "/rabbitmq")
public class RabbitMqController {

    @Autowired
    private Sender sender;

    @RequestMapping(value = "sendMessage",method = RequestMethod.GET)
    @ResponseBody
    public String sendMessage(){
       return sender.send("way");
    }

}
