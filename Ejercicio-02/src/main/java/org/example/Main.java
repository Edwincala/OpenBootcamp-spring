package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        NotificationService notification = (NotificationService) context.getBean("notificationService");
        notification.imprimeSaludo();

        UserService user  = (UserService) context.getBean("userService");
        user.notification.imprimeSaludo();
    }
}