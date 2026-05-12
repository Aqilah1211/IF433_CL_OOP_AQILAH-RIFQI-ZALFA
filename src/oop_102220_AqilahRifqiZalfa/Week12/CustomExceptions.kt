package oop_102220_AqilahRifqiZalfa.Week12

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")
