package com.Dnax.demo.repository.mongo;


import com.Dnax.demo.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
        path = "books",
        collectionResourceRel = "books",
        itemResourceRel = "book")
public interface BookRepository extends MongoRepository<Book, Integer> {
}
