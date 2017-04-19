package springbook.user.dao;

/**
 * @author Jeongjin Kim
 * @since 2017-04-19
 */
public class DaoFactory {
    public UserDao userDao(){
        ConnectionMaker connectionMaker = new DConnectionMaker();
        UserDao userDao = new UserDao(connectionMaker);

        return userDao;
    }
}
