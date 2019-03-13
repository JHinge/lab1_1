package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Discount {

    private String cause;

    private BigDecimal discount;

    private Money value;

    public Money getMoney() {
        return value;
    }

    public Discount(String cause, BigDecimal discount, Money money) {
        this.cause = cause;
        this.discount = discount;
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

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

}
