import java.awt.Color;
import java.util.Arrays;


public class Bike {
 
	public static String Color;
	public int Price;
	public int Size;
	public static int nbrOfBikes;
	
	
	//Constructor 1
	public Bike (String ColorTemp, int SizeTemp) {
	this.Color = ColorTemp;
	this.Size = SizeTemp;
	nbrOfBikes++;
	
	}
	
	//Constructor 2
	public Bike (String ColorTemp, int SizeTemp, int PriceTemp){
	
	nbrOfBikes++;
	//Setting for price, size and color limits	
    boolean found = false;
    
	this.Color = ColorTemp;
	if (Arrays.asList(Constants.AVAILABLE_COLORS).contains (ColorTemp)){
		Color = ColorTemp;
		found = true;
	}else if(found==false){
		Color= "Color not available";
	}
	
	
	this.Price = PriceTemp;
	if (PriceTemp < Constants.MIN_PRICE || PriceTemp > Constants.MAX_PRICE){
		throw new IllegalArgumentException (PriceTemp + "Is an invalid price ");
	}else {
		Price = PriceTemp;
	}
	
	this.Size = SizeTemp;
	if(SizeTemp < Constants.MIN_SIZE || SizeTemp > Constants.MAX_SIZE){
	   throw new IllegalArgumentException(SizeTemp + "Is an unvalid size");	
	}else{
		Size = SizeTemp;
	}
	
	
	
	}
	
	
	//Methods
	/**Method to get color*/
	public String getColor() {
		return Color;		
		
	}
	/**Method to get size*/
	public int getSize(){
		return Size;
	}
	/**Method to get Price*/
	public int getPrice(){
		return Price;
	}
	/**Method to set price*/
	public void setPrice(int Price){
		this.Price = Price;
	}
}
