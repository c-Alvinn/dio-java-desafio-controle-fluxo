public class ParametrosInvalidosException extends Exception {
    public String message() {
        return "O segundo parâmetro deve ser maior que o primeiro";
    }
}
