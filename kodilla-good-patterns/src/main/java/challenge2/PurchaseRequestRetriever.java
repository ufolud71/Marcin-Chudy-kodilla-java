package challenge2;

public class PurchaseRequestRetriever {

    public User user;
    public String item;
    public int quantity;
    public boolean purchaseCompleted;

    public PurchaseRequest retrieve() {

        User user = new User("Marian", "Kowalski", "kovlsky001");

        String item = "Salmon";
        int quantity = 3;

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

    public boolean isCompleted() {
        return purchaseCompleted;
    }
}
