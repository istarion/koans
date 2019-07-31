// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> = customers
        .map { Pair(it, it.orders.partition { order -> order.isDelivered }) }
        .filter { it.second.second.size > it.second.first.size }
        .map { it.first }
        .toSet()
