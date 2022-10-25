package ba.unsa.etf.rpr;

public class Osoba extends Object {
    private String ime, prezime;

    Osoba(String ime, String prezime) {
        this.ime = new String(ime);
        this.prezime = new String(ime);
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }
}
