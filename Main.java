public class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("Bob", "Toyota");


    //Overriding the accelerate method from Automobile interface
        sedan.accelerate(); // Calls the overridden method in Sedan class   

        //Overloading the accelerate method to accept an increment value
        sedan.accelerate(80); // Calls the overloaded method in Sedan class
    }
}
