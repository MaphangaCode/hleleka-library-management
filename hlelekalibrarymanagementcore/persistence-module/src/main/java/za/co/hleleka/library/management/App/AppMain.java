package za.co.hleleka.library.management.App;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.co.hleleka.library.management.config.PersistenceConfig;
import za.co.hleleka.library.management.repository.UserRepository;

/**
 * Created by nkosinathi.maphanga on 2017/11/22.
 */
public class AppMain {

    public static void main(String[] argc){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PersistenceConfig.class);
        UserRepository userRepository = context.getBean(UserRepository.class);
        System.out.println(userRepository.findAll().toString());
    }
}
