package com.smileframework.apiassistant.apiassistant.common.entity.manage;

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
@Table(name = "acl_role_permission")
public class RolePermission extends BaseEntity implements Serializable {

    /**
     * 主键id
     */
    @Id
    @Column(name = "id")
    private Long id;

    /**
     * 角色id
     */
    @Column(name = "role_id")
    private Long roleId;

    /**
     * 权限id
     */
    @Column(name = "permission_id")
    private Long permissionId;

}
