package basics.oops.lvl5;
import java.util.*;

//Library management(MINI OOP PROJECT) using array
class Book{
    int id;
    String title;
    String author;

    Book(int id,String title,String author){
        this.id=id;
        this.title=title;
        this.author=author;

    }
    public void showBook(){
        System.out.println("id: "+id+"title : "+title+"Author : "+author);
    }

}
class Library{
    Book[] books = new Book[100];
    int count = 0;

    void addBook(Book b){
        books[count]= b;
        count++;
        System.out.println("Book Added: "+b.title);
    }
    void showAllBooks(){
        if(count==0){
            System.out.println("No books....");
            return;
        }
        System.out.println("Books In Library: ");
        for(int i=0;i<count;i++){
            books[i].showBook();
        }
    }
    void searchByTitle(String t){
        boolean found=false;
        for(int i = 0;i<count;i++){
            if(books[i].title.equalsIgnoreCase(t)){
                System.out.println("Found");
                books[i].showBook();
                found=true;
            }
            if(!found){
                System.out.println("Book not found....");
                return;
            }
        }
    }

}
public class prblm13 {
}
