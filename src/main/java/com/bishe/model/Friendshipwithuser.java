package com.bishe.model;

import java.io.Serializable;
import java.util.Date;

public class Friendshipwithuser implements Serializable {
    public Integer applyidu;

    public String applyusername;

    public Integer status;

    public Integer beApplyId;

    public Integer id;

    public Date time;

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private static final long serialVersionUID = 1L;

    public Integer getApplyidu() {
        return applyidu;
    }

    public void setApplyidu(Integer applyidu) {
        this.applyidu = applyidu;
    }

    public String getApplyusername() {
        return applyusername;
    }

    public void setApplyusername(String applyusername) {
        this.applyusername = applyusername == null ? null : applyusername.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getBeApplyId() {
        return beApplyId;
    }

    public void setBeApplyId(Integer beApplyId) {
        this.beApplyId = beApplyId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", applyidu=").append(applyidu);
        sb.append(", applyusername=").append(applyusername);
        sb.append(", status=").append(status);
        sb.append(", beApplyId=").append(beApplyId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}