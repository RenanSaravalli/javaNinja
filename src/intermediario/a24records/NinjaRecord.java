package intermediario.a24records;

public record NinjaRecord(String nome, String email, int telefone) {
    public String emailEmCaixaAlta() {
        return email.toUpperCase();

        // Todos os atributos do record são FINAL por padrão
        // REcords não tem setter
    }
}
