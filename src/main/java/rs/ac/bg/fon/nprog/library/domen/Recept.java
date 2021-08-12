package rs.ac.bg.fon.nprog.library.domen;


import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Nadia
 */
public class Recept implements Serializable {

    private List<Sastojak> sastojci;
    private Korisnik korisnik;
    private int receptId;
    private String naziv;
    private EnumVremePripreme vremePripreme;
    private EnumNivoTezine nivoTezine;
    private EnumVrsteJela vrstaJela;
    private EnumKategorijaRecepta kategorijaRecepta;
    private String opisRecepta;

    public Recept() {
    }

    public Recept(List<Sastojak> sastojci, Korisnik korisnik, int receptId, String naziv, EnumVremePripreme vremePripreme, EnumNivoTezine nivoTezine, EnumVrsteJela vrstaJela, EnumKategorijaRecepta kategorijaRecepta, String opisRecepta) {
        this.sastojci = sastojci;
        this.korisnik = korisnik;
        this.receptId = receptId;
        this.naziv = naziv;
        this.vremePripreme = vremePripreme;
        this.nivoTezine = nivoTezine;
        this.vrstaJela = vrstaJela;
        this.kategorijaRecepta = kategorijaRecepta;
        this.opisRecepta = opisRecepta;
    }

    

    public List<Sastojak> getSastojci() {
        return sastojci;
    }

    public void setSastojci(List<Sastojak> sastojci) {
        this.sastojci = sastojci;
    }
   
    public int getReceptId() {
        return receptId;
    }

    public void setReceptId(int receptId) {
        this.receptId = receptId;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public EnumVremePripreme getVremePripreme() {
        return vremePripreme;
    }

    public void setVremePripreme(EnumVremePripreme vremePripreme) {
        this.vremePripreme = vremePripreme;
    }

    public EnumNivoTezine getNivoTezine() {
        return nivoTezine;
    }

    public void setNivoTezine(EnumNivoTezine nivoTezine) {
        this.nivoTezine = nivoTezine;
    }

    public EnumVrsteJela getVrstaJela() {
        return vrstaJela;
    }

    public void setVrstaJela(EnumVrsteJela vrstaJela) {
        this.vrstaJela = vrstaJela;
    }

    public EnumKategorijaRecepta getKategorijaRecepta() {
        return kategorijaRecepta;
    }

    public void setKategorijaRecepta(EnumKategorijaRecepta kategorijaRecepta) {
        this.kategorijaRecepta = kategorijaRecepta;
    }

    public String getOpisRecepta() {
        return opisRecepta;
    }

    public void setOpisRecepta(String opisRecepta) {
        this.opisRecepta = opisRecepta;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Recept other = (Recept) obj;
        if (this.receptId != other.receptId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return naziv;
    }

}
