package com.shaunthomas999.inventory

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Product(
        @Id var id: Int,
        var name: String,
        var manufacturer: String,
        var manufacturingDate: Date,
        var stock: Int,
        var safetyStock: Int)