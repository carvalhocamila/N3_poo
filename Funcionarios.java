public class Funcionarios extends SQLClass{

    Funcionarios(){
        this.setTableName("FUNCIONARIOS");
    };
    
    @Key
    int id;
    String nome;
    String cargo;

    public void mostrarFuncionarios(){

        System.out.println("ID: " + id + " -- Nome do funcionário: " + nome + " -- O cargo: " + cargo);
    }
}
