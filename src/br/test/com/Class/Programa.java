package br.test.com.Class;

import br.test.com.Interface.Expiravel;

public class Programa {
    public void exibirDiasAteExpirar(Expiravel expiravel){
        System.out.println("Dias restantes : "
            +expiravel.calculaPeriododeExpiracao().getDays());
    }
}
