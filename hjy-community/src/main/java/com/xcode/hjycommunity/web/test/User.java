package com.xcode.hjycommunity.web.test;

import javax.validation.constraints.NotNull;

public class User {


    @NotNull(message = "userId不為空")
    private String userId;
    @NotNull(message = "username不為空")
    private String username;

    public User() {
    }

    public User(String userId, String username) {
        this.userId = userId;
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
