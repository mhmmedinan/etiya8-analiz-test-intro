package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Arrays {
    public static void main(String[] args) {

        System.out.println("Merhaba Dünya!");

        int[] arrays = new int[5];
        arrays[0]=10;
        arrays[1]=20;
        arrays[2]=30;
        arrays[3]=40;
        arrays[4]=50;

        for(int i=0;i<arrays.length;i++){
            System.out.println("Dizi[" + i + "] = " + arrays[i]);
        }

        int[] arrays1 = {1,5,8,4};
        int total = 0;
        for (int i=0;i<arrays1.length;i++){
            total+=arrays1[i];
        }
        System.out.println("Dizi elemanlarının toplamı : " + total);

        String[][] cities = new String[3][3];
        //{İstanbul,Koceeli,Sakarya}, {İstanbul,Koceeli,Sakarya}, {İstanbul,Koceeli,Sakarya}
        cities[0][0]="İstanbul";
        cities[0][1]="Kocaeli";
        cities[0][2]="Sakarya";

        cities[1][0]="Ankara";
        cities[1][1]="Konya";
        cities[1][2]="Kırşehir";

        cities[2][0]="Diyarbakır";
        cities[2][1]="Gaziantep";
        cities[2][2]="Mardin";

        for(int i=0;i<cities.length;i++){
            System.out.println("-----------------------------");
          for(int j=0;j<cities.length;j++){
              System.out.println(cities[i][j]);
          }
        }

        String[] books = {"Java'ya giriş","C# programlama","Microservices mimarisi"};
        String[] writers = {"Berk Mamıkoğlu","Ayşegül Kadiroğlu","Büşra Aydın"};
        double[] prices = {55.99,79.99,85};

        System.out.println("Kitaplar : ");
        for (int i=0;i<books.length;i++){
            System.out.println("Kitap Adı : " + books[i] + " " +
                    "Yazar : " + writers[i] + " " + "Fiyat : " + prices[i] );
        }



        String[] products = {"Bilgisayar","Telefon","Tablet"};
        int[] stocks = {5,2,10};

        int index = 0;
        for(int stock:stocks){
            if(stock>0){
                System.out.println(products[index] + "ürününden" + stock + "adet stok bulunmaktadır");
            }
            else{
                System.out.println(products[index] + "ürünü stokta bulunmamaktadır");
            }
            index++;
        }

        // 1-) çalışanların maaş bilgilerini,isim soyismini bir dizi olarak tutan
        // ve maaşlarına göre vergi kesintisi yapan
        // bir algoritma yazalım.

        //2-) öğrencilerin sınav not ortalamasını hesaplayan bir algoritma


        String[] employeeName = {"Berfin Elbir","Mustafa İnce","Emel Yenier"};
        double[] salaries = {30000,32000,42000};
        double taxRate = 0.20;

        System.out.println("Çalışan maaşları ve Vergi kesintileri");
        for(int i=0;i<employeeName.length;i++){
            double taxdeduction = salaries[i] * taxRate;
            double newSalary = salaries[i] - taxdeduction;
            System.out.println(employeeName[i] +
                    " adlı çalışanın maaşı : " + salaries[i] + "TL, Vergi Kesintisi " + taxdeduction + "TL" +
            " Vergi Kesintisinden sonraki maaşı : " + newSalary);
        }


        double[] notes = {85,75,60,89,75};
        double totalNotes = 0;
        for(double note:notes){
            totalNotes+=note;
        }

        double average = totalNotes / notes.length;
        System.out.println("Not ortalaması : " + average);

        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("C#");
        programmingLanguages.add("C++");
        programmingLanguages.add("Python");

        System.out.println(programmingLanguages);

        for(String language:programmingLanguages){
            System.out.println(language);
        }

        List<HashMap<String,Object>> products1 = new ArrayList<>();

        HashMap<String,Object> product1 = new HashMap<>();
        product1.put("Ad" ,"Laptop");
        product1.put("Aciklama" ,"Hızlı ve güçlü bir bilgisayar");
        product1.put("Fiyat",38000);
        product1.put("Kategori","Elektronik");
        products1.add(product1);

        //-------------------------------

        HashMap<String,Object> product2 = new HashMap<>();
        product2.put("Ad" ,"Telefon");
        product2.put("Aciklama" ,"Hızlı ve Donmayan bir telefon");
        product2.put("Fiyat",32000);
        product2.put("Kategori","Elektronik");
        products1.add(product2);

        for(var product:products1){
            System.out.println("Ürün Adı : " + product.get("Ad"));
            System.out.println("Açıklama : " + product.get("Aciklama"));
            System.out.println("Fiyat : " + product.get("Fiyat"));
            System.out.println("Kategori : " + product.get("Kategori"));
            System.out.println("-------------------------");
        }



        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        int first = numbers.get(0);
        int last = numbers.get(numbers.size() -1);
        System.out.println(first);
        System.out.println(last);

        List<String> colors = new ArrayList<>();
        colors.add("Mavi");
        colors.add("Kırmızı");
        colors.add("Yeşil");
        colors.add("Sarı");

        for (String color:colors){
        System.out.println(color);}

        System.out.println("----------------------");

        colors.remove("Kırmızı");
        for (String color:colors){
            System.out.println(color);}

        System.out.println("----------------");
        int index1 = colors.indexOf("Yeşil");
        if (index1!=-1){
            colors.set(index1,"Gri");
        }
        for (String color:colors){
            System.out.println(color);}


        List<String[]> users = new ArrayList<>();
        users.add(new String[]{"muhammed","İnan"});

        for(String[] user:users){
            System.out.println(user[0] + " " + user[1]);
        }




    }
}
