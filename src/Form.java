import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

public class Form {
    private JTextField cadena;
    private JPanel panel;
    private JButton button1;
    private JLabel mostrarCifrado;


    public Form() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cd;
                cd=cadena.getText();
                verificar(cd);
            }
        });
    }

    public void verificar(String cadena){
        try {
            String cad1;
            String cad2;

            Cifrado cifrado=new Cifrado();
            //cadena.toUpperCase();

            Letras.comprobar(cadena);
            cad2= cifrado.cifrar(cadena);
            mostrarCifrado.setText(cad2);


        } catch (Exception  ex) {
            JOptionPane.showMessageDialog(null, "Solo se puede ingresar letras");
        }
    }

    static class Letras extends Exception{

        public Letras(String solo_debe_contener_letras) {
            super(solo_debe_contener_letras);
        }

        public static void comprobar(String cadena) throws Letras{
            boolean letras = true;
            for (int i = 0; i < cadena.length(); i++) {
                if (!Character.isDigit(cadena.charAt(i))) {
                    letras = false;
                }
            }
            if(letras==false){
                throw new Letras("Solo debe contener letras");
            }
        }
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulario");
        frame.setContentPane(new Form().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
