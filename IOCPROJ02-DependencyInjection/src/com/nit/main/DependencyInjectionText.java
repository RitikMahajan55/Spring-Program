package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.WeekMessage;

public class DependencyInjectionText{
    
//	public DependencyInjectionText() {
//		// TODO Auto-generated constructor stub
//		System.out.println("DependencyInjectionText.DependencyInjectionText()");
//	}
	
	public static void main(String[] args) {
		//System.out.println("DependencyInjectionText.main()");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	
		WeekMessage sm = ctx.getBean("wng",WeekMessage.class);
		
		String resultMsg = sm.ShowSeansonMessage();
		System.out.println("Now" +" " +resultMsg);
		
		ctx.close();
	}
}
