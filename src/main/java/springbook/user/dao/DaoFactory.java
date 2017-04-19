package springbook.user.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Jeongjin Kim
 * @since 2017-04-19
 */
@Configuration
public class DaoFactory {
    @Bean
    public UserDao userDao(){
        UserDao userDao = new UserDao(connectionMaker());

        return userDao;
    }

    @Bean
    public ConnectionMaker connectionMaker() {
        return new DConnectionMaker();
    }
}
