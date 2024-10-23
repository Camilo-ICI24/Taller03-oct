import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CanchaTest {

    private Partido partido1;
    private Partido partido2;
    private Cancha cancha;

    @BeforeEach
    public void setUp() {
        partido1 = new Partido("Colo-Colo", "Universidad de Chile",
                "4-1", "23-10-2024", cancha);
        partido2 = new Partido("Universidad Católica", "Cobreloa",
                "3-2", "17-03-2024", cancha);
        cancha = new Cancha(partido1, "Césped", "Estadio Monumental",
                420000);
    }

    @Test
    public void testGetSuperficie() {
        assertEquals("Césped", cancha.getSuperficie());
    }

    @Test
    public void testSetSuperficie() {
        cancha.setSuperficie("Tierra");
        assertEquals("Tierra", cancha.getSuperficie());
    }

    @Test
    public void testGetUbicacion() {
        assertEquals("Estadio Monumental", cancha.getUbicacion());
    }

    @Test
    public void testSetUbicacion() {
        cancha.setUbicacion("Estadio Sur");
        assertEquals("Estadio Sur", cancha.getUbicacion());
    }

    @Test
    public void testGetCapacidadEspectadores() {
        assertEquals(420000, cancha.getCapacidadEspectadores());
    }

    @Test
    public void testSetCapacidadEspectadores() {
        cancha.setCapacidadEspectadores(60000);
        assertEquals(60000, cancha.getCapacidadEspectadores());
    }

    @Test
    public void testProgramarPartidoCanchaOcupada() {
        boolean resultado = cancha.programarPartido(partido2, cancha);
        assertFalse(resultado);
    }

    @Test
    public void testProgramarPartidoCanchaLibre() {
        Cancha nuevaCancha = new Cancha(null, "Sintético",
                "Estadio Monumental", 40000);
        boolean resultado = nuevaCancha.programarPartido(partido2, nuevaCancha);
        assertTrue(resultado);
    }
}
