package com.baidu;

/**
 * Created by xxf123 on 2020/4/22.
 */
public class User {
    private Integer uid;
    private String uname;
    private String pwd;
    private String add;

    public User(Integer uid, String uname, String pwd, String add) {
        this.uid = uid;
        this.uname = uname;
        this.pwd = pwd;
        this.add = add;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", pwd='" + pwd + '\'' +
                ", add='" + add + '\'' +
                '}';
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public User() {
    }
}
