package package1;

import java.util.Date;

public class EpochTime {

	public static void main(String[] args) {
	Date d1 =new Date();// we are getting Epoch time by creating Date class object
	
           System.out.println(d1.getTime());//taking default time of our system
       Date d2=new Date(d1.getTime()+(1000*60*60*24*0));//1000is mili sec,24hour and 1 day(no.of days you want)//converting epoch time into human language
           System.out.println(d2);
           String formatofdate= d2.toString();
           int length=formatofdate.length();
           System.out.println(length);
           String year=formatofdate.substring(24);
           System.out.println(year);
           String month=formatofdate.substring(4,7);
           System.out.println(month);
           String date=formatofdate.substring(8,10);
           System.out.println(date);
           String format1=date.concat(month).concat(date);
           System.out.println(format1);
           String format2=date.concat("/").concat(month).concat("/").concat(year);
           System.out.println(format2);
           
	}

}
