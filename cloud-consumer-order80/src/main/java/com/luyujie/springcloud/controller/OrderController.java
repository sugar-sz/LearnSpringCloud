package com.luyujie.springcloud.controller;

import com.luyujie.springcloud.entities.CommonResult;
import com.luyujie.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    public static final String PAYMENT_URL = "http://localhost:8001";

    @PostMapping("/save")
    public ResponseEntity<CommonResult> save(@RequestBody Payment payment){
        return restTemplate.postForEntity(PAYMENT_URL + "/payment/save",payment,CommonResult.class);
    }

    @GetMapping("/get/{id}")
    public CommonResult get(@PathVariable Long id){
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id,CommonResult.class);
    }


}
