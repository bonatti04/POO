public class GerenciarControlePonto {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("João Silva");
        gerente.setLogin("joao123");
        gerente.setSenha("senha123");

        Operador operador = new Operador();
        operador.setNome("Carlos Oliveira");
        operador.setValorHora(15.5);

        Secretaria secretaria = new Secretaria();
        secretaria.setNome("Ana Santos");
        secretaria.setTelefone("5678-1234");
        secretaria.setRamal("456");

        ControlePonto controlePonto = new ControlePonto();

        String entradaGerente = controlePonto.registraEntrada(gerente);
        System.out.println("Entrada na agência do Gerente: " + entradaGerente);
        aguardarUmSegundo();

        String entradaOperador = controlePonto.registraEntrada(operador);
        System.out.println("Entrada na agência do Operador: " + entradaOperador);
        aguardarUmSegundo();

        String entradaSecretaria = controlePonto.registraEntrada(secretaria);
        System.out.println("Entrada na agência da Secretaria: " + entradaSecretaria);
        aguardarUmSegundo();

        String saidaGerente = controlePonto.registraSaida(gerente);
        System.out.println("Saída da agência do Gerente: " + saidaGerente);
        aguardarUmSegundo();

        String saidaOperador = controlePonto.registraSaida(operador);
        System.out.println("Saída da agência do Operador: " + saidaOperador);
        aguardarUmSegundo();

        String saidaSecretaria = controlePonto.registraSaida(secretaria);
        System.out.println("Saída da agência da Secretaria: " + saidaSecretaria);
    }

    private static void aguardarUmSegundo() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
