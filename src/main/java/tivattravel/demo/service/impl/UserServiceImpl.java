package tivattravel.demo.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import tivattravel.demo.bean.User;
import tivattravel.demo.mapper.UserMapper;
import tivattravel.demo.service.UserService;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


}
