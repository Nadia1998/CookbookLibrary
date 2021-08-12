package rs.ac.bg.fon.nprog.library.domen;

import java.io.Serializable;

/**
 *
 * @author Nadia
 */
public class Sastojak implements Serializable {

    private int sastojakId;
    private String naziv;
    private int kolicina;
    private EnumMera mera;
    private Recept recept;

    public Sastojak() {
    }

    public Sastojak(int sastojakId, String naziv, int kolicina, EnumMera mera, Recept recept) {
        this.sastojakId = sastojakId;
        this.naziv = naziv;
        this.kolicina = kolicina;
        this.mera = mera;
        this.recept = recept;
    }

    public int getSastojakId() {
        return sastojakId;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getKolicina() {
        return kolicina;
    }

    public EnumMera getMera() {
        return mera;
    }

    public Recept getRecept() {
        return recept;
    }

    public void setSastojakId(int sastojakId) {
        this.sastojakId = sastojakId;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public void setMera(EnumMera mera) {
        this.mera = mera;
    }

    public void setRecept(Recept recept) {
        this.recept = recept;
    }

    @Override
    public String toString() {
        return naziv+" "+mera+" "+kolicina+" ";

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
        final Sastojak other = (Sastojak) obj;
        if (this.sastojakId != other.sastojakId) {
            return false;
        }
        return true;
    }

}
