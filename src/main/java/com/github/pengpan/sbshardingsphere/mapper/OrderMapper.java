package com.github.pengpan.sbshardingsphere.mapper;

import com.github.pengpan.sbshardingsphere.model.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    List<Order> selectByUserId(Integer userId);

    List<Order> selectByOrderIdBetween(@Param("startOrderId") Long startOrderId, @Param("endOrderId") Long endOrderId);

}
