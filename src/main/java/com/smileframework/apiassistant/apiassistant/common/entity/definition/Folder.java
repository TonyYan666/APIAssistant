package com.smileframework.apiassistant.apiassistant.common.entity.definition;

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
@Table(name = "folder")
public class Folder extends BaseEntity implements Serializable {

    /**
     * 主键id
     */
    @Id
    @Column(name = "id")
    private Long id;

    /**
     * 文件夹名称
     */
    @Column(name = "folder_name")
    private String folderName;

    /**
     * 父文件夹
     */
    @Column(name = "parent_folder_id")
    private String parentId;

    /**
     * 项目id
     */
    @Column(name = "project_id")
    private Long projectId;

}
