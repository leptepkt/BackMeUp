package net.backmeup.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class CampaignEntity extends CommonEntity {
    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @Column
    private String titleUrl;

    @Column
    private String detail;

    @Column
    private double goal;

    @Column
    private Date startDate;

    @Column
    private Date endDate;

}
