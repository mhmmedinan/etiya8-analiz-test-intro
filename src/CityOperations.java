import java.util.ArrayList;
import java.util.List;

public class CityOperations {
    private static List<String> cities= new ArrayList<>();
    public static void main(String[] args) {
      addCity("İstanbul");
      addCity("Ankara");

      updateCity("İzmir","Antalya");

      List<String> cities = getCities();
      for(String city:cities){
          System.out.println(city);
      }

    }


    public static boolean addCity(String cityName){
        if(!cities.contains(cityName)){
            cities.add(cityName);
            System.out.println(cityName + " şehri başarıyla eklendi");
            return true;
        }
        else{
            System.out.println(cityName + " şehri zaten var");
            return false;
        }
    }

    public static List<String> getCities(){
        return cities;
    }

    public static boolean updateCity(String oldCityName,String newCityName){
        if(cities.contains(oldCityName)){
            int index = cities.indexOf(oldCityName);
            cities.set(index,newCityName);
            System.out.println(oldCityName + " şehri " + newCityName + " ile başarıyla güncellendi");
            return true;
        }
        else{
            System.out.println(oldCityName + " Şehri bulunamadı");
            return false;
        }
    }
}
