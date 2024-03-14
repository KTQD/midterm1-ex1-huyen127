public class Main {
    public static void main(String[] args) {
        MP3 mp3 = new MP3("MP3", "Portable music player", "MP123", 50.00f, "3 hours");
        mp3.showInfo();

        Book book = new Book("Java", "OOP with Java", "OOP1", 25.1f, "John Smith", 320, "learning");
        book.showInfo();
    }
}
