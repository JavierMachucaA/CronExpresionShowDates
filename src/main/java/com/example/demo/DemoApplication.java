package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.support.CronSequenceGenerator;

import java.util.Date;
import java.util.GregorianCalendar;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		String cronExpr = "0 0 20 */15 * *";
		CronSequenceGenerator generator = new CronSequenceGenerator(cronExpr);
		Date next = new GregorianCalendar(2020, 5,1).getTime();
		System.out.println("now time:\t" + next);
		for (int i = 0 ; i < 10 ; i ++) {
			next = generator.next(next);
			System.out.println("next run time:\t" + next);
		}
	}

}
