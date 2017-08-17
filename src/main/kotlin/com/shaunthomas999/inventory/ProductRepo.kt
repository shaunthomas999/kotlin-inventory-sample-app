package com.shaunthomas999.inventory

import org.springframework.data.repository.CrudRepository

interface ProductRepo : CrudRepository<Product, Int>