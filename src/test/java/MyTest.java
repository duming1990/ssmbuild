import com.duming.pojo.User;
import com.duming.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userServiceImpl = context.getBean("userServiceImpl", UserService.class);
        for (User user : userServiceImpl.getUserList()) {
            System.out.println(user);
        }
    }
}
