package Atividades;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Scanner;

public class TestDate {

	public static void main(String[] args) throws Exception{

		Calendar c = Calendar.getInstance();
		System.out.println("Today is  "+c.getTime());

		try (Scanner = new Scanner(System.in)) {
			LocalDate birthday = LocalDate.of(1974, Month.MAY, 4);
				}
		LocalDate today = LocalDate.now(); 
		Period p = Period.between(birthday, today);
		long p2 = ChronoUnit.DAYS.between(birthday, today);
		System.out.println("You are " + p.getYears() + " years, " + p.getMonths() + " months, and " + p.getDays()
				+ " days old. (" + p2 + " days total)");
	}

}
