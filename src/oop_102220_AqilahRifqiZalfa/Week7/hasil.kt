package oop_102220_AqilahRifqiZalfa.Week7

sealed class Hasil {
    data class Sukses(val data: String):Hasil()

    data class Error(val ex: Exception):Hasil()
    object loading:Hasil()

    fun handle_response(res:Hasil){
        when(res){
            is Sukses -> {
                println("Sukses lempar data")
            }
            is Error -> {
                println("Pesan error ${res.ex}")
            }
            loading -> {
                println("Sedang loading")
            }

        }
    }
}