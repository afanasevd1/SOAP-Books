//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.02 at 03:36:56 PM MSK 
//


package com.mysoapwebservice.books;

import com.my.soap.web.service.soap.bean.Book;

import javax.xml.bind.annotation.XmlRegistry;
import java.util.List;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.mysoapwebservice.books package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mysoapwebservice.books
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBookDetailsRequest }
     */
    public GetBookDetailsRequest createGetBookDetailsRequest() {
        return new GetBookDetailsRequest();
    }

    /**
     * Create an instance of {@link GetBookDetailsResponse }
     */
    public GetBookDetailsResponse createGetBookDetailsResponse(BookDetails bookDetails) {
        return new GetBookDetailsResponse(bookDetails);
    }

    /**
     * Create an instance of {@link BookDetails }
     */
    public BookDetails createBookDetails(Book book) {
        return new BookDetails(book);
    }

    /**
     * Create an instance of {@link GetAllBooksDetailsRequest }
     */
    public GetAllBooksDetailsRequest createGetAllBooksDetailsRequest() {
        return new GetAllBooksDetailsRequest();
    }

    /**
     * Create an instance of {@link GetAllBooksDetailsResponse }
     */
    public GetAllBooksDetailsResponse createGetAllBooksDetailsResponse(List<BookDetails> bookDetailsList) {

        return new GetAllBooksDetailsResponse(bookDetailsList);
    }
}
