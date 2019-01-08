package com.github.pengpan.sbshardingsphere;

import com.github.pengpan.sbshardingsphere.mapper.OrderMapper;
import com.github.pengpan.sbshardingsphere.model.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SbShardingSphereApplicationTests {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void contextLoads() {
        List<Order> orders = orderMapper.selectByUserId(123);
        orders.forEach(System.out::println);
    }

}

