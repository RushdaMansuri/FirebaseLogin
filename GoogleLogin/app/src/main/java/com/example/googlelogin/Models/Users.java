package com.example.googlelogin.Models;

public class Users {
    String UserId, UserName, ProfilePic;

    public Users(String userId, String userName, String profilePic) {
        UserId = userId;
        UserName = userName;
        ProfilePic = profilePic;
    }

    public String getUserId() {
        return UserId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setProfilePic(String profilePic) {
        ProfilePic = profilePic;
    }

    public String getProfilePic() {
        return ProfilePic;
    }

    public Users(){

    }

}
