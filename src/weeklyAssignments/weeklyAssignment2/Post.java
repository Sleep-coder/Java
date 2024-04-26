package weeklyAssignments.weeklyAssignment2;

// Post.java
public abstract class Post {
    protected User author;
    protected String content;

    public Post(User author, String content) {
        this.author = author;
        this.content = content;
    }

    public abstract void edit(String newContent);

    public abstract void delete();

    public void displayPostInfo() {
        System.out.println("Author: " + author.getUsername());
        System.out.println("Content: " + content);
    }
}
