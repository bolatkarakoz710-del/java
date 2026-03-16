class Library {

    class Book {
        String title;

        Book(String title) {
            this.title = title;
        }

        void show() {
            System.out.println("Book title: " + title);
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();
        Library.Book book = lib.new Book("Java Programming");
        book.show();
    }
}

