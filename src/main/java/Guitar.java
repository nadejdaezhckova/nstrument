public class Guitar implements Instryment {
    int strnumber;
    @Override
    public void play() {
        System.out.println("С " + strnumber + " струнами играет гитара.");
    }
}
