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
@Table(name = "acl_user_role")
public class UserRole extends BaseEntity implements Serializable {

    /**
     * 主键id
     */
    @Id
    @Column(name = "id")
    private Long id;

    /**
     * 角色id
     */
    @Column(name = "name")
    private Long roleId;

    /**
     * 用户id
     */
    @Column(name = "name")
    private Long userId;

}
