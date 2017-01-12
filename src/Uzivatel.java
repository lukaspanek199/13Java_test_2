public class Uzivatel {
    public Uzivatel(String jmeno, String prijmeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        ucty[0] = new Ucet((long) Math.floor(Math.random() * 999999999), "CZK");
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    private String jmeno;

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    private String prijmeni;

    public Ucet[] ucty = new Ucet[50];

    public void vypisUcty(){
        for(int i = 0;i<ucty.length;i++){
            if(ucty[i] != null){
                System.out.println("Cislo uctu je: "+ucty[i].getCislo()+"/0420");
                System.out.println("Zustatek na uctu je: "+ucty[i].getZustatek()+" "+ucty[i].getMena());
                System.out.println("Pocet transakci na uctu: "+ucty[i].getTransCount());
            }
        }
    }
}
