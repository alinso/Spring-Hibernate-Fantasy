package com.alinso.fantasy.database.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;


@MappedSuperclass
public class BaseEntity implements Serializable {
    @Id
    @GenericGenerator(
            name = "system-uuid",
            strategy = "uuid"
    )
    @GeneratedValue(generator = "system-uuid")
    @Column(name ="id", length = 32)
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @UpdateTimestamp
    private Date updatedAt;

    @CreationTimestamp
    private Date createdAt;

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
