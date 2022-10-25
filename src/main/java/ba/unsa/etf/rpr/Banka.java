package ba.unsa.etf.rpr;

import java.util.List;

public class Banka {
    private final Long brojRacuna;
    protected List<Korisnik> korisnici;
    protected List<Uposlenik> uposlenici;

    Banka(Long brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public Korisnik kreirajNovogKorisnika(String ime, String prezime) {
        Korisnik novi = new Korisnik(ime, prezime);
        korisnici.add(novi);
        return novi;
    }

    public Uposlenik kreirajNovogUposlenika(String ime, String prezime) {
        Uposlenik novi = new Uposlenik(ime, prezime);
        uposlenici.add(novi);
        return novi;
    }

    public Racun kreirajRacunZaKorisnika(Korisnik korisnik) {
        Racun novi = new Racun(brojRacuna, korisnik);
        korisnik.dodajRacun(novi);
        return novi;
    }
}
