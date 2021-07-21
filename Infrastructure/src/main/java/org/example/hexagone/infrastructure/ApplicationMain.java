package org.example.hexagone.infrastructure;

import org.example.hexagonal.application.ConsoleApp;
import org.example.hexagone.domain.services.BooksService;
import org.example.hexagone.domain.services.BooksServiceFactory;

public class ApplicationMain {
    public static void main(String[] args) {
        BooksService booksService = BooksServiceFactory.getBooksService(new BooksRepositoryImpl());
        ConsoleApp consoleApp = new ConsoleApp(System.console(), booksService);
        consoleApp.waitForCommand();
    }


}
