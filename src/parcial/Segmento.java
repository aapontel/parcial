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
public class Segmento {
    private String horaInicio;
    private String horaFin;

    public Segmento(String horaInicio, String horaFin) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }
    public void imprimirSegmento(){
        System.out.println("hora de inicio: "+this.horaInicio);
            System.out.println("hora fin: "+this.horaFin);
    }
    
    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }         
}
