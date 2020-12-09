package com.ilearn.ktor

class BookService {

    fun getAllBooks(): Iterable<Book>  {
        val books: MutableCollection<Book> = mutableListOf<Book>(Book(1,"Harry","JK"))
        return books
    }
}