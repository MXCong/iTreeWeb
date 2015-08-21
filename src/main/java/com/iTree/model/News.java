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
 * News entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="news"
    ,catalog="itreetest"
)

public class News  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Image image;
     private String tittle;
     private String content;
     private String profile;
     private String author;
     private Timestamp date;
     private Integer status;


    // Constructors

    /** default constructor */
    public News() {
    }

	/** minimal constructor */
    public News(String tittle, String content, String profile, String author, Timestamp date, Integer status) {
        this.tittle = tittle;
        this.content = content;
        this.profile = profile;
        this.author = author;
        this.date = date;
        this.status = status;
    }
    
    /** full constructor */
    public News(Image image, String tittle, String content, String profile, String author, Timestamp date, Integer status) {
        this.image = image;
        this.tittle = tittle;
        this.content = content;
        this.profile = profile;
        this.author = author;
        this.date = date;
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
        @JoinColumn(name="photo_id")

    public Image getImage() {
        return this.image;
    }
    
    public void setImage(Image image) {
        this.image = image;
    }
    
    @Column(name="tittle", nullable=false, length=50)

    public String getTittle() {
        return this.tittle;
    }
    
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
    
    @Column(name="content", nullable=false, length=65535)

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    @Column(name="profile", nullable=false, length=50)

    public String getProfile() {
        return this.profile;
    }
    
    public void setProfile(String profile) {
        this.profile = profile;
    }
    
    @Column(name="author", nullable=false, length=10)

    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    @Column(name="date", nullable=false, length=19)

    public Timestamp getDate() {
        return this.date;
    }
    
    public void setDate(Timestamp date) {
        this.date = date;
    }
    
    @Column(name="status", nullable=false)

    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
   








}