package com.luyujie.springcloud.dao;

import com.luyujie.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentMapper {

    int save(@Param("param") Payment payment);

    Payment get(@Param("id") Long id);
}
