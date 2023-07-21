package com.example.firstkotlinapp.services

import com.example.firstkotlinapp.constants.Consts
import java.time.LocalDate
import java.time.Period

class AgeServices {
    fun calculateAge(): String? {
        val birthDate = LocalDate.parse("1997-05-17")
        var sysDate = LocalDate.now()
        var age = Period.between(birthDate, sysDate)

        return "${age.years} yrs\n${age.months} months\n${age.days} days"
    }
}