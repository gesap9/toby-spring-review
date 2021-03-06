package springbook.user.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

/**
 * @author Jeongjin Kim
 * @since 2017-04-19
 */
@Configuration
public class DaoFactory {
    @Bean
    public UserDao userDao(){

        UserDao userDao = new UserDao();
        userDao.setDataSource(dataSource());

        return userDao;
    }

    @Bean
    public DataSource dataSource() {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();

        dataSource.setDriverClass(com.mysql.jdbc.Driver.class);
        dataSource.setUrl("jdbc:mysql://localhost/springbook");
        dataSource.setUsername("com");
        dataSource.setPassword("com01");

        return dataSource;
    }


}
