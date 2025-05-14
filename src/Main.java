class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Мария", "Шарапова");

        Book book1 = new Book("Евгений Онегин", author1, 1833);
        Book book2 = new Book("Моя жизнь в теннисе", author2, 2017);

        String output = "Книга: " + book1.getTitle();
        output += ", Автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName();
        output += ", Год: " + book1.getPublicationYear();
        System.out.println(output);

        output = "Книга: " + book2.getTitle();
        output += ", Автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName();
        output += ", Год: " + book2.getPublicationYear();
        System.out.println(output);

        System.out.println(book2.getTitle() + " - год публикации: " + book2.getPublicationYear());
        book2.setPublicationYear(2018);
        System.out.println(book2.getTitle() + " - новый год публикации: " + book2.getPublicationYear());
    }
}