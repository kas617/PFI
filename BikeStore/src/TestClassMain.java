

import java.util.ArrayList;

import javax.swing.JTextArea;

public class TestClassMain {
	
	//JTextArea textArea = new JTextArea();
	private ArrayList<Bike> myBikes;
	public static void main (String[] args){
	
		
	//bikes = new ArrayList<Bike>();

	ArrayList<Bike> myBikes = new ArrayList <Bike>();
	
	myBikes.add (new Bike ("Yellow", 21, 4000));
	myBikes.add (new Bike ("Green", 16, 5000));
	myBikes.add (new Bike ("Red", 20, 6000));
	myBikes.add (new Bike ("Yellow", 21, 7000));
	myBikes.add (new Bike ("Multicolor", 18, 4000));
	myBikes.add (new Bike ("Multicolor", 20, 3000));
	myBikes.add (new Bike ("red", 21, 3000));
	myBikes.add (new Bike ("Yellow", 21, 5000));
	myBikes.add (new Bike ("Red", 20, 5500));

	//Check why is only returning the last bike color!!!!
for (int i = 0; i < myBikes.size(); i++){
	System.out.println ("the bike Nr"+ String.valueOf(i+1 )+ "///its color is :" + String.valueOf(myBikes.get(i).getColor())+ " ,the Wheel size is:"+ String.valueOf(myBikes.get(i).getSize())+ " and the price is:"+ String.valueOf(myBikes.get(i).getPrice()));
	}
	}

}