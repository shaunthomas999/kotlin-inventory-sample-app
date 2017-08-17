package com.shaunthomas999.inventory

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Product(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Int,
        var name: String,
        var manufacturer: String,
        var manufacturingDate: Date,
        var expiryDate: Date,
        var stock: Int,
        var safetyStock: Int)