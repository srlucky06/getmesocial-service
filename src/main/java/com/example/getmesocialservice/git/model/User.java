package com.example.getmesocialservice.git.model;

import org.springframework.data.annotation.Id;

public class User {
   @Id
   private String id;
   private String name;
   private String address;
   private int age;
   private String profilePicUrl;

   public User(String id,String name, String address, int age, String profilePicUrl) {
      this.id = id;
      this.name = name;
      this.address = address;
      this.age = age;
      this.profilePicUrl = profilePicUrl;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String Address) {
      this.address = address;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }
   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id= id;
   }

   public String getProfilePicUrl() {
      return profilePicUrl;
   }

   public void setProfilePicUrl(String profilePicUrl) {
      this.profilePicUrl = profilePicUrl;
   }
}
