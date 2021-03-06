package com.s2sh.serviceImpl;

import org.springframework.stereotype.Service;

import com.s2sh.model.User;
import com.s2sh.service.UserService;

/**
 * 
 * @author ChenTao
 * @date 2015年05月29日下午9:43:37
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

}