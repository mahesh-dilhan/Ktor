package com.ilearn.ktor

import io.ktor.application.call
import io.ktor.response.respond
import io.ktor.routing.Route
import io.ktor.routing.get
import org.kodein.di.instance
import org.kodein.di.ktor.di

fun Route.findBooks() {
    val bookService by di().instance<BookService>()
    get("findBooks") {
        val books = bookService.getAllBooks()
        call.respond(books)
    }
}

