package challenge2;

public class PurchaseRequestRetriever {

    public PurchaseRequest retrieve() {

        User user = new User("Marian", "Kowalski", "kovlsky001");

        String item = "Salmon";
        int quantity = 3;

        return new PurchaseRequest(user, item, quantity);
    }
}
