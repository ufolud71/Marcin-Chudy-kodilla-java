package challenge2;

public class PurchaseRequest {

    public User user;
    public String item;
    public int quantity;

    public PurchaseRequest(User user, String item, int quantity) {
        this.user = user;
        this.item = item;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public String getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }
}
