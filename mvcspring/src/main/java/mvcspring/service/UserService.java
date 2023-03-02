package mvcspring.service;

import mvcspring.dao.UserDao;
import mvcspring.dao.UserDaoImpl;
import mvcspring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao UserDao;
    public int insert(User user) {
        return this.UserDao.insert(user);
    }
}
