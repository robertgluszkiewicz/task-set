package homework.bank;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import homework.bank.dao.MyBatisDao;
import homework.bank.exception.DbCRUDException;

public class Main {
    public static void main(String[] args) {
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
            SqlSession sqlSession = sessionFactory.openSession(true);
            MyBatisDao myBatisDao = sqlSession.getMapper(MyBatisDao.class);
            myBatisDao.getEntityById(2L);
            System.out.println(myBatisDao.getEntityById(2L));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
