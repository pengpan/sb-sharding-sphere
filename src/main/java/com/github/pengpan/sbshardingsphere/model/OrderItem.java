package com.github.pengpan.sbshardingsphere.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {
    private Long orderItemId;

    private Long orderId;

    private Integer userId;
}
