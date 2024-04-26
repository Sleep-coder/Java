package weeklyAssignments.weeklyAssignment2;

// TextPost.java
public class TextPost extends Post {
    public TextPost(User author, String content) {
        super(author, content);
    }

    @Override
    public void edit(String newContent) {
        this.content = newContent;
        System.out.println("Text post edited: " + content);
    }

    @Override
    public void delete() {
        this.content = null;
        System.out.println("Text post deleted.");
    }
}
