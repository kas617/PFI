

import java.util.ArrayList;

public class BikeStore {

		public ArrayList <String> allBikes;
		public String allBikesString;
		public String newBike;
		
		//Constructor
		public BikeStore(){
		allBikes = new ArrayList<String>();
		allBikesString = "";
		newBike = "";
		}
		
		
		public String getAllBikes(){
			for (String bike : allBikes){
				allBikesString += bike + "\n";
			}
			return allBikesString;
		}
		
		public String addBike(String Color, String Size, String Price) {
			allBikes.add("Color:" + Color + "Size: " + Size + "price:" + Price + "\n");
			String thisBike = allBikes.get(allBikes.size()-1);
			return thisBike;
		}
}
