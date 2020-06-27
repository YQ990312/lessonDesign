package org.ecut;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DynamicMain {
	public static void main(String [] ags) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		SaySomeThing say=(SaySomeThing)ac.getBean("proxy2");
		say.SayAge();
		say.SayLikeyou();
		say.SayName();
	}
}
