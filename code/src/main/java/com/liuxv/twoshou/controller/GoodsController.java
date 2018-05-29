package com.liuxv.twoshou.controller;

import com.liuxv.twoshou.po.Goods;
import com.liuxv.twoshou.service.GoodsService;
import com.sun.org.apache.xpath.internal.operations.Mod;
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
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;


    @RequestMapping("/showGoods")
    public String showGoods(Model model){

        List<Goods> goods=goodsService.findGoodsList();
        System.out.println( goods.size() );
        model.addAttribute( "goodsList",goods );
        return "goods/showGoods";
    }

    @RequestMapping("/write")
    public String write(){
        return "blog/write";
    }



    @RequestMapping("/insert")
    public String insert(Goods goods, Model model){
        goodsService.insertGoods( goods );
        return "redirect:/goods/showGoods";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam(value = "name") String name, Model model){
        goodsService.deleteGoods( name );
        return "redirect:/goods/showGoods";
    }

}
