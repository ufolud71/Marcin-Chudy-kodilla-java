package challenge2;

public class Mail implements InformationService{

    @Override
    public void inform(User user) {
        System.out.println("Your order has been completed");
    }
}
