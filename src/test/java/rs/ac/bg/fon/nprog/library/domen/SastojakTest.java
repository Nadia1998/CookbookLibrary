package rs.ac.bg.fon.nprog.library.domen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SastojakTest {
	Sastojak s;

	@BeforeEach
	void setUp() throws Exception {
		Recept r = new Recept();
		s = new Sastojak(1, "Mleko", 100, EnumMera.ML, r);
	}

	@AfterEach
	void tearDown() throws Exception {
		s = null;
	}

	@Test
	public void testSastojak() {
		s = new Sastojak();
		assertNotNull(s);
	}

	@Test
	public void testSastojakIntStringIntEnumRecept() {
		Recept r = new Recept();
		s = new Sastojak(1, "Mleko", 100, EnumMera.ML, r);

		assertNotNull(s);

		assertEquals(1, s.getSastojakId());
		assertEquals("Mleko", s.getNaziv());
		assertEquals(100, s.getKolicina());
		assertEquals(EnumMera.ML, s.getMera());
		assertEquals(r, s.getRecept());
	}

	@Test
	public void testSetSastojakId() {
		s.setSastojakId(1);
		assertEquals(1, s.getSastojakId());
	}

	@Test
	public void testSetNaziv() {
		s.setNaziv("Mleko");
		assertEquals("Mleko", s.getNaziv());
	}

	@Test
	public void testSetKolicina() {
		s.setKolicina(1);
		assertEquals(1, s.getKolicina());
	}

	@Test
	public void testSetMera() {
		s.setMera(EnumMera.ML);
		assertEquals(EnumMera.ML, s.getMera());
	}

	@Test
	public void testSetRecept() {
		Recept r = new Recept();
		s.setRecept(r);
		assertEquals(r, s.getRecept());
	}
	
	@Test
	public void testSetNazivNotNull() {
		assertThrows(java.lang.NullPointerException.class, ()->s.setNaziv(null));
	}
	@Test
	public void testSetNazivNotEmpty() {
		assertThrows(java.lang.RuntimeException.class, ()->s.setNaziv(""));
	}

	
}
