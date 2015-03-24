package webapp.main;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import webapp.esacape.Background;
import webapp.esacape.Foreground;
import webapp.esacape.Screen;



public class CalenderTest {
	public static void printCalendar(int year, int month){
		Screen.cursorPosition(3, 5);
		
		System.out.println("year = "+year +", month = "+month);
		Calendar c = Calendar.getInstance();
		
		Date date = new Date(year-1900, month-1, 1);
		
		month = date.getMonth();
		
		//System.out.printf("%5d",date.getDate());
		for(int i=0; i<date.getDay(); i++){
			System.out.print("     ");
		}
		
		while(true){	
			if(date.getDate()==1){
				System.out.printf("%5d", date.getDate());
			}
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
	public static void main(String[] args) {
	
		Screen.clear();
		
		Scanner scan = new Scanner(System.in);
		String param="";
		while(true){
			boolean flag= true;
			do{
				flag=true;
				Screen.cursorPosition(20, 1);
				System.out.print("[yyyy/MM] : ");
				param = scan.nextLine();
				Screen.clear();
				System.out.println("param = "+param);
				
				// flag = param.matches("[1-9][0-9][0-9][0-9]/[0-9][0-9]");
				flag = param.matches("[1-9][0-9]{3}/[0-1][0-9]");
			}while(!flag);
			
			StringTokenizer tokens = new StringTokenizer(param, "/");
			int year = Integer.parseInt((String)tokens.nextElement()); 
			int month= Integer.parseInt((String) tokens.nextElement());
			
			if(month > 0 && month < 13){
				printCalendar(year, month);
			}
		}
	}
}
