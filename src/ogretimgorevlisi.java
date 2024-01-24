public class ogretimgorevlisi extends akademisyen{
    private String kapiNo;
    public ogretimgorevlisi(String adSoyad, String telefon, String eposta, String bolum, String unvan) {
        super(adSoyad, telefon, eposta, bolum, unvan);
        this.kapiNo=kapiNo;
    }
    public String getKapiNo(){
        return kapiNo;

    }
    public void setKapiNo(){
        this.kapiNo=kapiNo;
    }
    @Override
    public void giris(){
        System.out.println(this.getAdSoyad()+" Öğretim görevlisi B kapısından giriş yaptı!");
    }
    @Override
    public void derseGir(String dersSaati){
        System.out.println(this.getAdSoyad()+" öğretim görevlisi derse "+dersSaati+" giriş yaptı!");
    }

}
