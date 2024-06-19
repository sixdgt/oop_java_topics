package thirdsem.labone;

public class FirstJavaProgram {
    // attributes
    public String actor_name = "Daya Hang Rai";
    public String movie_name = "Kabaddi Kabaddi";
    public String genre = "Comedy";
    public int reg_number = 00547;
    
    // methods
    public void getMovieDetail(){
        System.out.println("Actor Name: " + this.actor_name);
        System.out.println("Movie Name: " + this.movie_name);
        System.out.println("Genre: " + this.genre);
        System.out.println("Registration: " + this.reg_number);
    }
    
    // main method -> it should be define once in any class
    public static void main(String args[]){
        System.out.println("Our First Java Program | BCA Third Sem 2024");
        
        // creating class object
        FirstJavaProgram program = new FirstJavaProgram();
        program.getMovieDetail(); 
    }
}
