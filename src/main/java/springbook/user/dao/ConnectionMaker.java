package springbook.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Jeongjin Kim
 * @since 2017-04-19
 */
public interface ConnectionMaker {
    public Connection makeConnection() throws ClassNotFoundException, SQLException;
}
