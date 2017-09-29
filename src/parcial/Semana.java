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
public class Semana {
   private int numero;
   private Dia[] dias;
   

    public Semana(int numero,Dia[] dias) {
        this.numero = numero;
        this.dias = new Dia[5];
    }
    public void imprimirSemana(){
        System.out.println("semana numero :" +this.numero);
        for (int i=0;i<5;i++){
            this.dias[i].imprimirDia();
        }
    }
}
