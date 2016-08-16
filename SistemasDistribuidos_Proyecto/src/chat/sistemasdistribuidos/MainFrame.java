/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.sistemasdistribuidos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Session;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import com.memetix.mst.language.Language;
import com.memetix.mst.translate.Translate;

/**
 *
 * @author root
 */
public class MainFrame extends javax.swing.JFrame {
    Connection connection;
    private Session session;
    private MessageProducer producer;
    private MessageConsumer consumer;
    private String url = ActiveMQConnection.DEFAULT_BROKER_URL;
    private String subject;
    /**
     * Creates new form Main
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelTopic = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        labelIdioma = new javax.swing.JLabel();
        textSala = new javax.swing.JTextField();
        textUsuario = new javax.swing.JTextField();
        comboIdioma = new javax.swing.JComboBox();
        buttonEntrar = new javax.swing.JButton();
        panelSala = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        textMensaje = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        labelUsuario2 = new javax.swing.JLabel();
        labelSala2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jLabel1.setText("Bienvenido! Entra a una Sala de Chat!");

        labelTopic.setText("Sala:");

        labelUsuario.setText("Usuario:");

        labelIdioma.setText("Idioma:");

        textSala.setToolTipText("Escribe el nombre de una Sala");
        textSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSalaActionPerformed(evt);
            }
        });

        textUsuario.setToolTipText("Escribe un nombre de usuario");

        comboIdioma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ingles", "Frances", "Portugues", "Aleman" }));
        comboIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboIdiomaActionPerformed(evt);
            }
        });

        buttonEntrar.setText("Entrar");
        buttonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addComponent(labelTopic)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textSala, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addComponent(labelUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addComponent(labelIdioma)
                                .addGap(18, 18, 18)
                                .addComponent(comboIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTopic)
                    .addComponent(textSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsuario)
                    .addComponent(textUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIdioma)
                    .addComponent(comboIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonEntrar)
                .addGap(101, 101, 101))
        );

        getContentPane().add(panelLogin, "card2");

        jLabel3.setText("Escribe un Mensaje:");

        textMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMensajeActionPerformed(evt);
            }
        });

        jLabel4.setText("Usuario:");

        jLabel2.setText("Sala:");

        buttonSalir.setText("Salir");
        buttonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalirActionPerformed(evt);
            }
        });

        jLabel5.setText("Chat");

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        labelUsuario2.setText("jLabel6");

        labelSala2.setText("jLabel6");

        javax.swing.GroupLayout panelSalaLayout = new javax.swing.GroupLayout(panelSala);
        panelSala.setLayout(panelSalaLayout);
        panelSalaLayout.setHorizontalGroup(
            panelSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSalaLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(labelSala2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelUsuario2)
                .addGap(110, 110, 110))
            .addGroup(panelSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelSalaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelSalaLayout.createSequentialGroup()
                            .addGroup(panelSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(buttonSalir))
                            .addGap(348, 348, 348))
                        .addGroup(panelSalaLayout.createSequentialGroup()
                            .addGroup(panelSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelSalaLayout.createSequentialGroup()
                                    .addGroup(panelSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel3))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(jScrollPane1)
                                .addComponent(textMensaje))
                            .addContainerGap()))))
        );
        panelSalaLayout.setVerticalGroup(
            panelSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsuario2)
                    .addComponent(jLabel4)
                    .addComponent(labelSala2))
                .addContainerGap(320, Short.MAX_VALUE))
            .addGroup(panelSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelSalaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(textMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonSalir)
                    .addContainerGap()))
        );

        getContentPane().add(panelSala, "card3");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSalaActionPerformed

    private void comboIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboIdiomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboIdiomaActionPerformed

    private void textMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMensajeActionPerformed
        // TODO add your handling code here:
        producirMensaje(labelUsuario2.getText(), textMensaje.getText());
        textMensaje.setText("");
    }//GEN-LAST:event_textMensajeActionPerformed

    private void buttonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEntrarActionPerformed
        // TODO add your handling code here:
        String usuario = this.textUsuario.getText();
        String sala = this.textSala.getText();
        if(usuario.equals(""))
            usuario = "anonimo";
        if(sala.equals(""))
            sala = "GENERAL";
        this.labelUsuario2.setText(usuario);
        this.labelSala2.setText(sala);
        this.panelLogin.setVisible(false);
        this.panelSala.setVisible(true);
        try {
            activeMQ();
        } catch (JMSException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonEntrarActionPerformed
    
    private void activeMQ() throws JMSException {
      ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);
      connection = connectionFactory.createConnection();
      connection.start();
      //Crea queue en el server
      session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
      //Hay que poner el valor de textTopic en subject
      this.subject = labelSala2.getText();
      Destination destination = session.createTopic(subject);
      
      producer = session.createProducer(destination);

      consumer = session.createConsumer(destination);
      consumer.setMessageListener(new MessageListener() {

         @Override
         public void onMessage(Message message) {
             try {
                 leerMensaje(message);
             } catch (Exception ex) {
                 Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
      });      
      //textArea.append("Entro a sala: " + this.subject + "\n");
        producirMensaje(labelUsuario2.getText(), "Ingresar a la sala " + this.subject);
   }
    
    private void buttonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalirActionPerformed
        // TODO add your handling code here:
        this.panelSala.setVisible(false);
        this.panelLogin.setVisible(true);
        try {
            closeConnection();
        } catch (JMSException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonSalirActionPerformed
    
    private void producirMensaje(String usuario, String texto){
            MapMessage map;
            try {
               map = session.createMapMessage();
               map.setString("usuario", usuario);
               map.setString("texto", texto);
               producer.send(map);               
            } catch (JMSException e1) {
               e1.printStackTrace();
            }
    }
    
    private void leerMensaje(Message message) throws Exception{
        if (message instanceof MapMessage) {
        MapMessage map = (MapMessage) message;
            try {
                Translate.setClientId("SD_Final");
                Translate.setClientSecret("e3HU8oc5IeOOYg7Ika5Kb6Col4ntqL/HkbyQtBMC0Ew=");
                String usuario = map.getString("usuario");
                String texto = map.getString("texto");
                String idioma = comboIdioma.getSelectedItem().toString();
                if (idioma.equals("Ingles")){
                String translatedText = Translate.execute(texto, Language.SPANISH, Language.ENGLISH);
                textArea.append(usuario + ": " + translatedText + "\n");
                }else if (idioma.equals("Frances")){
                String translatedText = Translate.execute(texto, Language.SPANISH, Language.FRENCH);
                textArea.append(usuario + ": " + translatedText + "\n");
                }else if (idioma.equals("Portugues")){
                String translatedText = Translate.execute(texto, Language.SPANISH, Language.PORTUGUESE);
                textArea.append(usuario + ": " + translatedText + "\n");
                }else if (idioma.equals("Aleman")){
                String translatedText = Translate.execute(texto, Language.SPANISH, Language.GERMAN);
                textArea.append(usuario + ": " + translatedText + "\n");
                }
             } catch (JMSException e) {
                e.printStackTrace();
             }
        }
    }
    
    public void closeConnection() throws JMSException {
        producirMensaje(labelUsuario2.getText(), "Salió de la sala...");
        connection.close();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEntrar;
    private javax.swing.JButton buttonSalir;
    private javax.swing.JComboBox comboIdioma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelIdioma;
    private javax.swing.JLabel labelSala2;
    private javax.swing.JLabel labelTopic;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JLabel labelUsuario2;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelSala;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextField textMensaje;
    private javax.swing.JTextField textSala;
    private javax.swing.JTextField textUsuario;
    // End of variables declaration//GEN-END:variables
}
