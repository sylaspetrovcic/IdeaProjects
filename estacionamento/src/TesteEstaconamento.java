 class Main {
    public static void main(String[] args) {
        // Criando instâncias de Carro e Moto
        Carro carro = new Carro("ABC1234");
        Moto moto = new Moto("DEF5678");

        // Criando uma instância de Estacionamento
        Estacionamento estacionamento = new Estacionamento();

        // Estacionando veículos
        estacionamento.estacionar(carro);
        estacionamento.estacionar(moto);

        // Verificando a ocupação do estacionamento
        System.out.println("Ocupação do estacionamento: " + estacionamento.ocupacao());

        // Saindo com um veículo do estacionamento
        Veiculo veiculoRemovido = estacionamento.sairDoEstacionamento("ABC1234");
        if (veiculoRemovido != null) {
            System.out.println("Veículo removido: " + veiculoRemovido.placa);
        } else {
            System.out.println("Veículo não encontrado ou não estava estacionado.");
        }

        // Verificando se um veículo está estacionado pela placa
        boolean veiculoEstacionado = estacionamento.ConsultarVeiculo("DEF5678");
        System.out.println("Moto está estacionada? " + veiculoEstacionado);

        // Verificando novamente a ocupação do estacionamento
        System.out.println("Ocupação do estacionamento após saída: " + estacionamento.ocupacao());


    }
}
