package com.liuxv.twoshou.controller;

import com.liuxv.twoshou.po.Orders;
import com.liuxv.twoshou.po.User;
import com.liuxv.twoshou.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * created by liuxv on 2018/5/27
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@Controller
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    @RequestMapping("/showOrders")
    public String showOrders(Model model){
        List<Orders> orders=ordersService.findAllOrders();
        model.addAttribute( "ordersList",orders );
        return "/orders/showOrders";
    }



    @RequestMapping("/insert")
    public String insert(Model model , Orders orders){
        ordersService.insertOrders( orders );
        return "redirect:/orders/showOrders";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam(value = "name") String name, Model model){
        ordersService.deleteOrders( name );
        return "redirect:orders/showOrders";
    }


    @RequestMapping("/findOrdersByUser")
    public String findOrdersByUser(User user,Model model){
        List<Orders> orders=ordersService.findOrdersByUser( user );
        model.addAttribute( "ordersList",orders );
        return "/findOrdersByUser";
    }



}
