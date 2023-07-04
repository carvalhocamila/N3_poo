public class Exames extends SQLClass{ 

    @Key
    int id;
    String descricao;
    double valor;    

    Exames(){
        this.setTableName("EXAMES");
    }   
        
    public void mostrarExame(){

        System.out.println("ID: " + id + " -- Nome do exame: " + descricao + " -- Valor do exame: " + valor);

    }
}
