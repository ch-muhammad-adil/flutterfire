package io.flutter.plugins.firebasemessaging;

import java.io.Serializable;

public class DataNotification implements Serializable {
    private String postId = "";
    private String title = "";
    private String body = "";
    private String profilePicture = "";
    private String postAdmin = "";


    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getPostAdmin() {
        return postAdmin;
    }

    public void setPostAdmin(String postAdmin) {
        this.postAdmin = postAdmin;
    }
}
