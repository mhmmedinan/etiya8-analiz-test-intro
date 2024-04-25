import java.util.ArrayList;
import java.util.List;

public class method1 {
    private static List<String> kitaplar = new ArrayList<>();
    public static void main(String[] args) {
          sayHello();
          cikar();
          topla(50,80);
          topla(30,50,40);

          int[] sayilar = {1,2,3,4,5,6};
          diziYazdir(sayilar);

          kitapEkle("Java Programlama");
          kitapEkle("Spring Boot Eğitim Kitabı");
          kitapListele();
    }


    public static void sayHello(){
        System.out.println("Hello World");
    }

    public static void cikar(){
        int sonuc = 10-8;
        System.out.println(sonuc);
    }

    public static void topla(int sayi1,int sayi2){
        int toplam = sayi1+sayi2;
        System.out.println("Toplam : " + toplam);
    }

    public static void topla(int sayi1,int sayi2,int sayi3){
        int toplam = sayi1+sayi2+sayi3;
        System.out.println(toplam);
    }

    public static void diziYazdir(int[] dizi){
       for(int eleman : dizi ){
           System.out.println(eleman);
       }
    }


    //Kitapların olduğu bir liste olsun.

    public static void kitapEkle(String kitapAdi){
        kitaplar.add(kitapAdi);
    }

    public static void kitapListele(){
        for (String kitap:kitaplar){
            System.out.println(kitap);
        }
    }

    //1-) Ürün ismini tutan bir liste olsun. Bu liste üzerinden ürün ekleme,ürün listeleme,ürün silme
    // işlemini yapan metodlar yazalım.











}
