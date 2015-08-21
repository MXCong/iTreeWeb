package com.iTree.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


/**
 * Message entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="message"
    ,catalog="itreetest"
)

public class Message  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String content;
     private Timestamp date;
     private String name;
     private String tel;
     private Integer status;


    // Constructors

    /** default constructor */
    public Message() {
    }

	/** minimal constructor */
    public Message(String content, Timestamp date, Integer status) {
        this.content = content;
        this.date = date;
        this.status = status;
    }
    
    /** full constructor */
    public Message(String content, Timestamp date, String name, String tel, Integer status) {
        this.content = content;
        this.date = date;
        this.name = name;
        this.tel = tel;
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
    
    @Column(name="content", nullable=false, length=65535)

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    @Column(name="date", nullable=false, length=19)

    public Timestamp getDate() {
        return this.date;
    }
    
    public void setDate(Timestamp date) {
        this.date = date;
    }
    
    @Column(name="name", length=10)

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="tel", length=50)

    public String getTel() {
        return this.tel;
    }
    
    public void setTel(String tel) {
        this.tel = tel;
    }
    
    @Column(name="status", nullable=false)

    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
   








}