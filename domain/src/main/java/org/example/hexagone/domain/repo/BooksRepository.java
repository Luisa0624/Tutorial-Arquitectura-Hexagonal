package org.example.hexagone.domain.repo;

import org.example.hexagone.domain.data.Book;

import java.util.UUID;

public interface BooksRepository {
    void save(Book book);

    void delete(UUID id);
}
