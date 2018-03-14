/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import ClassesTables.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import pi.subway.conexaoBD;

/**
 *
 * @author Augusto Kalel
 */
public class CadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldCPF = new javax.swing.JTextField();
        jTextFieldBairro = new javax.swing.JTextField();
        jTextFieldRua = new javax.swing.JTextField();
        jTextFieldTelefone = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldNascimento = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data = 
            new javax.swing.text.MaskFormatter("##/##/####");
            jTextFieldNascimento = new javax.swing.JFormattedTextField(data);
        }catch(Exception e){
        }
        jTextFieldNumero = new javax.swing.JTextField();
        jToggleButtonCadastrar = new javax.swing.JToggleButton();
        jToggleButtonCancelar = new javax.swing.JToggleButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(380, 600));
        getContentPane().setLayout(null);

        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 38, 16);

        jLabel2.setText("CPF:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 40, 27, 16);

        jLabel3.setText("Rua:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 340, 27, 20);

        jLabel4.setText("Bairro:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 370, 40, 16);

        jLabel5.setText("Cidade:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 400, 44, 16);

        jLabel6.setText("Telefone:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 70, 55, 20);

        jLabel7.setText("E-mail:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 110, 41, 16);

        jLabel8.setText("data de nascimento:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 150, 117, 16);

        jLabel9.setText("NUmero:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(210, 340, 51, 20);

        jTextFieldCidade.setText("cidade");
        getContentPane().add(jTextFieldCidade);
        jTextFieldCidade.setBounds(70, 400, 100, 22);

        jTextFieldNome.setText("nome");
        getContentPane().add(jTextFieldNome);
        jTextFieldNome.setBounds(60, 10, 70, 22);

        jTextFieldCPF.setText("cpf");
        jTextFieldCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCPFActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCPF);
        jTextFieldCPF.setBounds(50, 40, 120, 22);

        jTextFieldBairro.setText("bairro");
        getContentPane().add(jTextFieldBairro);
        jTextFieldBairro.setBounds(70, 370, 120, 22);

        jTextFieldRua.setText("rua");
        jTextFieldRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRuaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldRua);
        jTextFieldRua.setBounds(70, 340, 120, 20);

        jTextFieldTelefone.setText("telefone");
        jTextFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTelefone);
        jTextFieldTelefone.setBounds(80, 70, 120, 30);

        jTextFieldEmail.setText("email");
        getContentPane().add(jTextFieldEmail);
        jTextFieldEmail.setBounds(70, 110, 130, 22);

        jTextFieldNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNascimentoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNascimento);
        jTextFieldNascimento.setBounds(130, 150, 70, 22);

        jTextFieldNumero.setText("numero");
        getContentPane().add(jTextFieldNumero);
        jTextFieldNumero.setBounds(270, 340, 69, 30);

        jToggleButtonCadastrar.setText("Cadastrar");
        jToggleButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButtonCadastrar);
        jToggleButtonCadastrar.setBounds(80, 450, 89, 25);

        jToggleButtonCancelar.setText("Cancelar");
        getContentPane().add(jToggleButtonCancelar);
        jToggleButtonCancelar.setBounds(190, 450, 83, 25);

        jLabel10.setText("Usuario:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 200, 48, 16);

        jLabel11.setText("Senha:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 230, 48, 16);

        jTextFieldUsuario.setText("usuario");
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(80, 200, 48, 22);

        jPasswordFieldPass.setText("jPasswordField1");
        getContentPane().add(jPasswordFieldPass);
        jPasswordFieldPass.setBounds(80, 230, 126, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonCadastrarActionPerformed
        if (cadastrar() == true) {
            Login login = new Login();
            login.setVisible(true);
            //JOptionPane.OK_OPTION
        }


    }//GEN-LAST:event_jToggleButtonCadastrarActionPerformed
    private boolean cadastrar() {
        try (Connection con = conexaoBD.conectar()) {

//Pegar os dados e encapsular.
            Cliente cliente1 = new Cliente();
            cliente1.setNome(jTextFieldNome.getText());
            cliente1.setCPF(jTextFieldCPF.getText());
            cliente1.setEndereco(jTextFieldRua.getText());
            cliente1.setBairro(jTextFieldBairro.getText());
            cliente1.setNumero(Integer.parseInt(jTextFieldNumero.getText()));
            cliente1.setCidade(jTextFieldCidade.getText());
            cliente1.setTelefone(jTextFieldTelefone.getText());
            cliente1.setEmail(jTextFieldEmail.getText());
            cliente1.setUsuario(jTextFieldUsuario.getText());
            cliente1.setSenha(jPasswordFieldPass.getText());

//converter String em Date
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            cliente1.setDataNascimento(formatter.parse(jTextFieldNascimento.getText()));
            System.out.println(cliente1.getDataNascimento());

//verificar se o campo usuario e senha possuem dados
            if (cliente1.getUsuario() != null && !cliente1.getUsuario().equals("") && cliente1.getSenha() != null && !cliente1.getSenha().equals("")) {
                String sql = "insert into login (nome_usuario, senha) values (?,?)";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, cliente1.getUsuario());
                stmt.setString(2, cliente1.getSenha());
                stmt.execute();

//pegar o atual id_login e armazenar na fk id_login
                sql = "SELECT MAX(ID_login) FROM login";
                stmt = con.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                int id_login=0;
                if (rs.next()) {
                   id_login = Integer.parseInt(rs.getString("max"));
                    
                }

                try {
                    sql = "insert into cliente (nome, cpf, endereco, numero_casa, bairro, cidade,telefone, email,id_login_fk) values (?,?,?,?,?,?,?,?,?)";
                    stmt = con.prepareStatement(sql);

                    stmt.setString(1, cliente1.getNome());
                    stmt.setString(2, cliente1.getCPF());
                    stmt.setString(3, cliente1.getEndereco());
                    stmt.setInt(4, cliente1.getNumero());
                    //stmt.setDate(5, cliente1.getDataNascimento());
                    stmt.setString(5, cliente1.getBairro());
                    stmt.setString(6, cliente1.getCidade());
                    stmt.setString(7, cliente1.getTelefone());
                    stmt.setString(8, cliente1.getEmail());
                    stmt.setInt(9, id_login);
                    stmt.execute();

                } catch (Exception e) {
                    System.out.println("ERRO");
                }

                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void setCampos() {
        try {
            Cliente cliente1 = new Cliente();
            cliente1.setNome(jTextFieldNome.getText());
            cliente1.setCPF(jTextFieldCPF.getText());
            cliente1.setEndereco(jTextFieldRua.getText());
            cliente1.setBairro(jTextFieldBairro.getText());
            cliente1.setCidade(jTextFieldCidade.getText());
            cliente1.setTelefone(jTextFieldTelefone.getText());
            cliente1.setEmail(jTextFieldEmail.getText());
            //converter String em Date
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            cliente1.setDataNascimento(formatter.parse(jTextFieldNascimento.getText()));
            System.out.println(cliente1.getDataNascimento());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "***Problemas ao cadastrar dados contate o administrador de sistemas");
        }
    }
    private void jTextFieldCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCPFActionPerformed

    private void jTextFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefoneActionPerformed

    private void jTextFieldRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRuaActionPerformed

    private void jTextFieldNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNascimentoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordFieldPass;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNascimento;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldRua;
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JToggleButton jToggleButtonCadastrar;
    private javax.swing.JToggleButton jToggleButtonCancelar;
    // End of variables declaration//GEN-END:variables
}
