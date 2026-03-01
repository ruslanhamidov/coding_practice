class Book {
   String title;
   boolean borrowed;
   
   public Book(String bookTitle) {
      // Constructor method(we will do it together)
   }
   
   void borrowed() {
      // What should happen when book is borrowed?
   }
   
   void returned() {
      // Reverse the borrow process      
   }
   
   boolean isBorrowed() {
      // Check if book is borrowed or not
      return false;
   }
   
   String getTitle() {
      // Return title of the book
      return "a";
   }
}

class BookTestDrive {
   public static void main(String[] args) {
      // To test book first create Book object
      System.out.print("hello");
      // Test methods of Book object that you created 
   }
}