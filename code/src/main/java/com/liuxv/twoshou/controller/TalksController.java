package com.liuxv.twoshou.controller;

import com.liuxv.twoshou.po.Talks;
import com.liuxv.twoshou.service.TalksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * created by liuxv on 2018/5/28
 * email:liuxver444@gmail.com
 * qq:1369058574
 */

@Controller
@RequestMapping("/talks")
public class TalksController {

    @Autowired
    private TalksService talksService;

    @RequestMapping("/showTalks")
    public String showTalks(Model model){
        List<Talks> talksList=talksService.getAllTalks();
        model.addAttribute( "talksList",talksList );
        return "talks/showTalks";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam("id") Integer id,Model model){
        talksService.deleteTalks( id );
        return "talks/showTalks";
    }


}
