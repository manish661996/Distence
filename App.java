package com.bridgelabz.Distence;

//import org.apache.logging.log4j.Logger;



import java.util.Scanner;
//import org.apache.logging.log4j.LogManager;
/**
 * Hello world!
 *
 */
public class App 
{
	//private static final Logger Log = LogManager.getLogger(App.class);
	private int x;
	private int y;
	public static void main( String[] args )
	{
		/*// this section of the code will generate log file and print log message on console
		String message="Welcome ";
		Log.debug(message + " will be printed on Debug");
		Log.info(message + " Will be printed on info");
		Log.warn(message + " will be printed on warn");
		Log.error(message + " will be printed on error");
		Log.fatal(message + " will be printed on fatal");
		Log.info("Appending String: {}.", message);
		System.out.println(message);
		 */
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		App a = new App();
		a.setX(x);
		a.setY(y);
		a.calDistence();

	}
	public void setX(int i) {
		this.x = i;
	}
	public void setY(int j) {
		this.y = j;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public void calDistence() {
		System.out.println("Distence of line is : "+  Math.sqrt(   (Math.pow(x, 2))+(Math.pow(y, 2))));
	}



}
