package com.kishan.form.management.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * The Class LoginUser.
 * @author ram A entity that uses Spring Data's AbstractPersistable.
 */

@Entity
@Table(name = "LoginUser")
public class LoginUser extends SvmBaseEntity implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The user name. */
    @Basic
    @NotNull
    @Size(min = 4, max = 20)
    @Column(name = "user_name")
    private String            username;

    /** The password. */
    @Basic
    @NotNull
    @Size(min = 4, max = 20)
    @Column(name = "password")
    private String            password;

    /** The first name. */
    @Basic
    @NotNull
    @Size(min = 4, max = 20)
    @Column(name = "First_Name")
    private String            firstName;

    /** The last name. */
    @Basic
    @NotNull
    @Size(min = 4, max = 20)
    @Column(name = "Last_Name")
    private String            lastName;

    /** The middle name. */
    @Basic
    @Size(min = 4, max = 20)
    @Column(name = "Middle_Name")
    private String            middleName;

    /** The age. */
    @Basic
    @NotNull
    @Min(value = 1)
    @Column(name = "Age")
    private Long              age;

    /** The dob. */
    @Basic
    @NotNull
    @Column(name = "Dob")
    private Date              dob;

    /** The city. */
    @Basic
    @NotNull
    @Size(min = 4, max = 20)
    @Column(name = "City")
    private String            city;

    /** The state. */
    @Basic
    @NotNull
    @Size(min = 4, max = 20)
    @Column(name = "State")
    private String            state;
    
    
    @Basic
    @NotNull
    @Size(min = 4, max = 20)
    @Column(name = "Country")
    private String            country;

    /** The contact no. */
    @Basic
    @NotNull
    @Size(min = 4, max = 10)
    @Column(name = "ContactNo")
    private String            contactNO;

    /** The father first name. */
    @Basic
    @NotNull
    @Size(min = 4, max = 20)
    @Column(name = "Father_Fist_Name")
    private String            fatherFirstName;

    /** The father middle name. */
    @Basic
    @Size(min = 4, max = 20)
    @Column(name = "Father_Middle_Name")
    private String            fatherMiddlename;

    /** The father last name. */
    @Basic
    @NotNull
    @Size(min = 4, max = 20)
    @Column(name = "Father_Last_Name")
    private String            fatherLastName;

    /** The mother first name. */
    @Basic
    @NotNull
    @Size(min = 4, max = 20)
    @Column(name = "Mother_Fist_Name")
    private String            motherFirstName;

    /** The mother last name. */
    @Basic
    @Size(min = 4, max = 20)
    @Column(name = "Mother_Last_Name")
    private String            motherLastName;

    /** The mother middle name. */
    @Basic
    @NotNull
    @Size(min = 4, max = 20)
    @Column(name = "Mother_Middle_Name")
    private String            motherMiddleName;

    /** The email id. */
    @Basic
    @NotNull
    @Size(min = 4, max = 20)
    @Column(name = "EmailId")
    private String            emailId;

    /**
     * Instantiates a new login user.
     */
    public LoginUser() {
    }

    /**
     * Instantiates a new login user.
     * @param username
     *            the use rname
     * @param password
     *            the password
     */
    public LoginUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Gets the user name.
     * @return the user name
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Sets the user name.
     * @param username
     *            the new user name
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets the password.
     * @return the password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Sets the password.
     * @param password
     *            the new password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets the first name.
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name.
     * @param firstName
     *            the new first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name.
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name.
     * @param lastName
     *            the new last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the middle name.
     * @return the middle name
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the middle name.
     * @param middleName
     *            the new middle name
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * Gets the age.
     * @return the age
     */
    public Long getAge() {
        return age;
    }

    /**
     * Sets the age.
     * @param age
     *            the new age
     */
    public void setAge(Long age) {
        this.age = age;
    }

    /**
     * Gets the dob.
     * @return the dob
     */
    public Date getDob() {
        return dob;
    }

    /**
     * Sets the dob.
     * @param dob
     *            the new dob
     */
    public void setDob(Date dob) {
        this.dob = dob;
    }

    /**
     * Gets the city.
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city.
     * @param city
     *            the new city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets the state.
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the state.
     * @param state
     *            the new state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets the contact no.
     * @return the contact no
     */
    public String getContactNO() {
        return contactNO;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Sets the contact no.
     * @param contactNO
     *            the new contact no
     */
    public void setContactNO(String contactNO) {
        this.contactNO = contactNO;
    }

    /**
     * Gets the father first name.
     * @return the father first name
     */
    public String getFatherFirstName() {
        return fatherFirstName;
    }

    /**
     * Sets the father first name.
     * @param fatherFirstName
     *            the new father first name
     */
    public void setFatherFirstName(String fatherFirstName) {
        this.fatherFirstName = fatherFirstName;
    }

    /**
     * Gets the father middle name.
     * @return the father middle name
     */
    public String getFatherMiddlename() {
        return fatherMiddlename;
    }

    /**
     * Sets the father middle name.
     * @param fatherMiddlename
     *            the new father middle name
     */
    public void setFatherMiddlename(String fatherMiddlename) {
        this.fatherMiddlename = fatherMiddlename;
    }

    /**
     * Gets the father last name.
     * @return the father last name
     */
    public String getFatherLastName() {
        return fatherLastName;
    }

    /**
     * Sets the father last name.
     * @param fatherLastName
     *            the new father last name
     */
    public void setFatherLastName(String fatherLastName) {
        this.fatherLastName = fatherLastName;
    }

    /**
     * Gets the mother first name.
     * @return the mother first name
     */
    public String getMotherFirstName() {
        return motherFirstName;
    }

    /**
     * Sets the mother first name.
     * @param motherFirstName
     *            the new mother first name
     */
    public void setMotherFirstName(String motherFirstName) {
        this.motherFirstName = motherFirstName;
    }

    /**
     * Gets the mother last name.
     * @return the mother last name
     */
    public String getMotherLastName() {
        return motherLastName;
    }

    /**
     * Sets the mother last name.
     * @param motherLastName
     *            the new mother last name
     */
    public void setMotherLastName(String motherLastName) {
        this.motherLastName = motherLastName;
    }

    /**
     * Gets the mother middle name.
     * @return the mother middle name
     */
    public String getMotherMiddleName() {
        return motherMiddleName;
    }

    /**
     * Sets the mother middle name.
     * @param motherMiddleName
     *            the new mother middle name
     */
    public void setMotherMiddleName(String motherMiddleName) {
        this.motherMiddleName = motherMiddleName;
    }

    /**
     * Gets the email id.
     * @return the email id
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * Sets the email id.
     * @param emailId
     *            the new email id
     */
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("LoginUser [username=");
        builder.append(username);
        builder.append(", password=");
        builder.append(password);
        builder.append(", firstName=");
        builder.append(firstName);
        builder.append(", lastName=");
        builder.append(lastName);
        builder.append(", middleName=");
        builder.append(middleName);
        builder.append(", age=");
        builder.append(age);
        builder.append(", dob=");
        builder.append(dob);
        builder.append(", city=");
        builder.append(city);
        builder.append(", state=");
        builder.append(state);
        builder.append(", contactNO=");
        builder.append(contactNO);
        builder.append(", fatherFirstName=");
        builder.append(fatherFirstName);
        builder.append(", fatherMiddlename=");
        builder.append(fatherMiddlename);
        builder.append(", fatherLastName=");
        builder.append(fatherLastName);
        builder.append(", motherFirstName=");
        builder.append(motherFirstName);
        builder.append(", motherLastName=");
        builder.append(motherLastName);
        builder.append(", motherMiddleName=");
        builder.append(motherMiddleName);
        builder.append(", emailId=");
        builder.append(emailId);
        builder.append("]");
        return builder.toString();
    }

}
