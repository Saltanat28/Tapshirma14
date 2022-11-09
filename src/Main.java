public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Saltanat","Programmer"," Google");
        System.out.println(programmer);
        programmer.coding();
        System.out.println();

        Danser danser = new Danser("Eliza","Danser"," Ak - Shoola");
        System.out.println(danser);
        danser.dansing();
        System.out.println();

        Singer singer = new Singer(" Jenishbek", "Singing"," Jebe- tobu");
        System.out.println(singer);
        singer.singing();
        singer.playingGitar();
    }
}