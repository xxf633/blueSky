package com.baidu;

/**
 * Created by xxf123 on 2020/4/22.
 */
public class Test {
    public static void main(String[] args) {
        School sch=new School();
        sch.setSchooleAdress("北京");
        sch.setSchoolHistry("100百年");
        sch.setsId(1001);
        sch.setSchoolName("北京师范大学");
        System.out.println(sch);

        User user=new User();
        user.setAdd("sjdfsofs");
        user.setPwd("789");
        user.setUid(001);
        user.setUname("令狐冲");
        System.out.println("欢迎"+user.getUname()+"同学入学");
    }
}
