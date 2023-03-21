package motor;
 
// Mizael Simão Borgo Moeiras Nisa 2319233
// Gustavo Henrique Amaral Costa   2257920
	
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;

	public class MotorGUI extends JFrame {

	    private MotorEstendido motor;

	    private JButton ligarButton;
	    private JButton desligarButton;        //////// INTERFACE FUNCIONANDO;
	    private JButton acelerarButton;
	    private JButton desacelerarButton;
	    private JButton statusButton;
	    
	    
	    private JTextField fabricanteTextField;
	    
	    private JLabel fabricanteLabel;
	    private JLabel velocidadeLabel;
	    private JLabel statusLabel;
	    

	    public MotorGUI(MotorEstendido motor) {
	        this.motor = motor;

	        // Configurando os componentes da GUI
	        ligarButton = new JButton("Ligar");
	        desligarButton = new JButton("Desligar");
	        acelerarButton = new JButton("Acelerar");
	        statusButton = new JButton("Status");
	        desacelerarButton = new JButton("Desacelerar");
	        fabricanteLabel = new JLabel("Fabricante: " + motor.getFabricante());
	        velocidadeLabel = new JLabel("Velocidade: " + motor.getStatusVelocidade());
	        statusLabel = new JLabel("Motor desligado");
	        
	        fabricanteTextField = new JTextField(motor.getFabricante());
	        
	        // Configurando o layout
	        JPanel buttonPanel = new JPanel(new GridLayout(2, 2));
	        buttonPanel.add(ligarButton);
	        buttonPanel.add(desligarButton);
	        buttonPanel.add(acelerarButton);
	        buttonPanel.add(desacelerarButton);

	        JPanel infoPanel = new JPanel(new GridLayout(4, 1));
	        infoPanel.add(fabricanteLabel);
	        infoPanel.add(velocidadeLabel);
	        infoPanel.add(statusButton);
	        infoPanel.add(statusLabel);
	        infoPanel.add(fabricanteTextField);

	        JPanel mainPanel = new JPanel(new BorderLayout());
	        mainPanel.add(buttonPanel, BorderLayout.CENTER);
	        mainPanel.add(infoPanel, BorderLayout.SOUTH);

	        // Adicionando o painel principal à janela
	        add(mainPanel);

	        // Configurando os ouvintes de eventos
	        ligarButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                motor.ligar();
	                statusLabel.setText("Motor ligado");
	                updateLabels();
	            }
	        });

	        desligarButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                motor.desligar();
	                statusLabel.setText("Motor desligado");
	                updateLabels();
	            }
	        });

	        acelerarButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                motor.acelerar();
	                velocidadeLabel.setText("Velocidade: " + motor.getStatusVelocidade());
	                updateLabels();
	            }
	        });

	        desacelerarButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                motor.desacelerar();
	                velocidadeLabel.setText("Velocidade: " + motor.getStatusVelocidade());
	                updateLabels();
	            }
	         
	            
	        });

	        statusButton.addActionListener(new ActionListener() {
	        	 public void actionPerformed(ActionEvent e) {
	        	        if (motor.status) {
	        	            String mensagem = "Motor ligado, velocidade atual: " + motor.getStatusVelocidade();
	        	            JOptionPane.showMessageDialog(null, mensagem);
	        	        } else {
	        	            JOptionPane.showMessageDialog(null, "Motor desligado");
	        	        }
	        	    }
	        });
	        
	        
	        
	        
	        fabricanteTextField.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                String novaFabricante = fabricanteTextField.getText();
	                motor.setFabricante(novaFabricante);
	                fabricanteLabel.setText("Fabricante: " + motor.getFabricante());
	            }
	        });
	        
	        
	        // Configurando a janela
	        setTitle("Controle do Motor");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(300, 200);
	        setVisible(true);
	    }
	    
	    

	    // Atualiza os valores dos rótulos na interface gráfica
	    private void updateLabels() {
	        fabricanteLabel.setText("Fabricante: " + motor.getFabricante());
	        velocidadeLabel.setText("Velocidade: " + motor.getStatusVelocidade());
	    }
	    
	    
	    

	    public static void main(String[] args) {
	        MotorEstendido motor = new MotorEstendido("Fabricante X");
	        MotorGUI gui = new MotorGUI(motor);
	    }
	}


