package com.baidu;

import java.io.Serializable;

/**
 * Created by xxf123 on 2020/4/22.
 */
public class School implements Serializable{
    private Integer sId;
    private String schoolName;
    private String schooleAdress;
    private String schoolHistry;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchooleAdress() {
        return schooleAdress;
    }

    public void setSchooleAdress(String schooleAdress) {
        this.schooleAdress = schooleAdress;
    }

    public String getSchoolHistry() {
        return schoolHistry;
    }

    public void setSchoolHistry(String schoolHistry) {
        this.schoolHistry = schoolHistry;
    }

    public School() {
    }

    public School(Integer sId, String schoolName, String schooleAdress, String schoolHistry) {
        this.sId = sId;
        this.schoolName = schoolName;
        this.schooleAdress = schooleAdress;
        this.schoolHistry = schoolHistry;
    }

    @Override
    public String toString() {
        return "School{" +
                "sId=" + sId +
                ", schoolName='" + schoolName + '\'' +
                ", schooleAdress='" + schooleAdress + '\'' +
                ", schoolHistry='" + schoolHistry + '\'' +
                '}';
    }
}
