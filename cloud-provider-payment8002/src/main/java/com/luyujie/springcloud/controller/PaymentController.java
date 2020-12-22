package com.luyujie.springcloud.controller;

import com.luyujie.springcloud.entities.CommonResult;
import com.luyujie.springcloud.entities.Payment;
import com.luyujie.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/save")
    public CommonResult save(@RequestBody Payment payment){
        return paymentService.save(payment);
    }

    @GetMapping("/get/{id}")
    public CommonResult get(@PathVariable("id") Long id){
        return paymentService.get(id);
    }

    @GetMapping("/lb")
    public String getPaymentLB(){
        return serverPort;
    }
}
