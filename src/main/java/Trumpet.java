public class Trumpet implements Instryment{
    int diametr;
    @Override
    public void play() {
        System.out.println("С диаметром " + diametr + " см играет труба.");
    }
}
