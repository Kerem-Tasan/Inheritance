package inter;

public class ABankasi implements IBanka{
    private String bankaAdi;
    private String terminaldId;
    private String password;

    public ABankasi(String bankaAdi, String terminal_id, String password) {
        this.bankaAdi = bankaAdi;
        this.terminaldId = terminal_id;
        this.password = password;
    }
    @Override
    public boolean connect(String IpAdress){
        System.out.println("Kullanıcı IP:"+IpAdress);
        System.out.println("Makine Id"+this.HostIpAdress);
        System.out.println(this.bankaAdi+" bağlandı!");
        return true;

    }
    @Override
    public boolean payment(double price,String cardNumber,String Date,String cvc){
        System.out.println("Bankadan cevap bekleniyor");
        System.out.println("İşlem başarılı!");
       return true;
    }

    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getTerminaldId() {
        return terminaldId;
    }

    public void setTerminaldId(String terminaldId) {
        this.terminaldId = terminaldId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
