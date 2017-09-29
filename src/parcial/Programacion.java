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
public class Programacion {
    
    private Sala[] salas  ;
    private int numeroDeSalas;
    public Programacion(Sala[] salas,int numeroDeSalas) {
      salas = new Sala[numeroDeSalas];
      this.numeroDeSalas =numeroDeSalas;
    }
    
    public void imprimirProgramacion(){
    System.out.println("PROGRAMACION :");
        for (int i=0;i<numeroDeSalas;i++){
            this.salas[i].imprimirSala();
            
        }    
    }

    public Sala[] getSalas() {
        return salas;
    }

    public void setSalas(Sala[] salas) {
        this.salas = salas;
    }

    public int getNumeroDeSalas() {
        return numeroDeSalas;
    }

    public void setNumeroDeSalas(int numeroDeSalas) {
        this.numeroDeSalas = numeroDeSalas;
    }
    
}
