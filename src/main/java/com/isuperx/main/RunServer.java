package com.isuperx.main;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunServer {
	private static Log log = LogFactory.getLog(RunServer.class);
	
	public static void main(String[] args) {
		initServer();
	}
	
	private static void initServer(){
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
			context.start();//完成bean对象的初始化工作
			log.info("isperx-sso服务启动成功 : ");
			
			synchronized(context){
				context.wait();
			}
		} catch (Exception e) {
			log.error(e);
		}
	}
}
