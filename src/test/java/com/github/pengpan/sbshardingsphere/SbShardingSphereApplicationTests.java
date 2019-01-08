package com.github.pengpan.sbshardingsphere;

import com.github.pengpan.sbshardingsphere.mapper.OrderMapper;
import com.github.pengpan.sbshardingsphere.model.Order;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class SbShardingSphereApplicationTests {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void contextLoads() {
        orderMapper.insertOrder(new Order(null, 1, "OK"));
        orderMapper.insertOrder(new Order(null, 2, "OK"));

        orderMapper.selectByUserId(1).forEach(System.out::println);
        orderMapper.selectByUserId(2).forEach(System.out::println);
    }

}

