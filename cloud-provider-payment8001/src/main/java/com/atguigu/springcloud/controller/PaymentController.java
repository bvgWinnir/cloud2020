package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Payment)表控制层
 *
 * @author makejava
 * @since 2020-03-11 14:56:48
 */
@Slf4j
@RestController
@RequestMapping("payment")
public class PaymentController {
    /**
     * 服务对象
     */
    @Resource
    private PaymentService paymentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/get/{id}")
    public CommonResult selectOne(@PathVariable("id") Long id) {
        Payment payment = paymentService.queryById(id);
        log.info("查询成功-----------------------------------------------------"+payment);
        if (payment!=null) return new CommonResult(200,"查询成功",payment);
        else return new CommonResult(500,"未找到"+id);
    }

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment){
        Payment insert = paymentService.insert(payment);
        log.info("添加成功-----------------------------------------------------");
        if (insert!=null) return new CommonResult(200,"插入数据库成功",insert);
        else return new CommonResult(500,"error");
    }

}