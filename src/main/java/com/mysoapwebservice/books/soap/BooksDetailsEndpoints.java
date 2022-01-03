package com.mysoapwebservice.books.soap;

import com.mysoapwebservice.books.BookDetails;
import com.mysoapwebservice.books.DeleteBookDetailsRequest;
import com.mysoapwebservice.books.DeleteBookDetailsResponse;
import com.mysoapwebservice.books.GetAllBooksDetailsRequest;
import com.mysoapwebservice.books.GetAllBooksDetailsResponse;
import com.mysoapwebservice.books.GetBookDetailsRequest;
import com.mysoapwebservice.books.GetBookDetailsResponse;
import com.mysoapwebservice.books.soap.bean.Book;
import com.mysoapwebservice.books.soap.services.BookDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.ArrayList;
import java.util.List;

@Endpoint
public class BooksDetailsEndpoints {

    @Autowired
    BookDetailsService service;

    @PayloadRoot(namespace = "http://mySoapWebService.com/books", localPart = "GetBookDetailsRequest")
    @ResponsePayload
    public GetBookDetailsResponse processBookDetailsRequest(@RequestPayload GetBookDetailsRequest request) {
        return mapOneBookToResponse(service.findById(request.getId()));
    }

    @PayloadRoot(namespace = "http://mySoapWebService.com/books", localPart = "GetAllBooksDetailsRequest")
    @ResponsePayload
    public GetAllBooksDetailsResponse processAllBookDetailsRequest(@RequestPayload GetAllBooksDetailsRequest request) {
        return mapAllBooksToResponse(service.findAll());
    }

    @PayloadRoot(namespace = "http://mySoapWebService.com/books", localPart = "DeleteBookDetailsRequest")
    @ResponsePayload
    public DeleteBookDetailsResponse processAllBookDetailsRequest(@RequestPayload DeleteBookDetailsRequest request) {
        return new DeleteBookDetailsResponse(service.deleteById(request.getId()));
    }

    private GetAllBooksDetailsResponse mapAllBooksToResponse(List<Book> bookList) {
        List<BookDetails> bookDetails = new ArrayList<>();
        for (Book book : bookList)
            bookDetails.add(mapBookToBookDetails(book));
        return new GetAllBooksDetailsResponse(bookDetails);
    }

    private GetBookDetailsResponse mapOneBookToResponse(Book book) {
        return new GetBookDetailsResponse(mapBookToBookDetails(book));
    }

    private BookDetails mapBookToBookDetails(Book book) {
        return new BookDetails(book);
    }
}
