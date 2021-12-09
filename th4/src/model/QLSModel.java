
package model;
import java.io.Serializable;


public class QLSModel implements Serializable{
    
    BookModel book;
    ReaderModel reader;
    int amount;
    String status;

    public QLSModel(BookModel book, ReaderModel reader, int amount, String status) {
        this.book = book;
        this.reader = reader;
        this.amount = amount;
        this.status = status;
    }

    public BookModel getBook() {
        return book;
    }

    public void setBook(BookModel book) {
        this.book = book;
    }

    public ReaderModel getReader() {
        return reader;
    }

    public void setReader(ReaderModel reader) {
        this.reader = reader;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getIdAndName() {
        return getReader().getId() + " " + getReader().getName();
    }
    
     public Object[] toObjects(){
        return new Object[]{
            getReader().getId(), getReader().getName(),
            getBook().getMa(), getBook().getTen(),
            getAmount(), getStatus()
        };
    }
}
