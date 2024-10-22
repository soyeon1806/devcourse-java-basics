class Book01{
    String title;
    String author;
    String price;

    Book01(String title, String author, String price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

public class Ex08_Array01 {
    public static void main(String[] args) {
        // 기본 자료형 배열
        int[] intArray = new int[3];
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;

        for(int data : intArray){
            System.out.println(data);
        }

        System.out.println();

        // 참조 자료형 배열
        Book01 book1 = new Book01("Java", "홍길동", "1000");
        Book01 book2 = new Book01("JSP", "박문수", "2000");
        Book01 book3 = new Book01("Spring", "이몽룡", "3000");

        Book01[] bookArray = new Book01[3];
        bookArray[0] = book1;
        bookArray[1] = book2;
        bookArray[2] = book3;

        System.out.println("권수 : " + bookArray.length);
        System.out.println(bookArray[0].title);
        System.out.println(bookArray[0].author);

        System.out.println();

        for(int i = 0; i < bookArray.length; i++){
            System.out.println(bookArray[i].title + " ");
            System.out.println(bookArray[i].author + " ");
            System.out.println(bookArray[i].price);
        }

        System.out.println();

        for(Book01 book : bookArray){
            System.out.println(book.title + " ");
            System.out.println(book.author + " ");
            System.out.println(book.price);
        }
        
    }
}
