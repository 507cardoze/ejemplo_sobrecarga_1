package com.anthony;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static class Persona {
        private String nombre;
        private String direccion;
        private Integer edad;

        public  String getNombre(){
            return nombre;
        }

        public void setNombre(String arg){
            nombre = arg;
        }

        public String getDireccion(){
            return direccion;
        }

        public void setDireccion(String arg){
            direccion = arg;
        }

        public Integer getEdad(){
            return edad;
        }

        public void setEdad(Integer arg){
            edad = arg;
        }

        public void loadData (String nombre, String direccion, Integer edad) {
            setNombre(nombre);
            setDireccion(direccion);
            setEdad(edad);
        }

    }

    static class Estudiante extends Persona {
        private Integer grado;
        private String escuela;

        public Integer getGrado(){
            return grado;
        }

        public void setGrado(Integer arg){
            grado = arg;
        }

        public  String getEscuela(){
            return escuela;
        }

        public void setEscuela(String arg){
            escuela = arg;
        }

        public Integer gradoSiguiente(){
            return getGrado() + 1;
        }

        public String preInscripcion(){

            String mensaje = "";

            mensaje += "------------------------------------------\n";
            mensaje += "Nombre del estudiante: " + getNombre() + "\n";
            mensaje += "Nombre del dirección: " + getDireccion() + "\n";
            mensaje += "Edad: " + getEdad() + "\n";
            mensaje += "Grado Actual: " + getGrado() + "\n";
            mensaje += "Escuela Actual: " + getEscuela() + "\n";
            mensaje += "Nombre del estudiante: " + getNombre() + "\n";
            mensaje += "------------------------------------------\n";
            mensaje += "Grado siguiente que debería cursar en 2023:\n";
            mensaje += "Grado Actual: " + gradoSiguiente();

            return mensaje;
        }


        public void loadData (String nombre, String direccion, Integer edad, Integer grado, String escuela) {
            loadData(nombre,  direccion,  edad);
            setGrado(grado);
            setEscuela(escuela);
        }
    }



    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader (isr);

        Estudiante estudiante;

        estudiante = new Estudiante();

        //datos de entrada

        System.out.print("Ingrese su nombre: ");

        String nombre = br.readLine();

        System.out.print("Ingrese su dirección: ");

        String direccion = br.readLine();

        System.out.print("Ingrese su edad: ");

        Integer edad = Integer.parseInt(br.readLine());

        System.out.print("Ingrese su grado actual: ");

        Integer grado = Integer.parseInt(br.readLine());

        System.out.print("Ingrese su escuela: ");

        String escuela = br.readLine();

        //proceso

        estudiante.loadData(nombre,direccion,edad,grado,escuela);

        //salida

        System.out.print(estudiante.preInscripcion());

    }
}



//        1. Cree una clase Persona con atributos privados (nombre, dirección y edad)
//        y otra Estudiante (Grado y Escuela). Cree un método que devuelva la
//        pre-inscripción con el grado siguiente que debería cursar en 2023.
//
//        2. Diseñe tres clases  Cir, Esfe, Cilinc con atributos protegidos:
//        ofrezca un menú que calcule el área de un círculo, esfera o de
//        un cilindro cerrado, Aplique herencia.