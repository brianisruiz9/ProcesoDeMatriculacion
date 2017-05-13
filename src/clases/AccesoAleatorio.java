/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author BrianisRuiz
 */
public class AccesoAleatorio {

    private static RandomAccessFile flujo;
    private static int numeroRegistros;
    private static int tamañoRegistro = 80;

    public static void crearFileAlumno(File archivo) throws IOException {
        if (archivo.exists() && !archivo.isFile()) {
            throw new IOException(archivo.getName() + " no es un archivo");
        }
        flujo = new RandomAccessFile(archivo, "rw");
        numeroRegistros = (int) Math.ceil(
                (double) flujo.length() / (double) tamañoRegistro);
    }

    public static void cerrar() throws IOException {
        flujo.close();
    }

    public static boolean setPersona(int i, Persona persona) throws IOException {
        if (i >= 0 && i <= getNumeroRegistros()) {
            if (persona.getTamaño() > tamañoRegistro) {
                System.out.println("\nTamaño de registro excedido.");
            } else {
                flujo.seek(i * tamañoRegistro);
                flujo.writeInt(persona.getCodigo());
                flujo.writeUTF(persona.getPrimernomb());
                flujo.writeUTF(persona.getSegundonomb());
                flujo.writeUTF(persona.getPrimerape());
                flujo.writeUTF(persona.getSegundoape());
                flujo.writeUTF(persona.getDireccion());
                flujo.writeUTF(persona.getEmail());
                flujo.writeUTF(persona.getFnacimiento());
                flujo.writeUTF(persona.getSexo());
                flujo.writeUTF(persona.getCarrera());
                flujo.writeUTF(persona.getSemestre());
                flujo.writeInt(persona.getNiveling());
                flujo.writeUTF(persona.getHorario());
                flujo.writeBoolean(persona.isActivo());
                return true;
            }
        } else {
            System.out.println("\nNúmero de registro fuera de límites.");
        }
        return false;
    }

   private static int buscarRegistroInactivo() throws IOException {
        String nombre;
        for (int i = 0; i < getNumeroRegistros(); i++) {
            flujo.seek(i * tamañoRegistro);
            if (!getPersona(i).isActivo()) {
                return i;
            }
        }
        return -1;
    }

    public static void compactarArchivo(File archivo) throws IOException {
        crearFileAlumno(archivo); 
        Persona[] listado = new Persona[numeroRegistros];
        for (int i = 0; i < numeroRegistros; ++i) 
            listado[i] = getPersona(i);
        cerrar(); 
        archivo.delete(); 

        File tempo = new File("temporal.dat");
        crearFileAlumno(tempo); 
        for (Persona p : listado) 
            añadirPersona(p);
        cerrar();
        tempo.renameTo(archivo); 
    }

    public static void añadirPersona(Persona persona) throws IOException {
        int inactivo = buscarRegistroInactivo();
        if (setPersona(inactivo == -1 ? numeroRegistros : inactivo, persona)) {
            numeroRegistros++;
        }
    }

    public static int getNumeroRegistros() {
        return numeroRegistros;
    }

    public static Persona getPersona(int i) throws IOException {
        if (i >= 0 && i <= getNumeroRegistros()) {
            flujo.seek(i * tamañoRegistro);
            return new Persona(flujo.readInt(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readInt(),flujo.readUTF(),flujo.readBoolean());
        } else {
            System.out.println("\nNúmero de registro fuera de límites.");
            return null;
        }
    }

    public static int buscarRegistro(String buscado) throws IOException {
        Persona p;
        if (buscado == null) {
            return -1;
        }
        for (int i = 0; i < getNumeroRegistros(); i++) {
            flujo.seek(i * tamañoRegistro);
            p = getPersona(i);
            if (p.getPrimernomb().equals(buscado)&& p.isActivo()) {
                return i;
            }
        }
        return -1;
    }
}
