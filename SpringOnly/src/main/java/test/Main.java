package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Project: SpringOnly
 * Comments: <对此类的描述，可以引用系统设计中的描述>
 * JDK Version Used: JDK 1.8
 * Author: Wang Wenchao
 * Create Date: 2016-10-8 16:26
 * Version: <版本号>
 * *************************************
 * Modified By: <修改人中文名或拼音缩写>
 * Modified Date：<修改日期，格式:YYYY-MM-DD>
 * Reason：<修改原因描述>
 * Version：<版本号>
 */

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Student student = (Student) context.getBean("student");
		Student student2 = context.getBean(Student.class);
		System.out.println("name: " + student.print(20));
	}
}
