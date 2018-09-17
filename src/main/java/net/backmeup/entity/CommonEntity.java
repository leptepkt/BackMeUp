package net.backmeup.entity;

import java.util.Date;

import javax.persistence.Column;

import lombok.Data;

@Data
public abstract class CommonEntity {

    @Column
    private Date createdAt;

    @Column
    private Date updatedDate;
}
