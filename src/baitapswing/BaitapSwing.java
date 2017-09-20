/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapswing;
import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author MSI
 */
public class BaitapSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Student");

        jFrame.setSize(1000, 800);
        jFrame.setLocationRelativeTo(null);
        ImagePanel panel = new ImagePanel(new ImageIcon("E:\\JAVA\\Demo tren lop\\New Folder\\BaitapSwing\\src\\baitapswing\\18.jpg").getImage());

        JPanel jPanel = new JPanel();
        jPanel.setBackground(new Color(0, 0, 0, 0));
        jPanel.setBounds(0, 80, 1000, 580);
        jPanel.setLayout(null);

        JLabel jl = new ImageLabel(new ImageIcon("E:\\JAVA\\Demo tren lop\\New Folder\\BaitapSwing\\src\\baitapswing\\14.png").getImage());
        jl.setBounds(505, 20, 400, 140);

        //JLabel jLabel = new ImageLabel(new ImageIcon("E:\\JAVA\\Demo tren lop\\New Folder\\BaitapSwing\\src\\baitapswing\\15.jpg").getImage());
        //jLabel.setBounds(650, 60, 300, 428);

        JLabel lblId = new JLabel("ID");
        lblId.setForeground(Color.red);
        lblId.setFont(new java.awt.Font("Times New Roman", 2, 20));
        lblId.setBounds(400, 150, 100, 40);

        JLabel lblName = new JLabel("Name");
        lblName.setFont(new java.awt.Font("Times New Roman", 2, 20));
        lblName.setBounds(400, 200, 100, 40);

        JLabel lblEmail = new JLabel("Email");
        lblEmail.setFont(new java.awt.Font("Times New Roman", 2, 20));
        lblEmail.setBounds(400, 250, 100, 40);

        JLabel lblPhone = new JLabel("Phone");
        lblPhone.setFont(new java.awt.Font("Times New Roman", 2, 20));
        lblPhone.setBounds(400, 300, 100, 40);

        JLabel lblRollNumber = new JLabel("RollNumber");
        lblRollNumber.setFont(new java.awt.Font("Times New Roman", 2, 20));
        lblRollNumber.setBounds(400, 350, 100, 40);

        JLabel lblClassName = new JLabel("ClassName");
        lblClassName.setFont(new java.awt.Font("Times New Roman", 2, 20));
        lblClassName.setBounds(400, 400, 100, 40);

        JTextField txtId = new JTextField();
        txtId.setForeground(Color.red);
        txtId.setFont(new java.awt.Font("Times New Roman", 1, 20));
        txtId.setBounds(505, 150, 300, 40);

        JTextField txtName = new JTextField();
        txtName.setForeground(Color.black);
        txtName.setFont(new java.awt.Font("Times New Roman", 1, 20));
        txtName.setBounds(505, 200, 300, 40);

        JTextField txtEmail = new JTextField();
        txtEmail.setForeground(Color.black);
        txtEmail.setFont(new java.awt.Font("Times New Roman", 1, 20));
        txtEmail.setBounds(505, 250, 300, 40);

        JTextField txtPhone = new JTextField();
        txtPhone.setForeground(Color.black);
        txtPhone.setFont(new java.awt.Font("Times New Roman", 1, 20));
        txtPhone.setBounds(505, 300, 300, 40);

        JTextField txtRollNumber = new JTextField();
        txtRollNumber.setForeground(Color.black);
        txtRollNumber.setFont(new java.awt.Font("Times New Roman", 1, 20));
        txtRollNumber.setBounds(505, 350, 300, 40);

        JTextField txtClassName = new JTextField();
        txtClassName.setForeground(Color.black);
        txtClassName.setFont(new java.awt.Font("Times New Roman", 1, 20));
        txtClassName.setBounds(505, 400, 300, 40);

        //JButton jButton = new JButton(new ImageIcon("E:\\JAVA\\Demo tren lop\\New Folder\\BaitapSwing\\src\\baitapswing\\8.png"));
        JButton jButton = new JButton("SUBMIT");
        jButton.setForeground(Color.WHITE);
        jButton.setBackground(Color.decode("#3B5998"));
        jButton.setBounds(560, 450, 90, 30);

        //jButton.setBorder(new RoundedBorder(10)); //10 is the radius
        //jButton.setForeground(Color.white);
        //JButton jb = new JButton(new ImageIcon("E:\\JAVA\\Demo tren lop\\New Folder\\BaitapSwing\\src\\baitapswing\\10.jpg"));
        JButton jb = new JButton("RESET");
        jb.setForeground(Color.WHITE);
        jb.setBackground(Color.decode("#3B5998"));
        jb.setBounds(665, 450, 90, 30);

        jPanel.add(jl);
       // jPanel.add(jLabel);
        jPanel.add(lblId);
        jPanel.add(lblName);
        jPanel.add(lblEmail);
        jPanel.add(lblPhone);
        jPanel.add(lblRollNumber);
        jPanel.add(lblClassName);
        jPanel.add(txtId);
        jPanel.add(txtName);
        jPanel.add(txtEmail);
        jPanel.add(txtPhone);
        jPanel.add(txtClassName);
        jPanel.add(txtRollNumber);
        jPanel.add(jButton);
        jPanel.add(jb);
        jFrame.add(jPanel);
        jFrame.getContentPane().add(panel);

        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

}
