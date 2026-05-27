package br.com.calculadora.operacoes;

public class OperacaoFactory {
    public static OperacaoMatematica obterOperacao(String comando) {
        try {
            return switch (comando.toLowerCase()) {
                // Nível Fácil
                case "som" -> (OperacaoMatematica) Class.forName("br.com.calculadora.operacoes.Soma").getDeclaredConstructor().newInstance();
                case "sub" -> (OperacaoMatematica) Class.forName("br.com.calculadora.operacoes.Subtracao").getDeclaredConstructor().newInstance();
                case "mul" -> (OperacaoMatematica) Class.forName("br.com.calculadora.operacoes.Multiplicacao").getDeclaredConstructor().newInstance();
                case "div" -> (OperacaoMatematica) Class.forName("br.com.calculadora.operacoes.Divisao").getDeclaredConstructor().newInstance();
                case "res" -> (OperacaoMatematica) Class.forName("br.com.calculadora.operacoes.RestoDivisao").getDeclaredConstructor().newInstance();
                case "med" -> (OperacaoMatematica) Class.forName("br.com.calculadora.operacoes.Media").getDeclaredConstructor().newInstance();

                // Nível Médio
                case "pot" -> (OperacaoMatematica) Class.forName("br.com.calculadora.operacoes.Potencia").getDeclaredConstructor().newInstance();
                case "rqd" -> (OperacaoMatematica) Class.forName("br.com.calculadora.operacoes.RaizQuadrada").getDeclaredConstructor().newInstance();
                case "rcu" -> (OperacaoMatematica) Class.forName("br.com.calculadora.operacoes.RaizCubica").getDeclaredConstructor().newInstance();
                case "max" -> (OperacaoMatematica) Class.forName("br.com.calculadora.operacoes.MaiorNumero").getDeclaredConstructor().newInstance();
                case "min" -> (OperacaoMatematica) Class.forName("br.com.calculadora.operacoes.MenorNumero").getDeclaredConstructor().newInstance();
                case "por" -> (OperacaoMatematica) Class.forName("br.com.calculadora.operacoes.Porcentagem").getDeclaredConstructor().newInstance();
                case "abs" -> (OperacaoMatematica) Class.forName("br.com.calculadora.operacoes.ValorAbsoluto").getDeclaredConstructor().newInstance();

                // Nível Avançado
                case "hip" -> (OperacaoMatematica) Class.forName("br.com.calculadora.operacoes.Hipotenusa").getDeclaredConstructor().newInstance();
                case "art" -> (OperacaoMatematica) Class.forName("br.com.calculadora.operacoes.AreaRetangulo").getDeclaredConstructor().newInstance();
                case "atr" -> (OperacaoMatematica) Class.forName("br.com.calculadora.operacoes.AreaTriangulo").getDeclaredConstructor().newInstance();
                case "sen" -> (OperacaoMatematica) Class.forName("br.com.calculadora.operacoes.Seno").getDeclaredConstructor().newInstance();
                case "cos" -> (OperacaoMatematica) Class.forName("br.com.calculadora.operacoes.Cosseno").getDeclaredConstructor().newInstance();
                case "tan" -> (OperacaoMatematica) Class.forName("br.com.calculadora.operacoes.Tangente").getDeclaredConstructor().newInstance();
                case "log" -> (OperacaoMatematica) Class.forName("br.com.calculadora.operacoes.LogaritmoNatural").getDeclaredConstructor().newInstance();
                case "lg1" -> (OperacaoMatematica) Class.forName("br.com.calculadora.operacoes.LogaritmoBase10").getDeclaredConstructor().newInstance();
                case "cei" -> (OperacaoMatematica) Class.forName("br.com.calculadora.operacoes.ArredondarParaCima").getDeclaredConstructor().newInstance();
                case "flo" -> (OperacaoMatematica) Class.forName("br.com.calculadora.operacoes.ArredondarParaBaixo").getDeclaredConstructor().newInstance();
                case "inv" -> (OperacaoMatematica) Class.forName("br.com.calculadora.operacoes.Inverso").getDeclaredConstructor().newInstance();
                case "fat" -> (OperacaoMatematica) Class.forName("br.com.calculadora.operacoes.Fatorial").getDeclaredConstructor().newInstance();

                default -> null;
            };
        } catch (Exception e) {
            // Se a classe ainda não foi criada pelo aluno, retorna null silenciosamente
            return null;
        }
    }
}
