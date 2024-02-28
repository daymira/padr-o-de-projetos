import java.util.ArrayList;
import java.util.List;

public class UserManager {
        private static UserManager instance;
        private static final List<User> users = new ArrayList<>();
    
    
        private UserManager(){}
    
        //Implementar o padrão Singleton para garantir ter apenas uma instância do gerenciador de usuários
        public static UserManager getInstance(){
            if(instance == null){
                instance = new UserManager();
            }
            return instance;
        }
        
        
        public void addUser(String name) {
           int id = users.size() + 1; 
           users.add(new User(id, name));
    
        }
    
        public void listUsers() {
            for(User user : users){
                System.out.println(user.getId() + " - " + user.getName());
            }
    
        }
}
    
