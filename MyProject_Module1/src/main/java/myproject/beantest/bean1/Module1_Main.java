package myproject.beantest.bean1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Module1_Main {

    public Module1_Main() {
    }

    public static void main (String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("myconfig.xml");

        RandomObject randomObject = context.getBean("bean1", RandomObject.class);
        //The alternative way of this is to do a cast.
        RandomObject randomObject2 = (RandomObject)context.getBean("bean1");


        System.out.println(randomObject);
        System.out.println("Second Object - " + randomObject2);



/*
        //This would have been the old way of doing this stuff, but now XMLBeanFactory is Deprecated

        Resource resource = new ClassPathResource("myconfig.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        RandomObject r1 = factory.getBean("bean1", RandomObject.class);

        System.out.print(r1);
*/

    }
}
