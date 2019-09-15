package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;

import java.util.List;

/**
 * description: DeptService
 * author: 冯凡利
 * create:  2019/9/8 9:23
 */
public interface DeptService {

    public boolean add(Dept dept);
    public Dept    get(Long id);
    public List<Dept> list();
}
