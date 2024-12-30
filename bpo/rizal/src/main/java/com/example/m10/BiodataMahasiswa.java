package com.example.m10;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 

public class BiodataMahasiswa extends JFrame { 

    private JTextField fieldNIM, fieldNama; 
    private JTextArea areaAlamat; 
    private JRadioButton radioPria, radioWanita; 
    private JComboBox<String> comboFakultas, comboProdi; 
    private JButton tombolSimpan, tombolBacaData, tombolKeluar; 

    public BiodataMahasiswa() { 
        inisialisasiKomponen(); 
        aturLayout(); 
        aksi(); 
        setTitle("Formulir Biodata Mahasiswa"); 
        setSize(400, 400); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setVisible(true); 
    } 

    private void inisialisasiKomponen() { 
        JLabel labelNIM = new JLabel("NIM"); 
        JLabel labelNama = new JLabel("Nama"); 
        JLabel labelAlamat = new JLabel("Alamat"); 
        JLabel labelJenisKelamin = new JLabel("Jenis Kelamin"); 
        JLabel labelFakultas = new JLabel("Fakultas"); 
        JLabel labelProdi = new JLabel("Program Studi"); 

        fieldNIM = new JTextField(20); 
        fieldNama = new JTextField(20); 
        areaAlamat = new JTextArea(5, 20); 
        radioPria = new JRadioButton("Pria"); 
        radioWanita = new JRadioButton("Wanita"); 
        ButtonGroup grupJenisKelamin = new ButtonGroup(); 
        grupJenisKelamin.add(radioPria); 
        grupJenisKelamin.add(radioWanita); 

        String[] opsiFakultas = {"Ilmu Komputer", "Pendidikan Guru Sekolah Dasar", "Hukum", "Kehutanan"}; 
        comboFakultas = new JComboBox<>(opsiFakultas); 
        String[] opsiProdi = {"Sistem Informasi", "Teknik Informatika", 
"Desain Komunikasi Visual", "Managemen Informatika"}; 
        comboProdi = new JComboBox<>(opsiProdi); 

        tombolSimpan = new JButton("Simpan"); 
        tombolBacaData = new JButton("Baca Data"); 
        tombolKeluar = new JButton("Keluar"); 
    } 

    private void aturLayout() { 
        setLayout(new GridBagLayout()); 
        GridBagConstraints gbc = new GridBagConstraints(); 
        gbc.insets = new Insets(5, 5, 5, 5); 
        gbc.fill = GridBagConstraints.HORIZONTAL; 

        gbc.gridx = 0; gbc.gridy = 0; 
        add(new JLabel("NIM"), gbc); 
        gbc.gridx = 1; gbc.gridy = 0; 
        add(fieldNIM, gbc); 

        gbc.gridx = 0; gbc.gridy = 1; 
        add(new JLabel("Nama"), gbc); 
        gbc.gridx = 1; gbc.gridy = 1; 
        add(fieldNama, gbc); 

        gbc.gridx = 0; gbc.gridy = 2; 
        add(new JLabel("Alamat"), gbc); 
        gbc.gridx = 1; gbc.gridy = 2; 
        gbc.gridheight = 3; 
        add(new JScrollPane(areaAlamat), gbc); 
        gbc.gridheight = 1; 

        gbc.gridx = 0; gbc.gridy = 5; 
        add(new JLabel("Jenis Kelamin"), gbc); 
        gbc.gridx = 1; gbc.gridy = 5; 
        add(radioPria, gbc); 
        gbc.gridx = 2; gbc.gridy = 5; 
        add(radioWanita, gbc); 

        gbc.gridx = 0; gbc.gridy = 6; 
        add(new JLabel("Fakultas"), gbc); 
        gbc.gridx = 1; gbc.gridy = 6; 
        add(comboFakultas, gbc); 

        gbc.gridx = 0; gbc.gridy = 7; 
        add(new JLabel("Program Studi"), gbc); 
        gbc.gridx = 1; gbc.gridy = 7; 
        add(comboProdi, gbc); 

        gbc.gridx = 0; gbc.gridy = 8; 
        add(tombolSimpan, gbc); 
        gbc.gridx = 1; gbc.gridy = 8; 
        add(tombolBacaData, gbc); 
        gbc.gridx = 2; gbc.gridy = 8; 
        add(tombolKeluar, gbc); 
    } 

    private void aksi() { 
        tombolSimpan.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                JOptionPane.showMessageDialog(null, "Data disimpan"); 
            } 
        }); 
        tombolBacaData.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                StringBuilder data = new StringBuilder(); 
                data.append("  Biodata Mahasiswa\n"); 
                data.append("===================\n"); 
                data.append(String.format("NIM           : %s\n", 
fieldNIM.getText())); 
                data.append(String.format("Nama          : %s\n", 
fieldNama.getText())); 
                data.append(String.format("Alamat        : %s\n", 
areaAlamat.getText())); 
                data.append(String.format("Jenis Kelamin : %s\n", 
radioPria.isSelected() ? "Pria" : "Wanita")); 
                data.append(String.format("Fakultas      : %s\n", 
comboFakultas.getSelectedItem())); 
                data.append(String.format("Program Studi : %s\n", 
comboProdi.getSelectedItem())); 

                JOptionPane.showMessageDialog(null, data.toString(), "Data Mahasiswa", JOptionPane.INFORMATION_MESSAGE); 
            } 
        }); 
        tombolKeluar.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                System.exit(0); 
            } 
        }); 
    } 

    public static void main(String[] args) { 
        new BiodataMahasiswa(); 
    } 
}