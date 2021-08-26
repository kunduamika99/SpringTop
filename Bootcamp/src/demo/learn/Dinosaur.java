package demo.learn;

class Dinosaur {
    class Pterodactyl extends Dinosaur {
        {
            System.out.println("Inner Class");
        }
    }
    public void roar() {
        var dino = new Dinosaur();
        var petro = new Pterodactyl();
        petro.new Pterodactyl();
        new Dinosaur.Pterodactyl();
        new Dinosaur().new Pterodactyl();
        dino.new Pterodactyl();
        new Pterodactyl.Pterodactyl();
        new Pterodactyl();



    }

    public final static void main(String[] args) {
        new Dinosaur().roar();
        int pterodactyl =8;
        int tri = 3;
        if(pterodactyl%3 > 1+1)
            tri++;
        tri--;
        System.out.println(tri);
    }
}