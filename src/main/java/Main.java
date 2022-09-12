public class Main {
    public static void main(String[] args) {
        Guitar gui1 = new Guitar();
        gui1.strnumber = 10;
        Drum bar1 = new Drum();
        bar1.size = 31;
        Trumpet tru1 = new Trumpet();
        tru1.diametr = 23;

        Instryment[] mas1 = { gui1, bar1, tru1};

        for (int i = 0; i < mas1.length; i++){
            mas1[i].play();

        }
    }
}
