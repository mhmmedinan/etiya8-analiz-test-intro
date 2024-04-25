import java.util.ArrayList;
import java.util.List;

public class method2 {

    private static List<String> products = new ArrayList<>();
    private static List<String> customers = new ArrayList<>();



    public static void main(String[] args) {
     textLength("Merhaba");
     String result = addProduct("Bilgisayar");
     System.out.println(result);

     //---------------------------------------------------

     int[] numbers = {45,52,68,70,85};
     int bigNumber = getBigNumber(numbers);
     System.out.println("Dizideki en büyük sayı : " + bigNumber);

     //---------------------------------------------------------

     addCustomer("Muhammed");
     addCustomer("Kubilay");

     boolean response = customerSearch("Kubilay");
     System.out.println("Müşteri Var mı?" + response);

     //-----------------------------------------------------------

    }

    public static String textLength(String text){
        System.out.println("Metin uzunluğu : " + text.length());
        return "Metin uzunluğu başarıyla hesaplandı";
    }


    //product operations
    public static String addProduct(String productName){
        products.add(productName);
        return productName + "başarıyla eklendi";
    }

    public static int getBigNumber(int[] numbers){
        int bigNumber = numbers[0];
        for(int number:numbers){
            if(number>bigNumber){
                bigNumber=number;
            }
        }
        return bigNumber;
    }

    public static boolean addCustomer(String customerName){
        if(!customers.contains(customerName)){
            customers.add(customerName);
            return true;
        }
        return false;
    }

    public static boolean customerSearch(String customerName){
        return customers.contains(customerName);
    }



}
