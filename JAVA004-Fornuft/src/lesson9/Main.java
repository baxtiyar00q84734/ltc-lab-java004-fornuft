package lesson9;

public class Main {
    public static void main(String[] args) {
        Author author1=new Author("Elxan Elatlı",1962);
        Author author2=new Author("Attilâ İlhan",1925);
        Book book1=new Book("Ben Sana Mecburum",author2,1966);
        Book book2=new Book("Niyə Susursan, Polkovnik?",author1,2014);
        Book book3=new Book("Bakıdan Gələn Xəfiyyə",author1,2011);

        book1.setPublicationYear(1960);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
