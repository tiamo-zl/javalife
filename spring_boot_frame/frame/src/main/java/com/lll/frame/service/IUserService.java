package com.lll.frame.service;


import com.lll.frame.dao.DO.User;

import java.util.List;

/**
 * IUserService
 *
 * @Author: ZL
 * @CreateTime: 2019-02-25 17:51
 */
public interface IUserService {

    /**
     * 根据id进行查找
     * @param id id
     * @return 用户信息
     */
    User findOne(int id);

    /**
     * 查找所有
     * @return
     */
    List<User> findAll();

    /**
     * 新增
     * @return
     */
    int add();
}
