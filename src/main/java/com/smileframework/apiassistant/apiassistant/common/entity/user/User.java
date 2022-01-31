package com.smileframework.apiassistant.apiassistant.common.entity.user;

import com.smileframework.apiassistant.apiassistant.common.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Setter
@Getter
@Entity
@Table(name = "user")
public class User extends BaseEntity implements Serializable {

    /**
     * 主键id
     */
    @Id
    @Column(name = "id")
    private Long id;

    /**
     * 名字
     */
    @Column(name = "name")
    private String name;

    /**
     * 电话
     */
    @Column(name = "phone")
    private String phone;

    /**
     * 邮箱
     */
    @Column(name = "email")
    private String email;

    /**
     * 公司
     */
    @Column(name = "organization")
    private String organization;

    /**
     * 头像
     */
    @Column(name = "icon")
    private String icon;

    /**
     * 签名
     */
    @Column(name = "signature")
    private String signature;

    /**
     * 密码
     */
    @Column(name = "password")
    private String password;

}
