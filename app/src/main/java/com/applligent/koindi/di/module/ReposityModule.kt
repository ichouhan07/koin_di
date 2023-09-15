package com.applligent.koindi.di.module

import com.applligent.koindi.data.repository.MainRepository
import org.koin.dsl.module

val repoModule = module {
    single {
        MainRepository(get())
    }
}