package com.can.controller;

import com.can.service.MyServerRemote;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: LCN
 * @date: 2019-10-03 09:56
 */

@RestController
public class FeignController {

    @Resource
    private MyServerRemote myServerRemote;

    @GetMapping("/feign/{id}")
    public String feign(@PathVariable("id") int id) {
        String result = myServerRemote.server(id);
        return result;
    }
}
