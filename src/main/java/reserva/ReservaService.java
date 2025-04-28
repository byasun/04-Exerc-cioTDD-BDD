package main.java.reserva;

public class ReservaService {
    public String reservar(String cidade, String endereco) {
        if ("Belo Horizonte".equalsIgnoreCase(cidade) || "Contagem".equalsIgnoreCase(cidade)) {
            return "Motorista a caminho";
        } else {
            return "Área fora de cobertura";
        }
    }
}
