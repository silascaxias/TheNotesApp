package com.example.thenotesapp.di

import com.example.thenotesapp.database.NoteDatabase
import com.example.thenotesapp.repository.NoteRepository
import com.example.thenotesapp.viewmodel.NoteViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

/**
 * AppModules
 * The Notes App
 *
 ** Created by Silas S. Caxias on 2/26/2025.
 *
 **/

val viewModelModule = module {
    viewModelOf(::NoteViewModel)
}

val databaseModule = module {
    single {
        NoteDatabase(androidContext())
    }
}

val repositoryModule = module {
     singleOf(::NoteRepository)
}