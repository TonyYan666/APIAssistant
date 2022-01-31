package com.smileframework.apiassistant.apiassistant.common.entity.base;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;


@Setter
@Getter
@MappedSuperclass
public class BaseEntity {

    /**
     * 创建人id
     */
    @Column(name = "create_id", length = 50)
    private Long createId;

    /**
     * 创建人
     */
    @Column(name = "create_name", length = 50)
    private String createName;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 修改人id
     */
    @Column(name = "modify_id", length = 50)
    private Long modifyId;

    /**
     * 修改人
     */
    @Column(name = "modify_name", length = 50)
    private String modifyName;

    /**
     * 修改时间
     */
    @Column(name = "modify_date")
    private Date modifyDate;

}
