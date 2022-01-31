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
@Table(name = "acl_permission")
public class Permission extends BaseEntity implements Serializable {

    /**
     * 主键id
     */
    @Id
    @Column(name = "id")
    private Long id;

    /**
     * 所属菜单id
     */
    @Id
    @Column(name = "menu_id")
    private Long menuId;

    /**
     * 权限名字
     */
    @Id
    @Column(name = "name")
    private String name;

}
