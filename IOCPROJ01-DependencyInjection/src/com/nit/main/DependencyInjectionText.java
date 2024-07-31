package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.WishMessageGenerator;

public class DependencyInjectionText {
   public static void main(String[] args){
	
	  AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	
	  WishMessageGenerator generator = ctx.getBean("wmg",WishMessageGenerator.class);
	
	  String resultMsg = generator.showWishMessage(" ram");
      System.out.println(resultMsg);
      ctx.close();
   }
}
