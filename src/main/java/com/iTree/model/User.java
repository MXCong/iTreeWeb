package com.iTree.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


/**
 * User entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="user"
    ,catalog="itreetest"
)

public class User  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Image image;
     private String userName;
     private Integer dutyId;
     private Integer sex;
     private String hoby;
     private String motto;
     private Integer tel;
     private String profile;
     private Integer status;
     private Set<Login> logins = new HashSet<Login>(0);
     private Set<File> files = new HashSet<File>(0);
     private Set<Record> records = new HashSet<Record>(0);
     private Set<Plan> plans = new HashSet<Plan>(0);
     private Set<Teacherwrote> teacherwrotes = new HashSet<Teacherwrote>(0);


    // Constructors

    /** default constructor */
    public User() {
    }

	/** minimal constructor */
    public User(Image image, String userName, Integer dutyId, Integer sex, Integer tel, String profile, Integer status) {
        this.image = image;
        this.userName = userName;
        this.dutyId = dutyId;
        this.sex = sex;
        this.tel = tel;
        this.profile = profile;
        this.status = status;
    }
    
    /** full constructor */
    public User(Image image, String userName, Integer dutyId, Integer sex, String hoby, String motto, Integer tel, String profile, Integer status, Set<Login> logins, Set<File> files, Set<Record> records, Set<Plan> plans, Set<Teacherwrote> teacherwrotes) {
        this.image = image;
        this.userName = userName;
        this.dutyId = dutyId;
        this.sex = sex;
        this.hoby = hoby;
        this.motto = motto;
        this.tel = tel;
        this.profile = profile;
        this.status = status;
        this.logins = logins;
        this.files = files;
        this.records = records;
        this.plans = plans;
        this.teacherwrotes = teacherwrotes;
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
        @JoinColumn(name="photo_id", nullable=false)

    public Image getImage() {
        return this.image;
    }
    
    public void setImage(Image image) {
        this.image = image;
    }
    
    @Column(name="user_name", nullable=false, length=10)

    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    @Column(name="duty_id", nullable=false)

    public Integer getDutyId() {
        return this.dutyId;
    }
    
    public void setDutyId(Integer dutyId) {
        this.dutyId = dutyId;
    }
    
    @Column(name="sex", nullable=false)

    public Integer getSex() {
        return this.sex;
    }
    
    public void setSex(Integer sex) {
        this.sex = sex;
    }
    
    @Column(name="hoby", length=50)

    public String getHoby() {
        return this.hoby;
    }
    
    public void setHoby(String hoby) {
        this.hoby = hoby;
    }
    
    @Column(name="motto", length=50)

    public String getMotto() {
        return this.motto;
    }
    
    public void setMotto(String motto) {
        this.motto = motto;
    }
    
    @Column(name="tel", nullable=false)

    public Integer getTel() {
        return this.tel;
    }
    
    public void setTel(Integer tel) {
        this.tel = tel;
    }
    
    @Column(name="profile", nullable=false, length=50)

    public String getProfile() {
        return this.profile;
    }
    
    public void setProfile(String profile) {
        this.profile = profile;
    }
    
    @Column(name="status", nullable=false)

    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="user")

    public Set<Login> getLogins() {
        return this.logins;
    }
    
    public void setLogins(Set<Login> logins) {
        this.logins = logins;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="user")

    public Set<File> getFiles() {
        return this.files;
    }
    
    public void setFiles(Set<File> files) {
        this.files = files;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="user")

    public Set<Record> getRecords() {
        return this.records;
    }
    
    public void setRecords(Set<Record> records) {
        this.records = records;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="user")

    public Set<Plan> getPlans() {
        return this.plans;
    }
    
    public void setPlans(Set<Plan> plans) {
        this.plans = plans;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="user")

    public Set<Teacherwrote> getTeacherwrotes() {
        return this.teacherwrotes;
    }
    
    public void setTeacherwrotes(Set<Teacherwrote> teacherwrotes) {
        this.teacherwrotes = teacherwrotes;
    }
   








}