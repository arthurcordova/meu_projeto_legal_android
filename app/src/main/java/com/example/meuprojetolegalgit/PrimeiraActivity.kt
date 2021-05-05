package com.example.meuprojetolegalgit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuprojetolegalgit.oo_animal.*
import com.example.meuprojetolegalgit.oo_cor.Amarelo
import com.example.meuprojetolegalgit.oo_cor.Azul
import com.example.meuprojetolegalgit.oo_cor.Branco
import com.example.meuprojetolegalgit.oo_cor.Cor
import com.example.meuprojetolegalgit.oo_pessoa.Homem
import com.example.meuprojetolegalgit.oo_pessoa.Mulher
import com.example.meuprojetolegalgit.oo_pessoa.Pessoa
import com.example.meuprojetolegalgit.oo_produto.Categoria
import com.example.meuprojetolegalgit.oo_produto.Produto

class PrimeiraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primeira)

        val corAmarelo = Amarelo(nome = "amarelo claro")
        val corAzul = Azul(nome = "azul escuro")

        pintar(corAmarelo)
        pintar(corAzul)

        val cachorro = Cachorro("Meu cachorro", "pug", "curto")
        val gato = Gato("Meu gato")
        val cavalo = Cavalo("Meu cavalo")

        val passarinho = Passarinho("Pardal")

        levarAoPetShop(cachorro)
        levarAoPetShop(gato)
        levarAoPetShop(cavalo)


        Amarelo("amarelo claro").apply {
            val homem = Homem(cachorro, this)
            val mulher = Mulher(passarinho, this)
            pintar(this)
        }

        Homem(cachorro, corAmarelo).apply {
            meDigaQualOSexo(this)
            meDigaQualOSeuAnimalDeEstimacao(this)
        }
        Mulher(passarinho, corAmarelo).apply {
            meDigaQualOSexo(this)
            meDigaQualOSeuAnimalDeEstimacao(this)
        }


        val categoria = Categoria(1, "roupas")
        val produto = Produto("Camiseta", categoria)

    }

    fun pintar(cor: Cor) {
        println("Estou uma objeto com a cor: ${cor.nome}")

    }

    fun levarAoPetShop(animal: Animal) {
        println("Levando o(a) ${animal.nome} ")
    }

    fun meDigaQualOSexo(pessoa: Pessoa) {
        println("O sexo é ${pessoa.sexo} ")
    }

    fun meDigaQualOSeuAnimalDeEstimacao(pessoa: Pessoa) {
        println("Seu animal é ${pessoa.animal.nome} ")
    }


}