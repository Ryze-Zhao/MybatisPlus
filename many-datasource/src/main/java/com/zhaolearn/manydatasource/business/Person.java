package com.zhaolearn.manydatasource.business;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import com.zhaolearn.manydatasource.common.BaseEntity;
import lombok.Data;

@Data
@TableName(value = "person")
public class Person extends BaseEntity implements Serializable {
    /**
     * 姓名
     */
    @TableField(value = "name")
    private String name;

    /**
     * 年龄
     */
    @TableField(value = "age")
    private Integer age;

    private static final long serialVersionUID = 1L;
}