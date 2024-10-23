import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EntrenadorTest {

    private Equipo colocolo;
    private Equipo uDeChile;
    private Entrenador entrenador1;
    private Entrenador entrenador2;

    @BeforeEach
    void setUp() {
        entrenador1 = new Entrenador(null, "Jorge Almirón",
                30, "Fútbol");
        entrenador2 = new Entrenador(null, "Gustavo Alvarez",
                9, "Fútbol");
        colocolo = new Equipo(entrenador1);
        uDeChile = new Equipo(entrenador2);
    }

    @Test
    void registrarEntrenador() {
        colocolo.registrarEntrenador(entrenador1);
        assertEquals(entrenador1, colocolo.getEntrenador());

        uDeChile.registrarEntrenador(entrenador2);
        assertEquals(entrenador2, uDeChile.getEntrenador());
    }
}
