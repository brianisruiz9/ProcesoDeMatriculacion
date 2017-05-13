/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author BrianisRuiz
 */
public class Idioma {
    
    public static void español(JLabel label[], JButton boton[], JCheckBox check[], JRadioButton radio[]) {
        String l[] = {"PROCESO DE MATRICULACIÓN","Codigo:", "Primer Nombre:", "Segundo Nombre:", "Primer Apellido:", "Segundo Apellido:", "Dirección:", "Email:", "Fecha de nacimiento:",
            "Sexo:", "Carrera:", "Semestre:", "Nivel de Ingles:", "Horario Deseado:", "Archivo:", "Tipo de Acceso:","Color de Letra:", "Color TextField:", "Idioma:","Datos Personales","Datos Académicos","Parámetros"};
        String b[] = {"Almacenar", "Cancelar", "Resetear", "Establecer","Ver Persona"};
        String c[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        String r[] = {"Masculino", "Femenino", "Otro"};

        for (int i = 0; i < label.length; i++) {
            for (int j = 0; j < l.length; j++) {
                label[i].setText(l[i]);
            }
        }
        for (int i = 0; i < boton.length; i++) {
            for (int j = 0; j < b.length; j++) {
                boton[i].setText(b[i]);
            }

        }
        for (int i = 0; i < check.length; i++) {
            for (int j = 0; j < c.length; j++) {
                check[i].setText(c[i]);
            }

        }
        for (int i = 0; i < radio.length; i++) {
            for (int j = 0; j < r.length; j++) {
                radio[i].setText(r[i]);
            }

        }
    }
    
    public static void ingles(JLabel label[], JButton boton[], JCheckBox check[], JRadioButton radio[]) {
        String lIngles[] = {"REGISTRATION PROCESS", "Code:", "First Name:", "Second Name:", "First Surname:", "Second Surname:", "Address:", "Email:","Date of Birth:", "Gender:",
            "Career:", "Semester:", "English level:", "Desired Schedule:","File:", "Access Type:", "Color Text:", "Color TextField:", "Language:","Personal Information","Academic data","Parameters"};
        String bIngles[] = {"  Store  ", "Cancel", "  Reset  ", "Establish","View Person"};
        String checkIngles[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String radioI[] = {"Male", "Female", "Other"};

        for (int i = 0; i < label.length; i++) {
            for (int j = 0; j < lIngles.length; j++) {
                label[i].setText(lIngles[i]);
            }
        }
        for (int i = 0; i < boton.length; i++) {
            for (int j = 0; j < bIngles.length; j++) {
                boton[i].setText(bIngles[i]);
            }

        }
        for (int i = 0; i < check.length; i++) {
            for (int j = 0; j < checkIngles.length; j++) {
                check[i].setText(checkIngles[i]);
            }

        }
        for (int i = 0; i < radio.length; i++) {
            for (int j = 0; j < radioI.length; j++) {
                radio[i].setText(radioI[i]);
            }
        }

    }
}
