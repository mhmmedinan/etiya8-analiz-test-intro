public class loops {
    public static void main(String[] args)
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
        }

        for(int i=10;i>1;i--)
        {
            System.out.println(i);
        }

        for(int i=0;i<=100;i++){
            if(i%2==0){
                System.out.println("Çift sayılar : " + i);
            }
            else {
                System.out.println("Tek sayılar : " + i);
            }
        }

        int number = 23;

        boolean isPrime = true;

        if(number==1){
            System.out.println("Sayı asal değildir");
            return;
        }
        if(number<=0){
            System.out.println("Geçersiz sayı");
            return;
        }

        for(int i=2;i<number;i++){
            if(number%i==0){

                System.out.println("Sayı asal değildir!");
                return;
            }
            else {
                System.out.println("Sayı asaldır");
                return;
            }
        }






    }
}
