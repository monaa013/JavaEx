class Game {
    // Data members and Access Specifier(Public)
    private String name;
    private int year;
    
    // Default Constructor
    public Game() {
        name = "Minecraft";
        year = 2000;
    }
    
    // Parameterized Constructor
    public Game(String name, int year) {
        this.name = name;
        this.year = year;
    }
    
    // Method to display game information
    public void display() {
        System.out.println("Game Name: " + name);
        System.out.println("Year Released: " + year);
    }
    
    // Method Overloading with different number of parameters
    public void play() {
        System.out.println(name + " is being played.");
    }
    
    public void play(int players) {
        System.out.println(name + " is being played by " + players + " players.");
    }
    
    // Method Overloading with different types of parameters
    public void rate(int rating) {
        System.out.println(name + " has a rating of " + rating);
    }
    
    public void rate(double rating, String comments) {
        System.out.println(name + " has a rating of " + rating + " with comments: " + comments);
    }
    
    // Method Overloading with the order of parameter of methods
    public void review(String reviewer, String comments) {
        System.out.println("Review of " + name + " by " + reviewer + ": " + comments);
    }
    
    public void review(String comments, String reviewer, int rating) {
        System.out.println("Review of " + name + " by " + reviewer + " with a rating of " + rating + ": " + comments);
    }



    public static void main(String[] args) {
        Game defaultGame = new Game();
        Game minecraft = new Game("Minecraft", 2011);
        
        defaultGame.display();
        minecraft.display();
        
        defaultGame.play();
        minecraft.play(4);
        
        defaultGame.rate(3);
        minecraft.rate(4.5, "Awesome sandbox game!");
        
        defaultGame.review("User123", "Good game, but needs more features.");
        minecraft.review("A must-play game!", "GameFanatic", 5);
    }

}
