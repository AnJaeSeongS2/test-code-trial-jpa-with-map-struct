package com.sonan.tutorial.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Jaeseong on 2021/11/16
 * Git Hub : https://github.com/AnJaeSeongS2
 */
@Entity
@Data
@Table(name = "TUTO_HISTORY")
public class HistoryEntity {
    @Id
    private Integer id;

    @Column(name = "name")
    private String username;

    @Column(name = "code")
    private Integer code;
}
