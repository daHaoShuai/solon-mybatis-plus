package com.da.service;

import com.baomidou.mybatisplus.solon.service.impl.ServiceImpl;
import com.da.mapper.UserMapper;
import com.da.po.User;
import org.noear.solon.extend.aspect.annotation.Service;

/**
 * Author Da
 * Description: <br/>
 * 三十年生死两茫茫，写程序，到天亮。
 * 千行代码，Bug何处藏。
 * 纵使上线又怎样，朝令改，夕断肠。
 * 领导每天新想法，天天改，日日忙。
 * 相顾无言，惟有泪千行。
 * 每晚灯火阑珊处，夜难寐，又加班。
 * Date: 2022-05-11
 * Time: 14:26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
