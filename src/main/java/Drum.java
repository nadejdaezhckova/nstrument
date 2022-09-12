public class Drum implements Instryment{
    int size;
    @Override
    public void play() {
        System.out.println("С размером " + size + " см играет барабан.");
    }
}
