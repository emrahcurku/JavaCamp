package Methods;

public class Methods {
    public static void main(String[] args) {

        sayiBulmaca();

    }
    //camelCasing
    public static void sayiBulmaca()
    {
        int [] sayilar = new int[] {1,2,5,7,9,0};
        int aranacak = 6;
        boolean varMi = false;
        for (int sayi : sayilar)
        {
            if (sayi==aranacak)
            {
                varMi = true;
                break;
            }
        }
        String mesaj="";
        if (varMi)
        {
            mesaj ="sayi mevcuttur:"+aranacak;
            mesajVer(mesaj);

        }
        else
            System.out.println("sayı mevcut değildr: "+aranacak);
    }
     public static void mesajVer(String mesaj)
     {
         System.out.println(mesaj);
     }
}

