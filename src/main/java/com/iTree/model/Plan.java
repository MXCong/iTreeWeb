package com.iTree.model;

import java.sql.Timestamp;
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
 * Plan entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="plan"
    ,catalog="itreetest"
)

public class Plan  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private User user;
     private Image image;
     private String content;
     private Timestamp start;
     private Timestamp end;
     private Timestamp update;
     private Integer parent;
     private Integer compared;
     private Integer status;


    // Constructors

    /** default constructor */
    public Plan() {
    }

	/** minimal constructor */
    public Plan(User user, String content, Timestamp start, Timestamp end, Timestamp update, Integer parent, Integer compared, Integer status) {
        this.user = user;
        this.content = content;
        this.start = start;
        this.end = end;
        this.update = update;
        this.parent = parent;
        this.compared = compared;
        this.status = status;
    }
    
    /** full constructor */
    public Plan(User user, Image image, String content, Timestamp start, Timestamp end, Timestamp update, Integer parent, Integer compared, Integer status) {
        this.user = user;
        this.image = image;
        this.content = content;
        this.start = start;
        this.end = end;
        this.update = update;
        this.parent = parent;
        this.compared = compared;
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
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="photo_id")

    public Image getImage() {
        return this.image;
    }
    
    public void setImage(Image image) {
        this.image = image;
    }
    
    @Column(name="content", nullable=false, length=100)

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    @Column(name="start", nullable=false, length=19)

    public Timestamp getStart() {
        return this.start;
    }
    
    public void setStart(Timestamp start) {
        this.start = start;
    }
    
    @Column(name="end", nullable=false, length=19)

    public Timestamp getEnd() {
        return this.end;
    }
    
    public void setEnd(Timestamp end) {
        this.end = end;
    }
    
    @Column(name="update", nullable=false, length=19)

    public Timestamp getUpdate() {
        return this.update;
    }
    
    public void setUpdate(Timestamp update) {
        this.update = update;
    }
    
    @Column(name="parent", nullable=false)

    public Integer getParent() {
        return this.parent;
    }
    
    public void setParent(Integer parent) {
        this.parent = parent;
    }
    
    @Column(name="compared", nullable=false)

    public Integer getCompared() {
        return this.compared;
    }
    
    public void setCompared(Integer compared) {
        this.compared = compared;
    }
    
    @Column(name="status", nullable=false)

    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
   








}