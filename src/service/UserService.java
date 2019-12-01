package service;

import model.User;

public interface UserService {
    /**
     * 通过用户名和密码查询用户
     *
     * @param userName 用户名
     * @param password 密码
     * @return 返回查询用户
     */
    User findByNameAndPswd(String userName, String password);

    /**
     * 插入用户
     *
     * @param user 用户
     * @return 返回受影响行数
     */
    int insertUser(User user);
}
