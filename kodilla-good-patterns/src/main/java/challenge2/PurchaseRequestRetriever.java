package challenge2;

public class PurchaseRequestRetriever {

    public User user;
    public String item;
    public int quantity;

    public PurchaseRequestRetriever(User user, String item, int quantity) {
        this.user = user;
        this.item = item;
        this.quantity = quantity;
    }

    public PurchaseRequest retrieve() {
        return new PurchaseRequest(user, item, quantity);
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