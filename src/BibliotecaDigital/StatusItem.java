package BibliotecaDigital;

public enum StatusItem {
    DISPONIVEL("Disponível"),
    EMPRESTADO("Emprestado");

    private String status;

    StatusItem(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return this.status;
    }
}
