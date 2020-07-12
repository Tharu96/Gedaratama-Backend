package lk.gedaratama.backendserver.model;

import javax.persistence.*;

/**
 * @author Sashini Tharuka on 7/12/2020.
 */
@Entity
@Table(name = "item_table")
public class ItemDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int itemId;
    private String shopUuid;
    private String itemName;
    private String description;
    private int qty;
    private int dailyAmount;
    private double price;
    private double discount;
    private String status;

    public ItemDetail() {
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getDailyAmount() {
        return dailyAmount;
    }

    public void setDailyAmount(int dailyAmount) {
        this.dailyAmount = dailyAmount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getShopUuid() {
        return shopUuid;
    }

    public void setShopUuid(String shopUuid) {
        this.shopUuid = shopUuid;
    }

    @Override
    public String toString() {
        return "ItemDetail{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", description='" + description + '\'' +
                ", qty=" + qty +
                ", dailyAmount=" + dailyAmount +
                ", price=" + price +
                ", discount=" + discount +
                ", status='" + status + '\'' +
                '}';
    }
}
