package weeklyAssignments.weeklyAssignment2;

// RegularUser.java
public class RegularUser extends User {
    public RegularUser(String username) {
        super(username);
    }

    @Override
    public void displayUserInfo() {
        System.out.println("Regular User: " + username);
    }
}
