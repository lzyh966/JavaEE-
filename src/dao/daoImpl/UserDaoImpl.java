package dao.daoImpl;

import dao.UserDao;
import model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class UserDaoImpl implements UserDao {

    @Override
    public User find(String name, String pswd) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction ts = session.beginTransaction();

        String queryStr = "FROM User WHERE userName=? AND password=?";
        Query query = session.createQuery(queryStr);
        query.setString(0, name);
        query.setString(1, pswd);

        List list = query.list();

        ts.commit();
        session.close();

        if (list.size() > 0) {
            return (User) list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public int insert(User user) {
        // 1.加载hibernate的核心配置文件
        Configuration cfg = new Configuration().configure();
        // 2.创建SessionFactory对象
        SessionFactory sf = cfg.buildSessionFactory();
        // 3.创建session对象
        Session session = sf.openSession();
        // 4.开启事务
        Transaction ts = session.beginTransaction();
        // 5.保存用户
        Integer i = (Integer) session.save(user);
        // 提交事务
        ts.commit();
        // 关闭资源
        session.close();
        sf.close();
        // 返回i
        return i;
    }
}
