package ExercicioDois;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();


        funcionario1.setNome("Laura");
        funcionario1.setDataAdmissao("02/01/2023");
        funcionario1.setSalario(1500);

        funcionario1.mostrarInfos();

        funcionario2.setNome("Osvaldo");
        funcionario2.setDataAdmissao("02/01/2023");
        funcionario2.setSalario(1000);

        funcionario2.mostrarInfos();

        funcionario3.setNome("Stuart Little");
        funcionario3.setDataAdmissao("02/01/2023");
        funcionario3.setSalario(1200);

        funcionario3.mostrarInfos();


    }
}
