package co.com.sofka.model.commons.enumerables;

public enum Status {

    AVAILABLE("Available"),
    NOT_AVAILABLE("Not available"),
    ON_LOAN("On Loan"),
    EXHAUSTED("Exhausted"),
    BANNED("Banned");

    private final String value;

    Status(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
