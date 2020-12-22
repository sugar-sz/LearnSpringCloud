package com.luyujie.springcloud.controller;

import com.luyujie.springcloud.entities.CommonResult;
import com.luyujie.springcloud.service.PaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderFeignController {
    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping("/orderFeign/get/{id}")
    public CommonResult get(@PathVariable Long id){
        return paymentFeignService.get(id);
    }
}
