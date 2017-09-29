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
public class Dia {
    private String fecha;
    private String nombre;
    private Segmento[] segmentos;
    private int cantidadDeSegmentos;

    public Dia(String fecha, String nombre,int cantidadDeSegmentos,Segmento[] segmentos) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.cantidadDeSegmentos = cantidadDeSegmentos;
        this.segmentos = new Segmento[cantidadDeSegmentos];
    }
    
    public void imprimirDia(){
        System.out.println(this.nombre+" "+this.fecha);
        for (int i=0;i<this.cantidadDeSegmentos;i++){
            this.segmentos[i].imprimirSegmento();
        }
        
    }
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Segmento[] getSegmentos() {
        return segmentos;
    }

    public void setSegmentos(Segmento[] segmentos) {
        this.segmentos = segmentos;
    }

    public int getCantidadDeSegmentos() {
        return cantidadDeSegmentos;
    }

    public void setCantidadDeSegmentos(int cantidadDeSegmentos) {
        this.cantidadDeSegmentos = cantidadDeSegmentos;
    }

    
    
    
}
