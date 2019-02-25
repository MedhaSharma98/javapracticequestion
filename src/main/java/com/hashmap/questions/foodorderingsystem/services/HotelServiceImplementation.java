package com.hashmap.questions.foodorderingsystem.services;

import com.hashmap.questions.foodorderingsystem.model.Category;
import com.hashmap.questions.foodorderingsystem.model.Food;
import com.hashmap.questions.foodorderingsystem.model.Hotel;
import com.hashmap.questions.foodorderingsystem.utilty.Themes;
import com.hashmap.questions.foodorderingsystem.utilty.Type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelServiceImplementation implements HotelService {
    private List<Hotel> hotelList=new ArrayList<Hotel>();

    private Map<Food, Integer> mapLakewood = new HashMap<Food, Integer>();
    private Map<Food, Integer> mapBridgewood = new HashMap<Food, Integer>();
    private Map<Food, Integer> mapRidgewood = new HashMap<Food, Integer>();

    public HotelServiceImplementation(){
        intialise();;
    }

    public void intialise(){
        mapLakewood.put(new Food("NOODLES",new Category(Themes.CHINESE, Type.VEG)), 120);
        mapLakewood.put(new Food("PAV BHAJI",new Category(Themes.INDIAN, Type.VEG)), 60);
        mapLakewood.put(new Food("GOLGAPPE",new Category(Themes.INDIAN, Type.VEG)), 20);
        mapLakewood.put(new Food("RAJMA CHAWAL",new Category(Themes.INDIAN, Type.VEG)), 40);
        mapLakewood.put(new Food("PIZZA",new Category(Themes.ITALIAN, Type.VEG)), 200);
        mapLakewood.put(new Food("THAI CURRY",new Category(Themes.CONTINENTAL, Type.VEG)), 320);

        mapBridgewood.put(new Food("NOODLES",new Category(Themes.CHINESE, Type.VEG)),100);
        mapBridgewood.put(new Food("PAV BHAJI",new Category(Themes.INDIAN, Type.VEG)),50);
        mapBridgewood.put(new Food("GOLGAPPE",new Category(Themes.INDIAN, Type.VEG)), 20);
        mapBridgewood.put(new Food("PIZZA",new Category(Themes.ITALIAN, Type.NONVEG)), 200);

        mapRidgewood.put(new Food("NOODLES",new Category(Themes.CHINESE, Type.VEG)),100);
        mapRidgewood.put(new Food("PAV BHAJI",new Category(Themes.INDIAN, Type.VEG)), 60);
        mapRidgewood.put(new Food("GOLGAPPE",new Category(Themes.INDIAN, Type.VEG)), 40);
        mapRidgewood.put(new Food("RAJMA CHAWAL",new Category(Themes.INDIAN, Type.VEG)),50);
        mapRidgewood.put(new Food("PIZZA",new Category(Themes.ITALIAN, Type.VEG)),200);
        mapRidgewood.put(new Food("THAI CURRY",new Category(Themes.CONTINENTAL, Type.VEG)), 320);

        hotelList.add(new Hotel("LAKEWOOD",3,mapLakewood));
        hotelList.add(new Hotel("BRIDGEWOOD",3,mapBridgewood));
        hotelList.add(new Hotel("RIDGEWOOD",3,mapRidgewood));
    }

    public void showMenu(Hotel hotel){
    System.out.println("ITEM NAME      THEME     TYPE     COST/plate");
     for (Map.Entry<Food, Integer> map :hotel.getMenu().entrySet() ) {
    System.out.println(map.getKey().getFoodName() + "  " +map.getKey().getCategory().getTheme()
    + "  "+ map.getKey().getCategory().getType()+"  "+map.getValue());   }
    }

    public List<Hotel> getHotelList(){
        return  hotelList;
    }

    public void addHotel(Hotel hotel){
        hotelList.add(hotel);
    }

    public void removeHotel(Hotel hotel){
        hotelList.remove(hotel);
    }
}
