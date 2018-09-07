package com.way.springcloudrabbitmq.test;

import com.way.springcloudrabbitmq.controller.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: Way Leung wayleung13@163.com
 * @Date: 9/7/2018 11:21
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApplicationTest {

    @Autowired
    private Sender sender;

    @Test
    public void hello() {
        sender.send("way");
    }

}
