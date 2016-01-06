package com.wuge.duocat.controller;

/**
 * Created by wuhao on 16/1/5.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wuge.duocat.service.ForumService;

@Controller
@RequestMapping("/forums")
public class ForumController {
    @Autowired
    ForumService forumService;
    @RequestMapping(value = "/allforums", method = RequestMethod.GET)
    public String getAllForums(Model model)
    {
        model.addAttribute("fourms", forumService.getAllForums());
        return "forumlist";
    }
}
