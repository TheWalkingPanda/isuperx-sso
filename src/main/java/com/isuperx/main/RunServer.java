package com.isuperx.main;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunServer {
	private static Log log = LogFactory.getLog(RunServer.class);
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		context.start();//完成bean对象的初始化工作
		
		log.info("isperx-sso服务启动成功 : ");
		log.info("输入任意字符停止服务 : ");
		try {
			System.in.read();
		} catch (IOException e) {
			log.error(e);
		}
	}
}
