public class Lec05 extends User{
    public static void main(String[] args) {
        User john = new User("John", 1954, 2, 18);
        john.displayInfo();
        System.out.println();
        
        Admin nicolas = new Admin("Nicolas", 1964, 7, 1);
        nicolas.displayInfo();
        System.out.println();

        nicolas.displayInfo(true);
        System.out.println();
        
        nicolas.displayInfo(false);
        System.out.println();
    }
}
