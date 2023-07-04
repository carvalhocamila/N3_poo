public class Estoque extends SQLClass{  

    @Key
    int id;
    String remedio;
    double valor;
    double quantidade;

    Estoque(){
        this.setTableName("ESTOQUE");
    }

    public void mostrarEstoque(){

        System.out.println("ID: " + id + "-- Nome remédio: " + remedio + " --Quantidade no estoque: " + quantidade + " -- valor: " + valor);

    }
}
