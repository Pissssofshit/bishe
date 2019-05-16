package com.bishe.model;

import java.io.Serializable;

public class Rec implements Serializable {
    private Integer id;

    private Integer userId;

    private Integer recommandUserId;

    private String type1;

    private String type2;

    private String type3;

    private String type4;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRecommandUserId() {
        return recommandUserId;
    }

    public void setRecommandUserId(Integer recommandUserId) {
        this.recommandUserId = recommandUserId;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1 == null ? null : type1.trim();
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2 == null ? null : type2.trim();
    }

    public String getType3() {
        return type3;
    }

    public void setType3(String type3) {
        this.type3 = type3 == null ? null : type3.trim();
    }

    public String getType4() {
        return type4;
    }

    public void setType4(String type4) {
        this.type4 = type4 == null ? null : type4.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", recommandUserId=").append(recommandUserId);
        sb.append(", type1=").append(type1);
        sb.append(", type2=").append(type2);
        sb.append(", type3=").append(type3);
        sb.append(", type4=").append(type4);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}