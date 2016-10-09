package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Project: SpringOnly
 * Comments: <对此类的描述，可以引用系统设计中的描述>
 * JDK Version Used: JDK 1.8
 * Author: Wang Wenchao
 * Create Date: 2016-10-8 16:42
 * Version: <版本号>
 * *************************************
 * Modified By: <修改人中文名或拼音缩写>
 * Modified Date：<修改日期，格式:YYYY-MM-DD>
 * Reason：<修改原因描述>
 * Version：<版本号>
 */

@Component("student")
public class Student {
	private String name;
	private int age;

	@Autowired
	@Qualifier("degree")
	private Degree degree;

//	@Resource
//	private Degree degree;

	public String print(int age) {
		System.out.println("Student::print() " + age + ", " + degree);
		return name;
	}
}
