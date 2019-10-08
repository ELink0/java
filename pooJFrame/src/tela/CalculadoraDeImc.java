package tela;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
 

public class CalculadoraDeImc extends JFrame{
    private JTextField edtPeso;
    private JTextField edtAltura;
    private JButton btnCalcula;
    private JLabel lblPeso;
    private JLabel lblAltura;
    private JLabel lblResultado;
 
    public CalculadoraDeImc(){
    	super("Calculadora de IMC");
        setConfig();
    }
 

    public void setConfig() {
        edtPeso = new JTextField();
        edtAltura = new JTextField();
        btnCalcula = new JButton("Calcular");
        lblPeso = new JLabel("Peso:");
        lblAltura = new JLabel("Altura:");
        lblResultado = new JLabel("Resultado: ");
         
        btnCalcula.addActionListener(new EventoCalculaIMC());
         
        add(lblPeso);
        add(lblAltura);
        add(edtPeso);
        add(edtAltura);
        add(lblResultado);
        add(btnCalcula);
        
        // Definições da janela
        setSize(605, 150);
        setLayout(new GridLayout(0, 2));
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.lightGray);
        setVisible(true);
    }
 
    public class EventoCalculaIMC implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
 
                double peso=Double.parseDouble(edtPeso.getText());
                double altura=Double.parseDouble(edtAltura.getText());
                double imc=peso/Math.pow(altura,2);
 
                //objeto para formatar saida, com uma decimal
                DecimalFormat df = new DecimalFormat("#0.0");
 
                String resultado="Resultado: "+df.format(imc);
                 
                //abaixo comparo valor do imc e concatena a string resultado
                if(imc < 18.5){
                    resultado+=" Abaixo do peso";
                }
                else if(imc < 24.9){
                    resultado+=" Peso ideal";
                }
                else if(imc < 29.9){
                    resultado+=" Levemente acima do peso";
                }
                else if(imc < 34.9){
                    resultado+=" Primeiro grau de obesidade";
                }
                else if(imc < 39.9){
                    resultado+=" Segundo grau de obesidade";
                }
                else
                    resultado+=" Obesidade mórbida";
 
                lblResultado.setText(resultado);
 
            }catch (ArithmeticException ar) {
                JOptionPane.showMessageDialog(null, "Erro aritmético, causa: "+ar.getMessage());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro desconhecido, causa: "+ex.getMessage());
            }
        }
    }
 
    public static void main(String[] args) {
        //instanciando e exibindo
        new CalculadoraDeImc().setVisible(true);
    }
    }