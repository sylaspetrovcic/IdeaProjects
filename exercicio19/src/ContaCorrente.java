class ContaCorrente {

        public String agencia;
        public int conta;
        public double saldo;
        public double getSaldo() {

            return this.saldo;
        }
        public String setSaldo(double valor) {
            if(valor >= 0) {
                this.saldo = valor;
                return "saldo atualizado";
            }
            else {
                return "saldo insuficiente";
            }
        }
    }

