public static void main(String[] args) {
    Phone phone1 = new Phone("123-456-7890", "iPhone 13", 150.0);
    Phone phone2 = new Phone("987-654-3210", "Samsung Galaxy S23",100.0);
    Phone phone3 = new Phone();

    System.out.println("Phone 1: Number - " + phone1.getNumberBean() + ", Model - " + phone1.getModelBean() + ", Weight - " + phone1.getWeightBean());
    System.out.println("Phone 2: Number - " + phone2.getNumberBean() + ", Model - " + phone2.getModelBean() + ", Weight - " + phone2.getWeightBean());
    System.out.println("Phone 3: Number - " + phone3.getNumberBean() + ", Model - " + phone3.getModelBean() + ", Weight - " + phone3.getWeightBean());

    phone1.receiveCall("Иван");
    phone2.receiveCall("Петр", "555-123-4567");
    phone3.receiveCall("Сидор");

    System.out.println("Phone Number 1: " + phone1.getNumber());

    phone1.sendMessage("111-222-3333", "444-555-6666", "777-888-9999");


    Reader[] readers = new Reader[3];
    readers[0] = new Reader("Иванов И. И.", 12345, "ФизМат", LocalDate.of(2000, 5, 10), "555-1234");
    readers[1] = new Reader("Петров П. П.", 67890, "ХимФак", LocalDate.of(1999, 8, 20), "555-5678");
    readers[2] = new Reader("Сидорова А. А.", 24680, "БиоФак", LocalDate.of(2001, 1, 15), "555-9012");


    //takeBook
    readers[0].takeBook(3);
    readers[1].takeBook("Приключения", "Словарь", "Энциклопедия");

    Book book1 = new Book("Приключения", "Пушкин");
    Book book2 = new Book("Словарь", "Айвазовский");
    Book book3 = new Book("Энциклопедия", "Летучий");

    readers[2].takeBook(book1, book2, book3);


    // returnBook
    readers[0].returnBook(2);
    readers[1].returnBook("Приключения","Словарь");
    readers[2].returnBook(book1, book3);
}