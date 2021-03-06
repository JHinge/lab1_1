package pl.com.bottega.ecommerce.sales.domain.offer;

import java.util.Date;

public class ProductData {

    private String Id;

    private String name;

    private Date snapshotDate;

    private String type;

    private Money price;

    public ProductData(String productId, String name, Date snapshotDate, String type, Money price) {
        this.Id = productId;
        this.price = price;
        this.name = name;
        this.snapshotDate = snapshotDate;
        this.type = type;

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (name == null ? 0 : name.hashCode());
        result = prime * result + (price == null ? 0 : price.hashCode());
        result = prime * result + (Id == null ? 0 : Id.hashCode());
        result = prime * result + (snapshotDate == null ? 0 : snapshotDate.hashCode());
        result = prime * result + (type == null ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ProductData other = (ProductData) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (price == null) {
            if (other.price != null) {
                return false;
            }
        } else if (!price.equals(other.price)) {
            return false;
        }
        if (Id == null) {
            if (other.Id != null) {
                return false;
            }
        } else if (!Id.equals(other.Id)) {
            return false;
        }
        if (snapshotDate == null) {
            if (other.snapshotDate != null) {
                return false;
            }
        } else if (!snapshotDate.equals(other.snapshotDate)) {
            return false;
        }
        if (type == null) {
            if (other.type != null) {
                return false;
            }
        } else if (!type.equals(other.type)) {
            return false;
        }
        return true;
    }

    public Money getMoney() {
        return price;
    }

    public void setMoney(Money money) {
        this.price = money;
    }

    public String getId() {
        return Id;
    }

    public void setId(String productId) {
        this.Id = productId;
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
