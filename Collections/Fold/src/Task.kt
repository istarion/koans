// Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    return customers.fold(orderedProducts.toSet(), { acc, customer ->
        acc.intersect(customer.orders.flatMap { it.products }.toSet())
    })
}
