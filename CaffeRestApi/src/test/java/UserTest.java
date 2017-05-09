import com.pmtu.caffe.entity.UserEntity;
import com.pmtu.caffe.service.Impl.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Mr Tu on 07-05-2017.
 */
public class UserTest {

    ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
    UserService userService=(UserService)context.getBean("userService");
    @Test
    public void getUser(){

        try {
            List<UserEntity> list= userService.getall();
            Assert.assertNotNull(list);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}
