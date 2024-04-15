
package com.bean;

/**
 *
 * @author USER
 */
public class Gymnast {
   private int gymnastID;
   private String gymnastName,gymnastState,profilePicture;

    public Gymnast(int gymnastID, String gymnastName, String gymnastState, String profilePicture) {
        this.gymnastID = gymnastID;
        this.gymnastName = gymnastName;
        this.gymnastState = gymnastState;
        this.profilePicture = profilePicture;
    }

    public int getGymnastID() {
        return gymnastID;
    }

    public void setGymnastID(int gymnastID) {
        this.gymnastID = gymnastID;
    }

    public String getGymnastName() {
        return gymnastName;
    }

    public void setGymnastName(String gymnastName) {
        this.gymnastName = gymnastName;
    }

    public String getGymnastState() {
        return gymnastState;
    }

    public void setGymnastState(String gymnastState) {
        this.gymnastState = gymnastState;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

}
