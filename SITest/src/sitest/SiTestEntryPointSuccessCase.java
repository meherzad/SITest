package sitest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.common.collect.ImmutableList;

public class SiTestEntryPointSuccessCase {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("bundle.xml");
        Processingintiator processingIntiator = (Processingintiator) context.getBean("processingIntiator");
        ImmutableList<PayloadContent> message = ImmutableList.of(new PayloadContent("Test1", 1), new PayloadContent("Test2", 2));

        processingIntiator.processThroughSmartChannel(message);
    }
}
