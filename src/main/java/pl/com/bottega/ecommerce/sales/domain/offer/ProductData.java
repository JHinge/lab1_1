package pl.com.bottega.ecommerce.sales.domain.offer;

import java.util.Date;

public class ProductData {

    private String productId;

    private String name;

    private Date snapshotDate;

    private String type;

    private Money price;

    public ProductData(String productId, String name, Date snapshotDate, String type, Money price) {
        this.productId = productId;
        this.price = price;
        this.name = name;
        this.snapshotDate = snapshotDate;
        this.type = type;

    }

    public Money getMoney() {
        return price;
    }

    public void setMoney(Money money) {
        this.price = money;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getSnapshotDate() {
        return snapshotDate;
    }

    public void setSnapshotDate(Date snapshotDate) {
        this.snapshotDate = snapshotDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
