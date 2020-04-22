package com.baidu;

import java.io.Serializable;

/**
 * Created by xxf123 on 2020/4/22.
 */
public class Document implements Serializable{
    private String  dname;

    public Document(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Document{" +
                "dname='" + dname + '\'' +
                '}';
    }

    public Document() {
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
