public enum Tabela {
    MAGREZA(18), NORMAL(24), SOBREPESO(29), GRAU_I(34),
    GRAU_II(39),GRAU_IIi(40);
    private int imc1;
    Tabela(int imc){
        this.imc1 = imc;
    }

    public int getImc(int imc1) {
        return this.imc1;
    }

}

