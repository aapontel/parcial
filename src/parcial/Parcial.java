/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author Usuario
 */
public class Parcial {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Segmento[] segmentos = new Segmento[2];
        segmentos[0] = new Segmento("2pm", "4pm");
        segmentos[1] = new Segmento("5pm", "7pm");
        Segmento[] segmentos2 = new Segmento[2];
        segmentos2[0] = new Segmento("10pm", "11pm");
        segmentos2[1] = new Segmento("11pm", "12pm");
        Dia[] Dias = new Dia[5];
        Dias[0] = new Dia("Lunes", "septiembre 3", 2, segmentos);
        Dias[1] = new Dia("Martes", "septiembre 4", 2, segmentos);
        Dias[2] = new Dia("Miercoles", "septiembre 5", 2, segmentos);
        Dias[3] = new Dia("Jueves", "septiembre 6", 2, segmentos);
        Dias[4] = new Dia("Viernes", "septiembre 7", 2, segmentos);
        Dia[] Dias2 = new Dia[5];
        Dias2[0] = new Dia("Lunes", "septiembre 10", 2, segmentos);
        Dias2[1] = new Dia("Martes", "septiembre 11", 2, segmentos);
        Dias2[2] = new Dia("Miercoles", "septiembre 12", 2, segmentos);
        Dias2[3] = new Dia("Jueves", "septiembre 13", 2, segmentos);
        Dias2[4] = new Dia("Viernes", "septiembre 14", 2, segmentos);
        Dia[] Dias3 = new Dia[5];
        Dias3[0] = new Dia("Lunes", "septiembre 3", 2, segmentos2);
        Dias3[1] = new Dia("Martes", "septiembre 4", 2, segmentos2);
        Dias3[2] = new Dia("Miercoles", "septiembre 5", 2, segmentos2);
        Dias3[3] = new Dia("Jueves", "septiembre 6", 2, segmentos2);
        Dias3[4] = new Dia("Viernes", "septiembre 7", 2, segmentos2);
        Dia[] Dias4 = new Dia[5];
        Dias4[0] = new Dia("Lunes", "septiembre 10", 2, segmentos2);
        Dias4[1] = new Dia("Martes", "septiembre 11", 2, segmentos2);
        Dias4[2] = new Dia("Miercoles", "septiembre 12", 2, segmentos2);
        Dias4[3] = new Dia("Jueves", "septiembre 13", 2, segmentos2);
        Dias4[4] = new Dia("Viernes", "septiembre 14", 2, segmentos2);
        Semana[] Semanas = new Semana[2];
        Semanas[0] = new Semana(1, Dias);
        Semanas[1] = new Semana(2, Dias2);
        Semana[] Semanas2 = new Semana[2];
        Semanas2[0] = new Semana(1, Dias3);
        Semanas2[1] = new Semana(2, Dias4);
        Sala[] Salas = new Sala[2];
        Salas[0] = new Sala(1, 2, Semanas);
        Salas[1] = new Sala(2, 2, Semanas2);
        
        Programacion pro = new Programacion(Salas,2);
        pro.imprimirProgramacion();
    
    }
    
}
