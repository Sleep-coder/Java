package weeklyAssignments.weeklyAssignment2;

// User.java
public abstract class User {
    protected String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public abstract void displayUserInfo();
}
