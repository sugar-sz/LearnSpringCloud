package com.luyujie.springcloud.service;


import com.luyujie.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "cloud-payment-service")
public interface PaymentFeignService {
    @RequestMapping("/payment/get/{id}")
    CommonResult get(@PathVariable("id") Long id);
}
