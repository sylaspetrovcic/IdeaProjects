public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia,int mes, int ano){
        this.ano=ano;
        this.dia = dia;
        this.mes = mes;
    }
    public void displayData(){
        System.out.println(dia +"/" + mes+"/"+ano);
         }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
