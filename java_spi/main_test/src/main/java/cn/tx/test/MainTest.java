package cn.tx.test;

import cn.tx.service.PayService;
import cn.tx.service.impl.Alipay;

import java.util.ServiceLoader;

public class MainTest {
    public static void main(String[] args) {
        ServiceLoader<PayService> load = ServiceLoader.load(PayService.class);
        for (PayService payService : load){
            System.out.println(payService);
            payService.pay();
        }
    }
}
