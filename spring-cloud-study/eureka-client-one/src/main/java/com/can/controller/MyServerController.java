package com.can.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: LCN
 * @date: 2019-10-02 14:51
 */

@RestController
public class MyServerController {

    @GetMapping("/server/{id}")
    public String server(@PathVariable("id") int id) {
        return "收到请求, 已派遣" + id+ "出发了";
    }
}
