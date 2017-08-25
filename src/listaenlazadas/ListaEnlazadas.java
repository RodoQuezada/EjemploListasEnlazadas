/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenlazadas;
import javax.swing.JOptionPane;
public class ListaEnlazadas {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista = new Lista();
        int opcion = 0, dato;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. add incio \n"
                        + "2. add final\n"
                                + "3. borrar incio\n"
                                + "4. borrar final\n"
                                + "5. borrar nodo\n"
                                + "6. listar\n"
                        + "7. salir", "Menu",1));
                switch (opcion) {
                    case 1:
                        try {
                            dato = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa dato al inicio: ", "Insertando al incio",JOptionPane.INFORMATION_MESSAGE));
                            lista.ingresarInicio(dato);
                        } catch (NumberFormatException n) {
                            JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
                        }
                        break;
                    case 2:
                        try {
                            dato = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa dato al final: ", "Insertando al final",JOptionPane.INFORMATION_MESSAGE));
                            lista.ingresarFinal(dato);
                        } catch (NumberFormatException n) {
                            JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
                        }
                        break;
                    case 3:
                        lista.eliminarInicio();
                        break;
                    case 4:
                        lista.eliminarFinal();
                        break;
                     case 5:
                        try {
                            dato = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa a eliminar ", "Eliminando", JOptionPane.INFORMATION_MESSAGE));
                            lista.eliminarNodo(dato);
                        } catch (NumberFormatException n) {
                            JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
                        }
                        break;   
                     case 6:
                         lista.pintar();
                        break;   
                      case 7:
                        break;  
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta ");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
            }
        } while (opcion != 7);
    }
}
