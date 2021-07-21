package org.example.hexagone.domain.services;

import org.example.hexagone.domain.repo.BooksRepository;

public class BooksServiceFactory {
    public static BooksService getBooksService(BooksRepository booksRepository) {
        return new BooksServiceImpl(booksRepository);
    }
}
