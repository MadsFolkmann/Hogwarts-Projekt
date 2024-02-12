package src.edu.hogwarts.data;

public class Textbook extends TeachingMaterial {
    private String title;
    private String author;
    private String publisher;
    private int publishedYear;

    public Textbook(String title, String author, String publisher, int publishedYear) {
        super(title, false, false, false, author + ", " + publisher + ", " + publishedYear);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(super.toString());
        result.append("Title: ").append(title).append("\n");
        result.append("Author: ").append(author).append("\n");
        result.append("Publisher: ").append(publisher).append("\n");
        result.append("Published Year: ").append(publishedYear).append("\n");
        return result.toString();
    }
}
