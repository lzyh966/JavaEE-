package service.serviceImpl;

import dao.UserDao;
import dao.daoImpl.UserDaoImpl;
import model.User;
import service.UserService;
import sun.nio.cs.US_ASCII;

public class UserServiceImpl implements UserService{

	@Override
	public User findByNameAndPswd(String userName, String password) {
		UserDao userDao = new UserDaoImpl();
		
		return userDao.find(userName, password);
	}

	@Override
	public int insertUser(User user) {
		UserDao userDao=new UserDaoImpl();
		return userDao.insert(user);
	}

}
