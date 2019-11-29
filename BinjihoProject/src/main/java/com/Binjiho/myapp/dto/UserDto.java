package com.Binjiho.myapp.dto;

import java.util.Date;

public class UserDto {
   private int userSeq;
   private String userName;
   private String userPassword;
   private String userEmail;
   private String userprofileImageUrl;
   private Date userRegisterDate;
   private int managerCode;
   
   public int getUserSeq() {
      return userSeq;
   }
   public void setUserSeq(int userSeq) {
      this.userSeq = userSeq;
   }
   public String getUserName() {
      return userName;
   }
   public void setUserName(String userName) {
      this.userName = userName;
   }
   public String getUserPassword() {
      return userPassword;
   }
   public void setUserPassword(String userPassword) {
      this.userPassword = userPassword;
   }
   public String getUserEmail() {
      return userEmail;
   }
   public void setUserEmail(String userEmail) {
      this.userEmail = userEmail;
   }
   public String getUserProfileImageUrl() {
      return userprofileImageUrl;
   }
   public void setUserProfileImageUrl(String userprofileImageUrl) {
      this.userprofileImageUrl = userprofileImageUrl;
   }
   
   public Date getUserRegisterDate() {
      return userRegisterDate;
   }
   public void setUserRegisterDate(Date userRegisterDate) {
      this.userRegisterDate = userRegisterDate;
   }
public int getManagerCode() {
	return managerCode;
}
public void setManagerCode(int managerCode) {
	this.managerCode = managerCode;
}
   
   
}