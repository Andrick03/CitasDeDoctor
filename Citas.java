import java.util.ArrayList;
import java.util.Scanner;

//Operaciones Del Sistema
class SistemaDeHospital {
    //Todas la listas que se necesitan para el menu de doctores, pacientes, administradores y citas
    ArrayList<Long> doctorId = new ArrayList<Long>();
    ArrayList<String> doctorNombre = new ArrayList  <String>();
    ArrayList<String> doctorEspecialidad = new ArrayList<String>();


    ArrayList<Long> pacienteId = new ArrayList<Long>();
    ArrayList<String> pacienteNombre = new ArrayList<String>();

    //Usuario de administracion ya creado ya que no solo se puede crear uno
    String administradorId = "Admin123";
    String administradorPassword = "Password123";

    ArrayList<Long> citaId = new ArrayList<Long>();
    ArrayList<String> citaDoctor = new ArrayList<String>();
    ArrayList<String> citaPaciente = new ArrayList<String>();
    ArrayList<String> citaFecha = new ArrayList<String>();
    ArrayList<String> citaHora = new ArrayList<String>();
    ArrayList<String> citaMotivo = new ArrayList<String>();



    //Menu de doctores
    void doctor() throws Exception {
        Scanner scnr = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("¿Que desea hacer?");
            System.out.println("0. Ver Doctores  1. Registrarse 2. Salir");
            int seleccion = scnr.nextInt();

            switch (seleccion) {
                case 0:
                    if (doctorId.isEmpty()) {
                        System.out.println("No hay doctores registrados");
                        break;
                    } else {
                        for (int x = 0; x < doctorId.size(); x++) {
                            System.out.println(" Nombre: " + doctorNombre.get(x) + " ID: " + doctorId.get(x) + " Especialidad: " + doctorEspecialidad.get(x));
                        }
                        break;
                    }
                case 1:
                    System.out.println("Ingrese su nombre (EN VEZ DE ESPACIOS USE -)");
                    String nombre = scnr.next();
                    doctorNombre.add(nombre);
                    System.out.println("Ingrese su especialidad");
                    String especialidad = scnr.next();
                    doctorEspecialidad.add(especialidad);
                    System.out.println("Este es su ID de doctor");
                    long id = (long) (Math.random() * 1000000000);
                    doctorId.add(id);
                    System.out.println(id);
                    break;
                case 2:
                    flag=false;
                    break;

                default:
                    System.exit(0);

            }
        }
    }

    //Menu de pacientes
    void paciente() throws Exception {
        Scanner scnr = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("¿Que desea hacer?");
            System.out.println("0. Ver Pacientes  1. Registrarse 2. Salir");
            int seleccion = scnr.nextInt();

            switch (seleccion) {
                case 0:
                    if (pacienteId.isEmpty()) {
                        System.out.println("No hay pacientes registrados");
                        break;
                    } else {
                        for (int x = 0; x < pacienteId.size(); x++) {
                            System.out.println(" Nombre: " + pacienteNombre.get(x) + " ID: " + pacienteId.get(x));
                        }
                        break;
                    }
                case 1:
                    System.out.println("Ingrese su nombre (EN VEZ DE ESPACIOS USE -)");
                    String nombre = scnr.next();
                    pacienteNombre.add(nombre);
                    System.out.println("Este es su ID de paciente");
                    long id = (long) (Math.random() * 1000000000);
                    pacienteId.add(id);
                    System.out.println(id);
                    break;
                case 2:
                    flag=false;
                    break;

                default:
                    System.exit(0);

            }
        }
    }

    //Menu de administradores
    void administrador() throws Exception {
        Scanner scnr = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("¿Que desea hacer?");
            System.out.println("0. Iniciar sesion 1. Salir");
            int seleccion = scnr.nextInt();

            switch (seleccion) {
                case 0:
                    System.out.println("Ingrese su ID");
                    String id = scnr.next();
                    System.out.println("Ingrese su contraseña");
                    String password = scnr.next();
                    if (id.equals(administradorId) && password.equals(administradorPassword)){
                        System.out.println("Bienvenido administrador");
                        System.out.println("¿Que desea hacer?");
                        System.out.println("0. Ver doctores  1. Ver pacientes  2. Ver citas 3. Crear citas 4. Salir");
                        int seleccion2 = scnr.nextInt();
                        switch (seleccion2) {
                            case 0:
                                if (doctorId.isEmpty()) {
                                    System.out.println("No hay doctores registrados");
                                    break;
                                } else {
                                    for (int x = 0; x < doctorId.size(); x++) {
                                        System.out.println("ID: " + doctorId.get(x) + " Nombre: " + doctorNombre.get(x) + " Especialidad: " + doctorEspecialidad.get(x));
                                    }
                                    break;
                                }
                            case 1:
                                if (pacienteId.isEmpty()) {
                                    System.out.println("No hay pacientes registrados");
                                    break;
                                } else {
                                    for (int x = 0; x < pacienteId.size(); x++) {
                                        System.out.println("ID: " + pacienteId.get(x) + " Nombre: " + pacienteNombre.get(x));
                                    }
                                    break;
                                }
                            case 2:
                                if (citaId.isEmpty()) {
                                    System.out.println("No hay citas registradas");
                                    break;
                                } else {
                                    for (int x = 0; x < citaId.size(); x++) {
                                        System.out.println("ID: " + citaId.get(x) + " Doctor: " + citaDoctor.get(x) + " Paciente: " + citaPaciente.get(x) + " Fecha: " + citaFecha.get(x) + " Hora: " + citaHora.get(x) + " Motivo: " + citaMotivo.get(x));
                                    }
                                    break;
                                }
                            case 3:
                                System.out.println("Ingrese el nombre del paciente (EN VEZ DE ESPACIOS USE -)");
                                String nombre1 = scnr.next();
                                citaPaciente.add(nombre1);
                                System.out.println("Ingrese el nombre del doctor (EN VEZ DE ESPACIOS USE -)");
                                String nombre2 = scnr.next();
                                citaDoctor.add(nombre2);
                                System.out.println("Ingrese la fecha de la cita");
                                String fecha = scnr.next();
                                citaFecha.add(fecha);
                                System.out.println("Ingrese la hora de la cita");
                                String hora = scnr.next();
                                citaHora.add(hora);
                                System.out.println("Ingrese el motivo de la cita");
                                String motivo = scnr.next();
                                citaMotivo.add(motivo);
                                System.out.println("Este es su ID de cita");
                                long id1 = (long) (Math.random() * 1000000000);
                                citaId.add(id1);
                                System.out.println(id1);
                                break;

                            case 4:
                                flag=false;
                                break;
                            default:
                                System.exit(0);
                        }
                    } else {
                        System.out.println("ID o contraseña incorrectos");
                        break;

                    }
                    break;
                case 1:
                    flag=false;
                    break;

                default:
                    System.exit(0);

            }
        }
    }

}

//Menu Principal
class Inicio {
    public static void main (String[] args) throws Exception {
        SistemaDeHospital ap = new SistemaDeHospital();
        Scanner scnr = new Scanner(System.in);
        boolean flag = true;
        while (flag = true) {
            System.out.println("¿Que tipo de usuario eres?");
            System.out.println("0. Doctor  1. Paciente  2. Administrador");
            int seleccion = scnr.nextInt();

            switch (seleccion){
                case 0 : {ap.doctor(); break;}
                case 1 : {ap.paciente(); break;}
                case 2 : {ap.administrador(); break;}

                default : System.exit(0);

            }
        }
    }
}
