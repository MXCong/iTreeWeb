package com.iTree.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


/**
 * Duty entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="duty"
    ,catalog="itreetest"
)

public class Duty  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String name;
     private Integer status;


    // Constructors

    /** default constructor */
    public Duty() {
    }

    
    /** full constructor */
    public Duty(String name, Integer status) {
        this.name = name;
        this.status = status;
    }

   
    // Property accessors
    @GenericGenerator(name="generator", strategy="increment")@Id @GeneratedValue(generator="generator")
    
    @Column(name="id", unique=true, nullable=false)

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="name", nullable=false, length=10)

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="status", nullable=false)

    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
   








}