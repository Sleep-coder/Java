package weeklyAssignments.weeklyAssignment2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<User> users = new ArrayList<>();
        Map<String, List<Post>> userPosts = new HashMap<>();

        int choice;
        do {
            System.out.println("1. Sign Up");
            System.out.println("2. Log In");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    String newUsername = scanner.nextLine();
                    users.add(new RegularUser(newUsername));
                    userPosts.put(newUsername, new ArrayList<>());
                    System.out.println("User signed up successfully!");
                    break;
                case 2:
                    System.out.print("Enter username: ");
                    String username = scanner.nextLine();
                    if (!userExists(username, users)) {
                        System.out.println("User does not exist. Please sign up first.");
                        break;
                    }
                    int userChoice;
                    do {
                        System.out.println("1. Add Post");
                        System.out.println("2. View Posts");
                        System.out.println("3. Edit Post");
                        System.out.println("4. Delete Post");
                        System.out.println("5. Log Out");
                        System.out.print("Enter your choice: ");
                        userChoice = scanner.nextInt();
                        scanner.nextLine();

                        switch (userChoice) {
                            case 1:
                                System.out.print("Enter post content: ");
                                String content = scanner.nextLine();
                                userPosts.get(username).add(new TextPost(getUser(username, users), content));
                                System.out.println("Post added successfully!");
                                break;
                            case 2:
                                System.out.println("Your Posts:");
                                for (Post post : userPosts.get(username)) {
                                    post.displayPostInfo();
                                }
                                break;
                            case 3:
                                System.out.print("Enter post index to edit: ");
                                int editIndex = scanner.nextInt();
                                scanner.nextLine(); // Consume newline
                                if (editIndex < 0 || editIndex >= userPosts.get(username).size()) {
                                    System.out.println("Invalid post index.");
                                    break;
                                }
                                System.out.print("Enter new post content: ");
                                String newContent = scanner.nextLine();
                                userPosts.get(username).get(editIndex).edit(newContent);
                                break;
                            case 4:
                                System.out.print("Enter post index to delete: ");
                                int deleteIndex = scanner.nextInt();
                                scanner.nextLine(); // Consume newline
                                if (deleteIndex < 0 || deleteIndex >= userPosts.get(username).size()) {
                                    System.out.println("Invalid post index.");
                                    break;
                                }
                                userPosts.get(username).get(deleteIndex).delete();
                                break;
                            case 5:
                                System.out.println("Logged out successfully!");
                                break;
                            default:
                                System.out.println("Invalid choice. Please try again.");
                                break;
                        }
                    } while (userChoice != 5);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);
    }

    private static boolean userExists(String username, List<User> users) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    private static User getUser(String username, List<User> users) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}

