package pengliu.me.dubbo.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pengliu.me.dubbo.service.DemoService;

import java.util.Date;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationConsumer.xml"});
        context.start();
        System.out.println("Start to getBean...");
        DemoService demoService = (DemoService) context.getBean("demoService");
        while(true)
        {
            System.out.println("Start to invoking...");
            demoService.sayHello("From client, " + new Date());
            Thread.sleep(1000);
            System.out.println("End invoking...");
        }
    }
}
