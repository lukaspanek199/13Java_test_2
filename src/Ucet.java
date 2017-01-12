public class Ucet {
    public long getCislo() {
        return cislo;
    }

    public String getMena() {
        return mena;
    }

    public int getZustatek() {
        return zustatek;
    }

    public int getTransCount() {
        return transCount;
    }

    public void setCislo(long cislo) {
        this.cislo = cislo;
    }

    public void setMena(String mena) {
        this.mena = mena;
    }

    public void setZustatek(int zustatek) {
        this.zustatek = zustatek;
    }

    public void setTransCount(int transCount) {
        this.transCount = transCount;
    }

    private long cislo;
    private String mena;
    private int zustatek;
    private int transCount;

    public Ucet(long cislo, String mena) {
        this.cislo = cislo;
        this.mena = mena;
    }

    public void pohyb(int hodnota) {
        zustatek += hodnota;
        transCount++;
    }
}
