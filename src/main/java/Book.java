public class Book {
    private String bookName, authorName, coverType, language;
    private int category, totalPages, yearOfPublished;

    public Book(String bookName, String authorName, String coverType, String language) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.coverType = coverType;
        this.language = language;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getYearOfPublished() {
        return yearOfPublished;
    }

    public void setYearOfPublished(int yearOfPublished) {
        this.yearOfPublished = yearOfPublished;
    }

    public void printBook() {
        System.out.println("Book name: " + bookName + "\n" + "Author name: " + authorName + "\n" + "Cover Type: " + coverType + "\n" + "Language: " + language+"\n");
    }


}
