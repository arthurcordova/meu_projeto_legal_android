package com.example.meuprojetolegalgit.oo_pessoa

import com.example.meuprojetolegalgit.oo_animal.Animal
import com.example.meuprojetolegalgit.oo_cor.Cor

open class Pessoa(
        open val sexo: String,
        open val animal: Animal,
        open val cor: Cor
)