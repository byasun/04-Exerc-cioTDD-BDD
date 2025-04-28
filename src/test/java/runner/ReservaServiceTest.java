package test.java.runner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import reserva.ReservaService;

public class ReservaServiceTest {

    private final ReservaService reservaService = new ReservaService();

    @Test
    public void testReservaDentroArea() {
        String resultado = reservaService.reservar("Belo Horizonte", "Rua A");
        assertEquals("Motorista a caminho", resultado);
    }

    @Test
    public void testReservaDentroAreaOutraCidade() {
        String resultado = reservaService.reservar("Contagem", "Rua B");
        assertEquals("Motorista a caminho", resultado);
    }

    @Test
    public void testReservaForaArea() {
        String resultado = reservaService.reservar("São Paulo", "Avenida Paulista");
        assertEquals("Área fora de cobertura", resultado);
    }
}
