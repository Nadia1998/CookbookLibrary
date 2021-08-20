package rs.ac.bg.fon.nprog.library.domen;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReceptTest {

	public Recept r;

	@BeforeEach
	public void setUp() throws Exception {
		Sastojak s = new Sastojak(1, "Mleko", 250, EnumMera.ML, r);
		List<Sastojak> sastojci = new ArrayList<>();
		sastojci.add(s);

		Korisnik k = new Korisnik(1, "Ana", "Jankovic", "y", "y");

		r = new Recept(sastojci, k, 1, "Strudla sa makom", EnumVremePripreme.BRZO, EnumNivoTezine.POCETNICKO,
				EnumVrsteJela.DESERT, EnumKategorijaRecepta.KOLACI, "Slatka strudla sa makom");
	}

	@AfterEach
	public void tearDown() throws Exception {
		r = null;
	}

	@Test
	public void testRecept() {
		r = new Recept();
		assertNotNull(r);
	}

	@Test
	public void testReceptListKorisnikIntStringEnumEnumEnumEnumString() {
		Sastojak s = new Sastojak(1, "Mleko", 250, EnumMera.ML, r);
		List<Sastojak> sastojci = new ArrayList<>();
		sastojci.add(s);

		Korisnik k = new Korisnik(1, "Ana", "Jankovic", "y", "y");

		r = new Recept(sastojci, k, 1, "Strudla sa makom", EnumVremePripreme.BRZO, EnumNivoTezine.POCETNICKO,
				EnumVrsteJela.DESERT, EnumKategorijaRecepta.KOLACI, "Slatka strudla sa makom");

		assertNotNull(r);
		assertEquals(sastojci, r.getSastojci());
		assertEquals(k, r.getKorisnik());
		assertEquals(1, r.getReceptId());
		assertEquals("Strudla sa makom", r.getNaziv());
		assertEquals(EnumVremePripreme.BRZO, r.getVremePripreme());
		assertEquals(EnumNivoTezine.POCETNICKO, r.getNivoTezine());
		assertEquals(EnumVrsteJela.DESERT, r.getVrstaJela());
		assertEquals(EnumKategorijaRecepta.KOLACI, r.getKategorijaRecepta());
		assertEquals("Slatka strudla sa makom", r.getOpisRecepta());
	}

	@Test
	public void testSetSastojci() {
		Sastojak s = new Sastojak(1, "Mleko", 250, EnumMera.ML, r);
		List<Sastojak> sastojci = new ArrayList<>();
		sastojci.add(s);
		r.setSastojci(sastojci);
		assertEquals(sastojci, r.getSastojci());
	}

	@Test
	public void testSetKorisnik() {
		Korisnik k = new Korisnik(1, "Ana", "Jankovic", "y", "y");
		r.setKorisnik(k);
		assertEquals(k, r.getKorisnik());
	}

	@Test
	public void testSetReceptId() {
		r.setReceptId(1);
		assertEquals(1, r.getReceptId());
	}

	@Test
	public void testSetNaziv() {
		r.setNaziv("Strudla sa makom");
		assertEquals("Strudla sa makom", r.getNaziv());
	}

	@Test
	public void testSetVremePripreme() {
		r.setVremePripreme(EnumVremePripreme.BRZO);
		assertEquals(EnumVremePripreme.BRZO, r.getVremePripreme());
	}

	@Test
	public void testSetNivoTezine() {
		r.setNivoTezine(EnumNivoTezine.POCETNICKO);
		assertEquals(EnumNivoTezine.POCETNICKO, r.getNivoTezine());

	}

	@Test
	public void testSetVrstaJela() {
		r.setVrstaJela(EnumVrsteJela.DESERT);
		assertEquals(EnumVrsteJela.DESERT, r.getVrstaJela());

	}

	@Test
	public void testSetKategorijaRecepta() {
		r.setKategorijaRecepta(EnumKategorijaRecepta.KOLACI);
		assertEquals(EnumKategorijaRecepta.KOLACI, r.getKategorijaRecepta());
	}

	@Test
	public void testSetOpisRecepta() {
		r.setOpisRecepta("Opis");
		assertEquals("Opis", r.getOpisRecepta());

	}

	@Test
	public void testSetSastojciNotNull() {
		assertThrows(java.lang.NullPointerException.class, () -> r.setSastojci(null));

	}
	
	@Test
	public void testSetNazivNotNull() {
		assertThrows(java.lang.NullPointerException.class, ()->r.setNaziv(null));
	}
	@Test
	public void testSetNazivNotEmpty() {
		assertThrows(java.lang.RuntimeException.class, ()->r.setNaziv(""));
	}
	
	@Test
	public void testSetVremePripremeNotNull() {
		assertThrows(java.lang.NullPointerException.class, ()->r.setVremePripreme(null));
	}
	@Test
	public void testSetNivoTezineNotNull() {
		assertThrows(java.lang.NullPointerException.class, ()->r.setNivoTezine(null));
	}
	@Test
	public void testSetVrstaJelaNotNull() {
		assertThrows(java.lang.NullPointerException.class, ()->r.setVrstaJela(null));
	}
	@Test
	public void testSetKategorijaReceptaNotNull() {
		assertThrows(java.lang.NullPointerException.class, ()->r.setKategorijaRecepta(null));
	}
	
	@Test
	public void testSetOpisReceptaNotNull() {
		assertThrows(java.lang.NullPointerException.class, ()->r.setOpisRecepta(null));
	}
	@Test
	public void testSetOpisReceptaNotEmpty() {
		assertThrows(java.lang.RuntimeException.class, ()->r.setOpisRecepta(""));
	}
	
}
