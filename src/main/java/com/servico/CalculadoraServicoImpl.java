package com.servico;

import javax.jws.WebService;

/**
 * Objeto com a implementação dos métodos remotos.
 *
 * @author osmar
 */
@WebService(endpointInterface = "com.servico.CalculadoraServico")
public class CalculadoraServicoImpl implements CalculadoraServico {

    @Override
    public double getAdicao(double a, double b) {
        double resultado = a + b;
        System.out.println("A = " + a + " + B = " + b + " Resultado: " + resultado);        
        return resultado;
    }

    @Override
    public double getSubtracao(double a, double b) {
        double resultado = a - b;
        System.out.println("A = " + a + " - B = " + b + " Resultado: " + resultado);        
        return resultado;
    }

    @Override
    public double getProduto(double a, double b) {
        double resultado = a * b;
        System.out.println("A = " + a + " * B = " + b + " Resultado: " + resultado);        
        return resultado;
    }

    @Override
    public double getDivisao(double a, double b) {
        double resultado = a / b;
        System.out.println("A = " + a + " / B = " + b + " Resultado: " + resultado);        
        return resultado;
    }
}
