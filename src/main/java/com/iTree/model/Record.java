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
 * Record entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="record"
    ,catalog="itreetest"
)

public class Record  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private User user;
     private Image image;
     private Timestamp date;
     private String content;
     private Integer fileId;
     private Integer status;


    // Constructors

    /** default constructor */
    public Record() {
    }

	/** minimal constructor */
    public Record(User user, Timestamp date, String content, Integer status) {
        this.user = user;
        this.date = date;
        this.content = content;
        this.status = status;
    }
    
    /** full constructor */
    public Record(User user, Image image, Timestamp date, String content, Integer fileId, Integer status) {
        this.user = user;
        this.image = image;
        this.date = date;
        this.content = content;
        this.fileId = fileId;
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
    
    @Column(name="date", nullable=false, length=19)

    public Timestamp getDate() {
        return this.date;
    }
    
    public void setDate(Timestamp date) {
        this.date = date;
    }
    
    @Column(name="content", nullable=false, length=200)

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    @Column(name="file_id")

    public Integer getFileId() {
        return this.fileId;
    }
    
    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }
    
    @Column(name="status", nullable=false)

    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
   








}