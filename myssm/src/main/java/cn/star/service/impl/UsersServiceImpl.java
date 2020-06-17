package cn.star.service.impl;
import cn.star.dao.UsersDao;
import cn.star.domain.Users;
import cn.star.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
/**
 * 〈一句话功能简述〉<br> 
 * 〈Service 实现类〉
 *
 * @author OneStar
 * @create 2019/11/9
 * @since 1.0.0
 */
@Service("usersService")
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersDao usersDao;

    @Override
    public List<Users> findUsers() {
        System.out.println("业务层：查询用户");
        return usersDao.findUsers();
    }

    @Override
    public void insertUsers(Users users) {
        System.out.println("业务层：用户注册");
        usersDao.insertUsers(users);
    }

    @Override
    public boolean login(Users users) {
        System.out.println("业务层：用户登录");
        if(usersDao.login(users) == null){
            return false;
        }else{
            return true;
        }

    }

    @Override
    public boolean delete(Users users) {
        System.out.println("业务层：用户删除");
        usersDao.delete(users);
        return true;

    }



}