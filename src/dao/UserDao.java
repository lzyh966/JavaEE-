package dao;

import model.User;

public interface UserDao {
    /**
     * 根据用户名和密码查询用户
     *
     * @param name 用户名
     * @param pswd 密码
     * @return 返回查询到的用户
     */
    User find(String name, String pswd);

    /**
     * 插入用户
     *
     * @param user 用户对象
     * @return 返回受影响行数
     */
    int insert(User user);
}
