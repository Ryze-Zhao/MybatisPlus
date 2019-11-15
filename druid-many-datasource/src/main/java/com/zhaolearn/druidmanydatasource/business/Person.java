package com.zhaolearn.druidmanydatasource.business;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zhaolearn.druidmanydatasource.common.BaseEntity;
import lombok.Data;

import java.io.Serializable;

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