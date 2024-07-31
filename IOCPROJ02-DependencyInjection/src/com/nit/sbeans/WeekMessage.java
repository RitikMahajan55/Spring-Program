package com.nit.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wng")
public class WeekMessage {
	
//	public WeekMessage() {
//		// TODO Auto-generated constructor stub
//		System.out.println("WeekMessage.WeekMessage()");
//	}
       
	@Autowired
	private LocalDate dateTime;
	
	public String ShowSeansonMessage() {
//		System.out.println("WeekMessage.ShowSeansonMessage()");
		Integer month = dateTime.getMonthValue();
		
		if(month==12|| month==1|| month==2)
			return "Winter";
		else if(month==3|| month ==4 ||month==5)
			return "summer";
		else if(month ==6|| month==7 ||month==8 ||month==9)
			return "rain";
		else
			return "Spring";
	}
}
