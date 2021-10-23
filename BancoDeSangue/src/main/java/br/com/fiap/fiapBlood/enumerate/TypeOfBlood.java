package br.com.fiap.fiapBlood.enumerate;

public enum TypeOfBlood {
    // P = Postivo N = Negativo
    AP(1),
    AN(2),
    BP(3),
    BN(4),
    OP(5),
    ON(6),
    ABP(7),
    ABN(8);

    private Integer cod;

    TypeOfBlood(Integer cod) {
        this.cod = cod;
    }

    public Integer getCod() {
        return cod;
    }

}
