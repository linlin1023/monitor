package com.reader.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("vote")
public class Vote {
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;
    @TableField(value="ranking")
    private String ranking;
    @TableField(value="name")
    private String name;
    @TableField(value="nowVotes")
    private String nowVotes;
    @TableField(value="createDate")
    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNowVotes() {
        return nowVotes;
    }

    public void setNowVotes(String nowVotes) {
        this.nowVotes = nowVotes;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
