package com.can.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @description:
 * @author: LCN
 * @date: 2019-10-02 15:38
 */
@RestController
public class RestTemplateController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/rest/{id}")
    public String restTemplate(@PathVariable("id") int id) {

        /**
         * 此处需要在 host 文件 配置  localhost : 127.0.0.1
         *
         * 有的人此处不加端口，也能调用到，
         * 但是我测试的时候，会报java.net.ConnectException: Connection refused: connect
         * 加上端口就能调用到, 就没做什么处理了， 后续推荐使用 Fetch 代替 RestTemplate, 就不做深究了
         * */

        String url = "http://EUREKA-CLIENT-ONE/server/" + id;
        String result = restTemplate.getForObject(url, String.class);
        return result;
    }
}
