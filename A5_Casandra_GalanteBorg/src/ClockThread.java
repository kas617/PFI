import java.awt.*;
import java.util.*;

public class ClockThread extends Thread {
	
	String currentTime;
	Label labelToChange;
	boolean keepGoing = true; //While loop (constant)
	
	
	//The Constructor
	
	ClockThread(Label lbl){
		super();
		labelToChange = lbl;
	}
	
	//Method 1
	
	public void stopLoping(){
		keepGoing = false;
		
	}
	
	//Method 2
	
	public void run(){
	while (keepGoing){
		try {
		
			Thread.sleep(900);
		} catch (InterruptedException e){
			e.printStackTrace();
		
		}
		
		//Variables
		
		currentTime = String.valueOf(new Date());
		labelToChange.setText(currentTime);
	}
		
	}
	
}