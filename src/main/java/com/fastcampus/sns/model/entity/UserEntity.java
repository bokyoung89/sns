package com.fastcampus.sns.model.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Table
public class UserEntity {

    @Id
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    @Column
    private String password;

    public void chageBasicInfo(int i, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }
}
