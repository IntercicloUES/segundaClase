/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundaclase;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class SegundaClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double nota, suma = 0, promedio;
         int j;
         
//         primeraNota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la primera nota"));
//         segundaNota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda nota"));
//         terceraNota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tercera nota"));
//         
//         promedio = (primeraNota + segundaNota + terceraNota) / 3;
//         
//         JOptionPane.showMessageDialog(null, "El promedio de notas es: " + promedio);


//            for(int i = 1; i < 10; i = i+2){
//                   System.out.println(i);
//            }
//
//            while(j<10){
//                System.out.println(j);
//                j++;
//            }

//                do{
//                    System.out.println(j);
//                    j++;
//                }while(j<10);

//               if(j == 11){
//                   JOptionPane.showMessageDialog(null, "Verdadero");
//               }else if(j == 12){
//                   JOptionPane.showMessageDialog(null, "Casi falso");
//               }else{
//                   JOptionPane.showMessageDialog(null, "Falso");
//               }

            int edad;
            String nombre;
            
            nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));
            
            if(edad > 18 || nombre.equals("Luis")){// || Entra si al menos una se cumple, && si ambas se cumplen
                JOptionPane.showMessageDialog(null, "Hola Luis");
//            }else if(edad > 18){
//                JOptionPane.showMessageDialog(null, "Mayor de edad");
//            }else if(edad < 18){
//                JOptionPane.showMessageDialog(null, "Menor de edad");
            }
            

            //for
            //while
            //do-while - Ejecuta el código al menos una vez SIEMPRE
         
    }
    
}
