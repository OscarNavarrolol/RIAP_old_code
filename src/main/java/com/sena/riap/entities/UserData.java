package com.sena.riap.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "user_data")
public class UserData {
    @Id
    @Column(name = "id_user")
    private long idUser;

    @Size(max = 10)
    @Column(name = "document_number")
    private String document;

    @Min(value = 0, message = "The age entered must be greater than zero")
    private int age;

    @NotBlank(message = "Name cannot be blank")
    @Size(max = 40, message = "Name length must be less than or equal to 40 characters")
    @Column(name = "full_name")
    private String nameUser;

    @Email
    @NotBlank(message = "email cannot be blank")
    @Size(max = 40, message = "Email length must have a maximum of 40 characters")
    private String email;

    @NotBlank(message = "Phone cannot be blank")
    @Size(min = 10, max = 10, message = "Phone number must be exactly 10 digits")
    private String phone;

    @NotBlank
    @Column(name = "role_user")
    private String roleUser;

    @NotBlank
    @Column(name = "password_user")
    private String password;

    @NotBlank
    @Column(name = "profile_picture")
    private String profilePicture;

 public long getIdUser() {
  return idUser;
 }

 public void setIdUser(long idUser) {
  this.idUser = idUser;
 }

 public String getDocument() {
  return document;
 }

 public void setDocument(String document) {
  this.document = document;
 }

 public int getAge() {
  return age;
 }

 public void setAge(int age) {
  this.age = age;
 }

 public String getNameUser() {
  return nameUser;
 }

 public void setNameUser(String nameUser) {
  this.nameUser = nameUser;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public String getPhone() {
  return phone;
 }

 public void setPhone(String phone) {
  this.phone = phone;
 }

 public String getRoleUser() {
  return roleUser;
 }

 public void setRoleUser(String roleUser) {
  this.roleUser = roleUser;
 }

 public String getPassword() {
  return password;
 }

 public void setPassword(String password) {
  this.password = password;
 }

 public String getProfilePicture() {
  return profilePicture;
 }

 public void setProfilePicture(String profilePicture) {
  this.profilePicture = profilePicture;
 }
}

