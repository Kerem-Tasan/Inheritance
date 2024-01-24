package inter;

public interface IBanka {
    final String HostIpAdress="127.0.0.1";
    boolean connect(String IpAdress);
    boolean payment(double price,String cardNumber,String Date,String cvc);
}
