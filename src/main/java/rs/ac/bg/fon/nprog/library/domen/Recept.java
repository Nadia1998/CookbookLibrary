package rs.ac.bg.fon.nprog.library.domen;


import java.io.Serializable;
import java.util.List;

/**
 * Klasa koja predstavlja recept koji se upisuju i citaju iz Cookbooka
 * 
 * Recept sadrzi listu Sastojaka, instancu korisnika, id recepta, naziv recepta, vreme pripreme recepta , nivo tezine recepta, vrstu jela, kategoriju i opis recepta.
 *  
 * @author Nadia
 */
public class Recept implements Serializable {
   /**
    * Sastojci recepta kao Lista.
    */
    private List<Sastojak> sastojci;
    /**
     * Instanca korisnika tipa Korisnik.
     */
    private Korisnik korisnik;
    /**
     * Id recepta tipa int.
     */
    private int receptId;
    /**
     * Naziv recepta kao String.
     */
    private String naziv;
    /**
     * Vreme pripreme recepta kao EnumVremePripreme.
     */
    private EnumVremePripreme vremePripreme;
    /**
     * Nivo tezine recepta kao EnumNivoTezine.
     */
    private EnumNivoTezine nivoTezine;
    /**
     * Vrsta jela iz recepta kao EnumVrstaJela.
     */
    private EnumVrsteJela vrstaJela;
    /**
     * Kategorija recepta kao EnumKategorijaRecepta.
     */
    private EnumKategorijaRecepta kategorijaRecepta;
    /**
     * Opis recepta kao String.
     */
    private String opisRecepta;
    /**
     * Konstruktor koji inicijalizuje objekat i nista vise.
     */
    public Recept() {
    }
    /**
     * Konstruktor koji inicijalizuje objekat i postavlja vrednosti .
     * 
     * @param sastojci Sastojci recepta kao List.
     * @param korisnik Korisnik koji je napisao recept kao Korisnik.
     * @param receptId Id recepta kao int vrednost.
     * @param naziv Naziv recepta kao String vrednost.
     * @param vremePripreme Vreme pripreme recepta kao EnumVremePripreme vrednost.
     * @param nivoTezine Nivo tezine recepta kao EnumNivoTezine vrednost.
     * @param vrstaJela Vrsta jela recepta kao EnumVrstaJela vrednost.
     * @param kategorijaRecepta Kategorija recepta kao EnumKategorijaRecepta vrednost.
     * @param opisRecepta Opis recepta kao String vrednost.
     */
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

    
    /**
     * Vraca listu sastojaka korisnika.
     * 
     * @return sastojci Lista sastojaka kao List .
     */
    public List<Sastojak> getSastojci() {
        return sastojci;
    }
    /**
     * Postavlja listu sastojaka na novu vrednost.
     * 
     * @param sastojci Lista sastojaka kao List.
     */
    public void setSastojci(List<Sastojak> sastojci) {
        this.sastojci = sastojci;
    }

	/**
	 * Vraca id recepta.
	 * 
	 * @return receptId Id recepta kao int vrednost.
	 */
    public int getReceptId() {
        return receptId;
    }
    /**
     * Postavlja id recepta na novu vrednost.
     * 
     * @param receptId Id recepta kao int.
     */
    public void setReceptId(int receptId) {
        this.receptId = receptId;
    }
    /**
     * Vraca naziv recepta.
     * 
     * @return naziv Naziv kao String vrednost.
     */
    public String getNaziv() {
        return naziv;
    }
    /**
     * Postavlja naziv recepta na novu vrednost.
     * 
     * @param naziv Naziv recepta kao String.
     */
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    /**
     * Vraca vreme pripreme recepta.
     * 
     * @return vremePripreme Vreme pripreme kao EnumVremePripreme .
     */
    public EnumVremePripreme getVremePripreme() {
        return vremePripreme;
    }
    /**
     * Postavlja vreme pripreme recepta na novu vrednost.
     * 
     * @param vremePripreme Vreme pripreme recepta kao EnumVremePripreme.
     */
    public void setVremePripreme(EnumVremePripreme vremePripreme) {
        this.vremePripreme = vremePripreme;
    }
    /**
     * Vraca nivo tezine recepta.
     * 
     * @return nivoTezine Nivo tezine kao EnumNivoTezine vrednost.
     */
    public EnumNivoTezine getNivoTezine() {
        return nivoTezine;
    }
    /**
     * Postavlja nivo tezine recepta na novu vrednost.
     * 
     * @param nivoTezine Nivo tezine recepta kao EnumNivoTezine.
     */
    public void setNivoTezine(EnumNivoTezine nivoTezine) {
        this.nivoTezine = nivoTezine;
    }
    /**
     * Vraca vrstu jela recepta.
     * 
     * @return vrstaJela Vrsta jela kao EnumVrstaJela vrednost.
     */
    public EnumVrsteJela getVrstaJela() {
        return vrstaJela;
    }
    /**
     * Postavlja vrstu jela recepta na novu vrednost.
     * 
     * @param vrstaJela Vrsta jela recepta kao EnumVrstaJela.
     */
    public void setVrstaJela(EnumVrsteJela vrstaJela) {
        this.vrstaJela = vrstaJela;
    }
    /**
     * Vraca kategoriju recepta.
     * 
     * @return kategorijaRecepta Kategorija recepta kao EnumKategorijaRecepta vrednost.
     */
    public EnumKategorijaRecepta getKategorijaRecepta() {
        return kategorijaRecepta;
    }
    /**
     * Postavlja kategoriju recepta na novu vrednost.
     * 
     * @param kategorijaRecepta Kategorija recepta recepta kao EnumKategorijaRecepta .
     */
    public void setKategorijaRecepta(EnumKategorijaRecepta kategorijaRecepta) {
        this.kategorijaRecepta = kategorijaRecepta;
    }
    /**
     * Vraca opis recepta.
     * 
     * @return opisRecepta Opis kao String vrednost.
     */
    public String getOpisRecepta() {
        return opisRecepta;
    }
    /**
     * Postavlja opis recepta na novu vrednost.
     * 
     * @param opisRecepta Opis recepta kao String vrednost.
     */
    public void setOpisRecepta(String opisRecepta) {
        this.opisRecepta = opisRecepta;
    }
    /**
     * Vraca korisnika koji je postavio recept.
     * 
     * @return korisnik Korisnika kao Korisnik .
     */
    public Korisnik getKorisnik() {
        return korisnik;
    }
    /**
     * Postavlja korisnika koji je postavio recept na novu vrednost.
     * 
     * @param korisnik Korisnik kao Korisnik.
     */
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
