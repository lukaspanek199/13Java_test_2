public class Banka {

    private Uzivatel[] uz = new Uzivatel[50];
    private String[] jmenprij = new String[2];

    public void vypisUzivatele(String vstup) {
        jmenprij = vstup.split(" ");
        for (int j = 0; j < uz.length; j++) {
            if (uz[j] == null) {
                uz[j] = new Uzivatel(jmenprij[0], jmenprij[1]);
                vypisUzivatele(vstup);
                break;
            } else if (uz[j].getJmeno().toLowerCase().equals(jmenprij[0].toLowerCase()) && uz[j].getPrijmeni().toLowerCase().equals(jmenprij[1].toLowerCase())) {
                uz[j].vypisUcty();
                break;
            }
        }
    }
}


