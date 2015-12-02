package pengliu.me.dubbo.client;

import com.heika.verify.flow.bean.VerifyUserStatusVo;
import com.heika.verify.flow.inerface.IVerifyFlowService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationConsumer_flowTask.xml"});
        context.start();
        System.out.println("Start to getBean...");
        IVerifyFlowService flowTaskService = (IVerifyFlowService) context.getBean("flowService");
        flowTaskService.initVerifyUserStatus(100034834);
        flowTaskService.commitVerifyUserStatus(100034834);
        //VerifyUserStatusVo verifyUserStatusVo = flowTaskService.loadVerifyUserStatusByUserId(100034635);
    }
}
