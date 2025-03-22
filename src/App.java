public class App {
    public static void main(String[] args) throws Exception {

        Hospital hospital = new Hospital("Hospital");

        Medico medico = new Medico("Gebas", "1234", "fisioterapia");

        Paciente paciente1 = new Paciente("Letícia", "12345678987");
        Paciente paciente2 = new Paciente("Khris", "98765432105");




        hospital.adicionarLeito(10);
        hospital.listarLeitos();

        medico.adicionarPaciente(paciente2);
        medico.adicionarPaciente(paciente1);
        medico.listarPacientes();

        
       
        
       


    }
}

