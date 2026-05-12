package oop_102220_AqilahRifqiZalfa.Week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) {
        throw DispenserJamException()
    }
    return if (requestedGram > availableGram) availableGram else requestedGram
}
