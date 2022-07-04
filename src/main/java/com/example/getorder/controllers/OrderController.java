package com.example.getorder.controllers;

import com.example.getorder.OrderDTO;
import com.example.getorder.documents.Order;
import com.example.getorder.mappers.OrderMapper;
import com.example.getorder.services.OrderService;
import com.example.getorder.utils.TradePlace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/getAllOrder")
    public Iterable<OrderDTO> getAll() {
        Iterable<Order> orders =  orderService.getAll();
        List<OrderDTO> orderDTOS = new ArrayList<>();
        for (Order order : orders) {
            OrderDTO orderDTO = OrderMapper.INSTANCE.entityToDTO(order);
            orderDTO.setEXECTYPE(orderService.checkExecType(order.getSide()));
            orderDTO.setPRICETYPE(orderService.checkPriceType(order.getOrderType(), order.getTimeInForce()));
            orderDTOS.add(orderDTO);
        }
        return orderDTOS;
    }
}
