package oop.assigment_problems;

class BooksInventory{
    String name;
    String author;
    int copiesAvailable;
    BooksInventory(String name,String author,int copiesAvailable){
        this.name=name;
        this.author=author;
        this.copiesAvailable=copiesAvailable;
    }
    void printEntry(){
        System.out.println(name+" by "+ author+" - "+copiesAvailable+ " copies available.");
    }
}


public class LibraryInventory {
    public static void main(String[]args){
        BooksInventory b1=new BooksInventory("Clean Code", "Robert C. Martin", 3);
        BooksInventory b2=new BooksInventory("Effective Java", "Joshua Bloch", 5);
        BooksInventory b3=new BooksInventory("Refactoring","Martin Fowler",0);
        BooksInventory b4=new BooksInventory("Design Patterns","GoF",2);
        b1.printEntry();
        b2.printEntry();
        b3.printEntry();
        b4.printEntry();
    }
}
