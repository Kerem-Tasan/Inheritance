import jdk.jshell.spi.ExecutionControl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    // Calisan c1=new Calisan("M.Emir Baki","05316529711","baki2@gmail.com");
    // akademisyen a1= new akademisyen("Kerem Taşan","05539721106","keremtasan2@gmail.com","Bilgisayar Programcılığı","Öğrenci");
 //    Memur m1=new Memur("Samet yücel","0551651215","mrn@gmail.com","ticaret","Esnek");
      ogretimgorevlisi o1=new ogretimgorevlisi("Berkay Ekici","05249517523","berkayekc@gmail.com","Mat","Professor");

      Calisan a2=new ogretimgorevlisi("Efe Kıratlı","05581234874","efektli@gmail.com","Veritabanı","Proje Yöneticisi");
        Scanner sc=new Scanner(System.in);
        System.out.print("kitap adı :Ç");
        String title=sc.nextLine();
        MyBook new_novel=new MyBook();

        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());

/*
c1.giris();
//Kalıtım
a1.giris();
m1.giris();
o1.giris();
// Polymorphism
a2.giris();

*/
//int[] loginUser=new int[5];
     //   Calisan[] loginUser={c1,a1,m1,a2};
     //   Calisan.girisyapanlar(loginUser);

//o1.derseGir("12:00");

    }
}

