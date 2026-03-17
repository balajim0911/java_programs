//program to create a class name as crew with data members and methods of straw hats crew from one piece anime
class Crew {
    // Data members
    String captain;
    String firstMate;
    String navigator;
    String cook;
    String doctor;
    String shipwright;
    String musician;
    String archaeologist;
    String sniper;

    // Constructor
    public Crew(String captain, String firstMate, String navigator, String cook,
                String doctor, String shipwright, String musician,
                String archaeologist, String sniper) {
        this.captain = captain;
        this.firstMate = firstMate;
        this.navigator = navigator;
        this.cook = cook;
        this.doctor = doctor;
        this.shipwright = shipwright;
        this.musician = musician;
        this.archaeologist = archaeologist;
        this.sniper = sniper;
    }

    // Method to display crew members
    public void displayCrew() {
        System.out.println("Straw Hat Crew Members:");
        System.out.println("Captain: " + captain);
        System.out.println("First Mate: " + firstMate);
        System.out.println("Navigator: " + navigator);
        System.out.println("Cook: " + cook);
        System.out.println("Doctor: " + doctor);
        System.out.println("Shipwright: " + shipwright);
        System.out.println("Musician: " + musician);
        System.out.println("Archaeologist: " + archaeologist);
        System.out.println("Sniper: " + sniper);
    }

    // Main method to test the Crew class
    public static void main(String[] args) {
        Crew strawHatCrew = new Crew("Monkey D. Luffy", "Roronoa Zoro", "Nami",
                                      "Sanji", "Tony Tony Chopper", "Franky",
                                      "Brook", "Nico Robin", "Usopp");
        strawHatCrew.displayCrew();
    }
}