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
@Table(name = "project")
public class Project extends BaseEntity implements Serializable {

    /**
     * 主键id
     */
    @Id
    @Column(name = "id")
    private Long id;

    /**
     * 项目名字
     */
    @Column(name = "name")
    private String name;

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
     * 项目名称
     */
    @Column(name = "description")
    private String description;

    /**
     * 项目管理人id（关联user表id）
     */
    @Column(name = "owner_id")
    private Long ownerId;

}
