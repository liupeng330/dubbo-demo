package pengliu.me.dubbo.service.impl;

import pengliu.me.dubbo.service.DemoService;

import java.util.Date;

public class DemoServiceImpl implements DemoService
{
    public String sayHello(String str)
    {
        String output = "Server " + new Date();
        System.out.println(output);

        return output;
    }
}
