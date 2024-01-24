package inter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
 final String terminalId="1561321321";

        System.out.println("Tutar giriniz:");
        double price=inp.nextDouble();

        System.out.println("Kart numarası giriniz:");
      String cardNumber=inp.next();

        System.out.println("Son kullanma tarihi giriniz:");
        String Date=inp.next();


        System.out.println("Cvc giriniz:");
        String cvc=inp.next();

        System.out.println("1-)A bankası");
        System.out.println("2-)B bankası");
        System.out.println("3-)C bankası");
        System.out.println("Banka seçiniz");

        int selectBank=inp.nextInt();
        switch (selectBank){
            case 1:
                ABankasi aPos=new ABankasi("A Bankası","56165123165","5612152");
               aPos.connect("127.1.1");
               aPos.payment(price,cardNumber,Date,cvc);


                break;
            case 2:
                bBankasi bPos=new bBankasi("B Bankası","56165123165","5612152");
                bPos.connect("127.1.2");
                bPos.payment(price,cardNumber,Date,cvc);


                break;
            default:
                System.out.println("Geçerli banka giriniz!");
        }

    }

}
