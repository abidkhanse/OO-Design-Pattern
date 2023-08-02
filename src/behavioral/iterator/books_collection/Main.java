package src.behavioral.iterator.books_collection;

public class Main {

    public static void main(String[] args) {

        Book oop_in_kotlin = new Book("Object Oriented Programming in Kotlin","Abid Khan");
        Book into_to_java = new Book("Introduction to Java","Herbert Schildt");
        Book into_to_algorithm = new Book("Introduction to Algorithm"," Thomas H Cormen");

        Library library = new Library();
        library.add(oop_in_kotlin);
        library.add(into_to_java);
        library.add(into_to_algorithm);

        IBookIterator iterator = library.getIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.Next().toString());
        }

    }
}
