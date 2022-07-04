package com.example.getorder.services;

import com.example.getorder.documents.Order;
import com.example.getorder.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Iterable<Order> getAll() {
        return orderRepository.findAll();
    }
    //==============================================================================
    public String checkExecType(String side) {
        String result = null;
        if (side == null) {
            return null;
        }

        switch (side) {
            case "1":
                result ="NB";
                break;
            case "2":
                result ="NS";
                break;
        }
        return result;
    }
//ordertype = 40, timeinforce = 59
    public String checkPriceType(String orderType, String timeInForce) {

        String result = null;

        if (orderType == null || timeInForce == null) {
            return null;
        }
        if (timeInForce == "2" && orderType == "1") {
            result = "ATO";
        } else if (timeInForce == "7" && orderType == "1") {
            result = "ATC";
        } else if (timeInForce == "0" && orderType == "1") {
            result = "MP, MTL";
        } else if (timeInForce == "4" && orderType == "1") {
            result = "MOK";
        } else if (timeInForce == "3" && orderType == "1") {
            result = "MAK";
        } else if (timeInForce == "0" && orderType == "2") {
            result = "LO";
        } else if (timeInForce == "7" && orderType == "J") {
            result = "PLO";
        }
        return result;
    }
}
