public class DinosaurSupervisor {

    public static void main(String[] args) {

        Dinosaur t_rex = new Dinosaur();
        Dinosaur velociraptor = new Dinosaur();
        Dinosaur diplodocus = new Dinosaur();
        Dinosaur pterodactyl = new Dinosaur();

        t_rex.roar();
        velociraptor.roar();
        diplodocus.roar();
        pterodactyl.roar();

        t_rex.color = "American Blue";
        System.out.println("A T-Rex is " + t_rex.color);
    }
}
