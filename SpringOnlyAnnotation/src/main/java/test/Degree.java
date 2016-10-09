package test;

import org.springframework.stereotype.Component;

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

@Component("degree")
public class Degree {
	private String school;
	private String publishDate;
	private int type;

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Degree{" +
				"school='" + school + '\'' +
				", publishDate='" + publishDate + '\'' +
				", type=" + type +
				'}';
	}
}
