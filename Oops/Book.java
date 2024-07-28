class Book {
   //book class for the library system mate  isbn which is hte author id or the number identify unique id 
   static int totalBooks;
   //inititally it i s i zero mate 
    String title;
    String author;
    String isbn;
    boolean isBorrowed;
    //borrow si sboorrowed or not mate 
    //properties are at  first then comse the mtehod  then comes constructor then comes the method 
    //it slike static method  keep it with class not with every other book 
//    {
//     totalBooks++;
//    }
//borrow the bookea dn the return book 
static{
    System.out.println("int the static class ");
    totalBooks=0;
    //when the class is  loaded totlanoof books iss zero at the starting mate 
}
//for every object book is created 
{
    //in sthte static iti is is in the code block mate we use iuti t Object Init when object is icreated 
    System.out.println("In the code block or inti class mate ");
    totalBooks++;
    //when the object is created then total book incremented by 1 mate
}
Book(String isbn,String title,String author)

{
    
  this.title=title;
    this.author=author;
    this.isbn=isbn;
}


//default values 
Book(String isbn){
    //isbn is is compulsory mate 
    //isbn is  innedded mate so been doing it it needs isbn to be givbe author and other u can give altetr 
    this(isbn,"Unknown","Unknown");
//which i si compulsory rryt u take it ia is s ia same thing id,"default","defalutl amte "
}
 public static int getTotalNoOfBooks(){
    //it can be accessecd by the class name also 
    return totalBooks;
    //thiss i si the static ariabale 
    //thsisi sis the sttic methdo which retrurn s u the toalt numbe rof  books matw n 
 }
 void borrowBook(){
    if(isBorrowed) {
        System.out.println("Book is is already borrowed mate ");
    }
    else{
    this.isBorrowed=true;
    System.out.println("enjoy the book mate "+this.title);
    }
 }
 void returnBook()
 {
    //then tot oreturn the booke 
    if(isBorrowed) {
//ok if book is borrowed then unborrow aor rreset toto false mate 
this.isBorrowed=false;
System.out.println("Hope you enjoeyd please leave a review mate thank you so much ");
    }
    else{
        System.out.println("this is book is salreday in the librayry u didnt borrow iin the library mate ");
    }
 }
 public static void main(String[] args) {
    Book designOfThings=new Book("1","Desingn","Author");

    Book designOfTheme=new Book("1");
    designOfThings.borrowBook();
    designOfTheme.borrowBook();
    designOfThings.borrowBook();
    designOfThings.returnBook();
    designOfThings.returnBook();
    //eevrythign every bhaviour is fdone mate 
    //the book is is alreadya it show s u 
    //now ohe return mate 
   // designOfThings.returnBook();
    //now ow ur enejoying the book amte 
    //the book is boorrowed 
    //now ow u will get toal mate 
    //thsis os i usesd for constructing default method mate 
    //book is  screated 
    System.out.println(Book.getTotalNoOfBooks());
    System.out.println(Book.totalBooks);
    System.out.println(designOfThings.getTotalNoOfBooks());
    //thsis is i also poosisble better is s for sttic use it by static method mate 
    //yes both is is iposisble mate because it is i si the staitc method 
    //one u will get as static is accessed by class not object been created here 
    //its posisble u can give enaything here 
 }

}
