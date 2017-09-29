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
public class Sala {
    private int numero;
    private Semana[] semanas;
    private int numeroDeSemanas;

    public Sala(int numero,int numeroDeSemanas,Semana[] semanas) {
        this.numero = numero;
        this.numeroDeSemanas =numeroDeSemanas;
        semanas = new Semana[numeroDeSemanas];
        
    }
    public void imprimirSala(){
        System.out.println("sala numero :" +this.numero);
        for (int i=0;i<5;i++){
            this.semanas[i].imprimirSemana();
        }
    }
    
}
