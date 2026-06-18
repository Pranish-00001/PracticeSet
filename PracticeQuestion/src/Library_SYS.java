// Practice 13: Library System

//PRANISH KHANAL

interface Searchable {  //interface
    void search(String keyword);
}

class EBook implements Searchable {     //instance variable
    private String title;
    private String content;

    public EBook(String title, String content) {    //constructors
        this.title = title;
        this.content = content;
    }

    @Override
    public void search(String keyword) {
        if (content.toLowerCase().contains(keyword.toLowerCase())) {
            System.out.println("Keyword found " + title);
        } else {
            System.out.println("Keyword not found " + title);
        }
    }
}

class PhysicalBook implements Searchable {      //Physical book class
    private String title;
    private String shelfLocation;

    public PhysicalBook(String title, String shelfLocation) {
        this.title = title;
        this.shelfLocation = shelfLocation;
    }

    @Override
    public void search(String keyword) {
        if (title.toLowerCase().contains(keyword.toLowerCase())) {
            System.out.println("Physical book found on shelf " + shelfLocation + ": " + title);
        } else {
            System.out.println("No matching physical book title for keyword: " + keyword);
        }
    }
}

public class Library_SYS {      //main class
    public static void main(String[] args) {
        Searchable ebook = new EBook("Python Basics", "This is content.");
        Searchable physicalBook = new PhysicalBook("Python Programming", "102");

        ebook.search("interface");
        physicalBook.search("java");
    }
}
