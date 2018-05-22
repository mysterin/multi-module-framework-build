package com.xxbb.controller;

import com.xxbb.model.FrameworkInfo;
import com.xxbb.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    private MainService mainService;

    @RequestMapping("/getFrameworkInfo")
    public FrameworkInfo getFrameworkInfo(Long id) {
        if(id == null) {
            id = 1L;
        }
        return mainService.getFrameworkInfoById(id);
    }
}
