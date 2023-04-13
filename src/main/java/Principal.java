import com.servico.CalculadoraServicoImpl;
import javax.xml.ws.Endpoint;

/**
 * Cria os serviços da calculadora.
 * 
 * Programa monolítico em https://github.com/osmarbraz/calculadora.
 * 
 * @author osmar
 */
public class Principal {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/CalculadoraServico", new CalculadoraServicoImpl());
        System.out.println("Servico publicado em http://localhost:8080/CalculadoraServico?wsdl");
    }
}
