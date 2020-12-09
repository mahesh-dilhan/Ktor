package com.ilearn.ktor

import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.singleton

fun DI.MainBuilder.bindBookService(){
    bind<BookService>() with singleton { BookService() }
}