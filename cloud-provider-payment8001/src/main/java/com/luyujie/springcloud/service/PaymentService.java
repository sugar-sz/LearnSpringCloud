package com.luyujie.springcloud.service;

import com.luyujie.springcloud.entities.CommonResult;
import com.luyujie.springcloud.entities.Payment;

public interface PaymentService {
    CommonResult<Integer> save(Payment payment);

    CommonResult<Payment> get(Long id);
}
