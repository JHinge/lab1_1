package pl.com.bottega.ecommerce.sales.domain.offer;

public class Discount {

    private String cause;
    private Money value;

    public Money getValue() {
        return value;
    }

    public Discount(String cause, Money money) {
        this.cause = cause;
        this.value = money;
    }

    public void setMoney(Money money) {
        this.value = money;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

}
