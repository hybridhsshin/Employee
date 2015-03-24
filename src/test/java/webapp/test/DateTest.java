package webapp.test;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import webapp.esacape.Background;
import webapp.esacape.Screen;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DateTest {
	static Log log = LogFactory.getLog(DateTest.class);
	@Test
	public void test1() {
		Date current = new Date();
		log.info(current.toLocaleString());
	}
	
	@Test
	public void test2() {
		Calendar current = Calendar.getInstance();
		
		log.info(current.getTime().toLocaleString());
	}
	@Test
	public void test3() {
		Date current = new Date();
			
		current.setDate(current.getDate()+10);
		
		
		log.info("year = "+ (current.getYear()+1900));
		log.info("moth = "+ current.getMonth());
		log.info("day = "+ (current.getDate()));
		log.info("week = " + current.getDay());
	}
	@Test
	public void test4(){ //마지막날짜 출력
		Date date = new Date(2015 - 1900, 2-1, 1);
		
		log.info("start week = "+date.getDay());
		
		int month = date.getMonth();
		while(true){
			date.setDate(date.getDate()+1);
			if(month != date.getMonth())
				break;
		}
		date.setDate(date.getDate()-1);
		log.info("end week = "+date.getDay());
		log.info("end date = "+date.getDate());
			
		log.info(date.toLocaleString());
	}
	
	// 1,2,3,4,5,6,7
	// ......
	// ......
	// 29 30 31
	@Test
	public void test5(){
		Date date = new Date(2015-1900, 5-1, 1);
		
		int month = date.getMonth();
		int month1= date.getMonth();
		
		log.info("start week = "+date.getDay() + " ");
		System.out.printf("%5d",date.getDate());
		
		while(true){
			date.setDate(date.getDate()+1);
			
			
			
			if(month!=date.getMonth()){
					break;
			}
			
			
			if(date.getDay()==0){
				System.out.printf("%5d",date.getDate());
			}else if(date.getDay()==1){
				System.out.printf("%5d",date.getDate());
			} else if(date.getDay()==2){
				System.out.printf("%5d",date.getDate());
			}else if(date.getDay()==3){
				System.out.printf("%5d",date.getDate());
			}else if(date.getDay()==4){
				System.out.printf("%5d",date.getDate());
			}else if(date.getDay()==5){
				System.out.printf("%5d",date.getDate());
			}else if(date.getDay()==6){
				System.out.printf("%5d",date.getDate());
			}
			
			if(date.getDay() == 6){
				System.out.println();
			}
		}
	}
	
	
	public void test6(){
		Screen.clear();

		//Screen.background(Background.RED);
		
		Scanner scan = new Scanner(System.in);
		while(true){
			Screen.cursorPosition(5, 1);
			System.out.print("[yyyy/MM] : ");
			String param = scan.nextLine();
			
			if(param.equals(".")) break;
			
			System.out.println("param = "+ param);
		}
		
		//System.out.println("Calender Test");
		//Screen.reset();
	}
	
	//@Test
	public void test56(){
		int day;
		
		Date date = new Date(2015-1900, 3-1, 1);
		int month = date.getMonth();
		
		
		while(true){
			log.info(date.getDate());
			if(date.getDate() == 1)
				break;
			
			date.setDate(date.getDate()+1);
			
			
						
			if(month!=date.getMonth()){
				break;
			}
			
			if(date.getDay() == 6){
				System.out.println();
			}
			System.out.print(date.getDate() + " ");
			
		}
	}
}
