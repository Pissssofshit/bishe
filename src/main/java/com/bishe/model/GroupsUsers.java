package com.bishe.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class GroupsUsers implements Serializable {
    private Integer group;

    private Integer user;

    private Integer id;

    private Integer status;

    private Integer permissions;

    private Date time;

    private static final long serialVersionUID = 1L;

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPermissions() {
        return permissions;
    }

    public void setPermissions(Integer permissions) {
        this.permissions = permissions;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", group=").append(group);
        sb.append(", user=").append(user);
        sb.append(", id=").append(id);
        sb.append(", status=").append(status);
        sb.append(", permissions=").append(permissions);
        sb.append(", time=").append(time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}