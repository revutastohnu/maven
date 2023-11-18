package com.popko.app.hw30;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        MyService service1 = context.getBean("myService1", MyService.class);
        System.out.println(service1);

        MyService service2 = context.getBean("myService2", MyService.class);
        System.out.println(service2);

        MyRepository repository = context.getBean(MyRepository.class);
        System.out.println(repository);

        context.close();
    }
}
