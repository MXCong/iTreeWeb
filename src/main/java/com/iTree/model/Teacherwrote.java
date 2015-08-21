package com.iTree.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


/**
 * Teacherwrote entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="teacherwrote"
    ,catalog="itreetest"
)

public class Teacherwrote  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private User user;
     private String content;
     private Integer status;


    // Constructors

    /** default constructor */
    public Teacherwrote() {
    }

    
    /** full constructor */
    public Teacherwrote(User user, String content, Integer status) {
        this.user = user;
        this.content = content;
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
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="user_id", nullable=false)

    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    
    @Column(name="content", nullable=false, length=100)

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    @Column(name="status", nullable=false)

    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
   








}