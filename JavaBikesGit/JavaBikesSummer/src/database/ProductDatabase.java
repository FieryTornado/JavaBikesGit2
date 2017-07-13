package database;

import java.util.ArrayList;

import model.*;

public class ProductDatabase {
	
	ArrayList<Bike>BikeList = new ArrayList<Bike>();
	ArrayList<Ebike>EbikeList = new ArrayList<Ebike>();
	
	public void bikeList()
	{
		BikeList.add(new Bike("Elite", null, null, null));
	}

}
