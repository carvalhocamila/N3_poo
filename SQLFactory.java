public class SQLFactory{
    public static void main(String[] args){
    
//EXAMES NO BANCO DE DADOS
        Exames exame1 = new Exames();

        exame1.id = 1;
        exame1.descricao = "Raio - X";
        exame1.valor = 250;
        
        boolean inserirExame = Database.inserirRegistro(exame1);
        exame1.mostrarExame();


//ESTOQUE NO BANCO DE DADOS
        Estoque estoque1 = new Estoque();

        estoque1.id = 1;
        estoque1.remedio = "oxitetraciclina";
        estoque1.valor = 60;
        estoque1.quantidade = 5;


        boolean inserirEstoque = Database.inserirRegistro(estoque1);
        estoque1.mostrarEstoque();


//FUNCIONARIOS NO BANCO DE DADOS
        Funcionarios funcionarios1 = new Funcionarios();

        funcionarios1.id = 1;
        funcionarios1.nome = "Larissa";
        funcionarios1.cargo = "Cirurgiã";

        boolean inserirFuncionarios = Database.inserirRegistro(funcionarios1);
        funcionarios1.mostrarFuncionarios();


        funcionarios1.id = 2;
        funcionarios1.nome = "Eduardo";
        funcionarios1.cargo = "atendente";

        boolean inserirFuncionarios2 = Database.inserirRegistro(funcionarios1);
        funcionarios1.mostrarFuncionarios();


        funcionarios1.id = 3;
        funcionarios1.nome = "Luiz";
        funcionarios1.cargo = "atendente";

        boolean inserirFuncionarios3 = Database.inserirRegistro(funcionarios1);
        funcionarios1.mostrarFuncionarios();    


        funcionarios1.id = 2;
        funcionarios1.nome = "Eduardo";
        funcionarios1.cargo = "veterinario";

        boolean atualizarFuncionarios3 = Database.atualizarRegistro(funcionarios1);
        funcionarios1.mostrarFuncionarios();


        funcionarios1.id = 1;

        boolean deletarFuncionarios1 = Database.deletarRegistro(funcionarios1);
        funcionarios1.mostrarFuncionarios();
    }
}