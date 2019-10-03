package com.can.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @description: 接口的参数需要和远程调用的参数保持一致
 * @author: LCN
 * @date: 2019-10-03 10:08
 */
@FeignClient(name = "eureka-client-one")
public interface MyServerRemote {


    @GetMapping("/server/{id}")
    String server(@PathVariable("id")int id);
}
