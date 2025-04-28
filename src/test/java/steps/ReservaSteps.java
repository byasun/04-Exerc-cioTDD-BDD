package test.java.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import reserva.ReservaService;
import io.cucumber.java.en.*;

public class ReservaSteps {

    private ReservaService reservaService;
    private String cidade;
    private String endereco;
    private String resposta;

    @Given("que o passageiro está em {string}")
    public void que_o_passageiro_está_em(String cidade) {
        this.cidade = cidade;
        reservaService = new ReservaService();
    }

    @When("ele solicitar uma reserva para o endereço {string}")
    public void ele_solicitar_uma_reserva_para_o_endereço(String endereco) {
        this.endereco = endereco;
        resposta = reservaService.reservar(cidade, endereco);
    }

    @Then("o sistema deve responder {string}")
    public void o_sistema_deve_responder(String mensagemEsperada) {
        assertEquals(mensagemEsperada, resposta);
    }
}
