import java.util.Scanner;

public class SingletonMain{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int quantity = scanner.nextInt();
        scanner.nextLine(); 

        UserManager userManager = UserManager.getInstance();
    
        for (int i = 1; i <= quantity; i++) {
            String name = scanner.nextLine();
            userManager.addUser(name);
        }
    
        scanner.close();
        userManager.listUsers();
    }
}
