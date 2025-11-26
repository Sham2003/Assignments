package com.training.day4;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateUtilsDemo {
	public static void main(String[] args) {
		ZonedDateTime zd1 = ZonedDateTime.now();
		
		System.out.println(zd1);
		System.out.println(zd1.getOffset());
		System.out.println(zd1.getZone());
		ZonedDateTime zd2 = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(zd2);
		System.out.println(zd2.getOffset());
		System.out.println(zd2.getZone());
		
		Duration diff = Duration.between(zd1.toLocalDateTime(), zd2.toLocalDateTime());
		System.out.println(diff.toHours());
		System.out.println(diff.toMinutes());   
		
		LocalDateTime dt2 = LocalDateTime.now();
		System.out.println(dt2);
		ZonedDateTime zdt = dt2.atZone(ZoneId.of("America/New_York"));
		System.out.println(zdt);
		
	}
}
