package com.hlf.cas.common;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author daemon
 * @Date 18/10/12 10:02
 * To change this template use File | Settings | File Templates.
 */
public class BizUser implements Serializable {

    private long id;

    private long bizId;

    private String userId;

    private String creator;

    private String updater;

    private Date createTime;

    private Date updateTime;

    private int status;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getBizId() {
        return bizId;
    }

    public void setBizId(long bizId) {
        this.bizId = bizId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
