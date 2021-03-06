/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zumo;

/**
 *
 * @author Michael
 * main del zumo
 */
public class Main {
    public static void main(String[] args) {

        acciones_Zumo(0.0);
    }
    
    /**
     * @author MICHAEL
     * @param peso devuelve el peso del zumo para posteriormente saber el precio 
     */

    public static void acciones_Zumo(double peso) {
        Zumo depositoPomelo;
        int relleno;
        /*Creación de un depósito con zumo de pomelo, inicialmente contiene 20 litros, su capacidad máxima es de 40 litros
        el precio del litro es 2€*/
        depositoPomelo= new Zumo(20,2,"Pomelo",40);
        
        try {
            System.out.println("Vamos a tomar zumo");
            depositoPomelo.sacarZumo(5, 20);//Se intentan comprar 5 litros de zumo con 20€
        } catch (Exception e) {
            System.out.println("Error al sacar zumo");
        }
        try {
            System.out.println("Rellenando depósito");
            depositoPomelo.rellenar(30);//Se intenta rellenar el deposito añadiendo 30 litros
        } catch (Exception e) {
            System.out.println("Fallo al rellenar el depósito");
        }
        relleno = depositoPomelo.obtenerLitros();
        System.out.println("El depósito contiene " + relleno + " litros");
    }
}
