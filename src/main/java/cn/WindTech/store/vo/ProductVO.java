package cn.WindTech.store.vo;

import java.io.Serializable;

public class ProductVO implements Serializable {
    private static final long serialVersionUID = -1375921507047753775L;
    private Integer pid;
    private String pro_Name;
    private String pro_Type;
    private String pro_img;
    private Integer pro_Num;
    private Integer pro_State;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPro_Name() {
        return pro_Name;
    }

    public void setPro_Name(String pro_Name) {
        this.pro_Name = pro_Name;
    }

    public String getPro_Type() {
        return pro_Type;
    }

    public void setPro_Type(String pro_Type) {
        this.pro_Type = pro_Type;
    }

    public String getPro_img() {
        return pro_img;
    }

    public void setPro_img(String pro_img) {
        this.pro_img = pro_img;
    }

    public Integer getPro_Num() {
        return pro_Num;
    }

    public void setPro_Num(Integer pro_Num) {
        this.pro_Num = pro_Num;
    }

    public Integer getPro_State() {
        return pro_State;
    }

    public void setPro_State(Integer pro_State) {
        this.pro_State = pro_State;
    }

    @Override
    public String toString() {
        return "ProductVO{" +
                "pid=" + pid +
                ", pro_Name='" + pro_Name + '\'' +
                ", pro_Type='" + pro_Type + '\'' +
                ", pro_img='" + pro_img + '\'' +
                ", pro_Num=" + pro_Num +
                ", pro_State=" + pro_State +
                '}';
    }
}