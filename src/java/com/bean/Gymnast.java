
package com.bean;

/**
 *
 * @author USER
 */
public class Gymnast {
   private int gymnastID;
   private String gymnastName,gymnastState,profilePicture,category,program;

    public Gymnast(int gymnastID, String gymnastName, String gymnastState, String profilePicture, String category, String program) {
        this.gymnastID = gymnastID;
        this.gymnastName = gymnastName;
        this.gymnastState = gymnastState;
        this.profilePicture = profilePicture;
        this.category = category;
        this.program = program;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
}
