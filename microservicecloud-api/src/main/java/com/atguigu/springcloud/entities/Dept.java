package com.atguigu.springcloud.entities;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
/**
 * description: Dept
 * author: 冯凡利
 * create:  2019/9/7 18:55
 */
@SuppressWarnings("serial")     // 压警告
@NoArgsConstructor
@Data
@Accessors(chain=true)          //  需要学习
public class Dept implements Serializable //必须序列化       entity --orm  --- db_table
{
    private Long  deptno;   //主键
    private String  dname;   //部门名称
    private String  db_source;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname)
    {
        super();
        this.dname = dname;
    }
}
