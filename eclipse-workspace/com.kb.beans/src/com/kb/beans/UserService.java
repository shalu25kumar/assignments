import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
 
public class UserService implements InitializingBean,DisposableBean {
 
    private User user;
   
    public UserService() {
    System.out.println("UserService no-arg constructor");
    }
 
    public void destroy() throws Exception {
        System.out.println("UserService destroy method - closing opened resources");
       
    }
 
    public void afterPropertiesSet() throws Exception {
        if(!user.getName().equals("Ram")){
            user.setName("Ram");
        }
        System.out.println("UserService afterPropertiesSet method");
       
    }
 
    public User getUser() {
        return user;
    }
 
    public void setUser(User user) {
        this.user = user;
    }
 
}