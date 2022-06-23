package NovaPasta.treino;

public class Book {
    private String title;
    private int pubYear;
    private String isbn;
    // ... completar
  public Book (String title, int pubYear) {
     this.title = title;
     this.pubYear = pubYear;
  }
  public Book (String title, int pubYear, String isbn) {
     this.title = title;
     this.pubYear = pubYear;
     this.isbn = isbn;
  }
  public Book (String title) {
      this.title = title;
  }
  public String getTitle () {return title;}
  public String getISBN () {return isbn;}
  public int getPubYear () {return pubYear;}
  public void setISBN(String isbn) {this.isbn = isbn;}

    @Override
    public String toString() {
        return "Book: " + title + ", " + pubYear + ", " + isbn + ";";
    }    
}
