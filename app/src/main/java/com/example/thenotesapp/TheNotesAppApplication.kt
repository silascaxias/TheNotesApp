package com.example.thenotesapp

import android.app.Application
import com.example.thenotesapp.di.databaseModule
import com.example.thenotesapp.di.repositoryModule
import com.example.thenotesapp.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

/**
 * TheNotesAppApplication
 * The Notes App
 *
 ** Created by Silas S. Caxias on 2/26/2025.
 *
 **/

class TheNotesAppApplication: Application() {
	override fun onCreate() {
		super.onCreate()

		startKoin {
			androidLogger()
			androidContext(this@TheNotesAppApplication)
			modules(databaseModule, repositoryModule, viewModelModule)
		}
	}
}