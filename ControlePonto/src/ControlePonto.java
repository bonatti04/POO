import java.time.LocalDateTime;

public class ControlePonto {

    public String registraEntrada(Funcionario funcionario) {
        LocalDateTime agora = LocalDateTime.now();

        String entrada = agora.getDayOfMonth() + "/" + agora.getMonthValue() + "/" + agora.getYear() +
                " " + agora.getHour() + ":" + agora.getMinute() + ":" + agora.getSecond();

        return "Horário de entrada do funcionário no Banco: " + entrada;
    }

    public String registraSaida(Funcionario funcionario) {
        LocalDateTime agora = LocalDateTime.now();

        String saida = agora.getDayOfMonth() + "/" + agora.getMonthValue() + "/" + agora.getYear() +
                " " + agora.getHour() + ":" + agora.getMinute() + ":" + agora.getSecond();

        return "Horário de saída do funcionário no Banco: " + saida;
    }
}
