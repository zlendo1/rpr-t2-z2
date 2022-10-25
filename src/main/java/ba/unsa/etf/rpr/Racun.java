package ba.unsa.etf.rpr;

public class Racun extends Object {
    protected Long brojRacuna;
    protected Osoba korisnikRacuna;
    protected boolean odobrenoPrekoracenje;
    protected Double stanjeRacuna;

    Racun(Long brojRacuna, Osoba korisnikRacuna) {
        this.brojRacuna = brojRacuna;
        this.korisnikRacuna = korisnikRacuna;
        odobrenoPrekoracenje = false;
        stanjeRacuna = 0d;
    }

    private boolean provjeriOdobrenoPrekoracenje(Double isplata) {
        return stanjeRacuna >= isplata || odobrenoPrekoracenje;
    }

    public boolean izvrsiUplatu(Double uplata) {
        stanjeRacuna += uplata;

        return stanjeRacuna >= 0;
    }

    public boolean izvrsiIsplatu(Double isplata) {
        if (this.provjeriOdobrenoPrekoracenje(isplata)) {
            return false;
        }

        stanjeRacuna -= isplata;
        return true;
    }

    public void odobriPrekoracenje(Double vrijednost) {
        odobrenoPrekoracenje = true;
    }
}
