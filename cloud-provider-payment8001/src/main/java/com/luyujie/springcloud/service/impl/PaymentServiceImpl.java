package com.luyujie.springcloud.service.impl;

import com.luyujie.springcloud.dao.PaymentMapper;
import com.luyujie.springcloud.entities.CommonResult;
import com.luyujie.springcloud.entities.Payment;
import com.luyujie.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public CommonResult<Integer> save(Payment payment) {
        CommonResult<Integer> commonResult = new CommonResult<>();
        int count;
        if( (count = paymentMapper.save(payment)) > 0){
            commonResult.setCode(200);
            commonResult.setMessage("200");
            commonResult.setData(count);
            log.info("插入成功{}",count);
        }
        return commonResult;
    }

    @Override
    public CommonResult<Payment> get(Long id) {
        CommonResult<Payment> commonResult = new CommonResult<>();
        Payment payment = paymentMapper.get(id);
        if(payment != null){
            commonResult.setCode(200);
            commonResult.setMessage("success");
            commonResult.setData(payment);
        }
        return commonResult;
    }

}


