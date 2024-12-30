package com.example.ujian;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KalkulatorBentuk extends JFrame {
    private JTextField alasSegitigaField;
    private JTextField tinggiSegitigaField;
    private JTextField sisi1SegitigaField;
    private JTextField sisi2SegitigaField;
    private JTextField sisi3SegitigaField;
    private JLabel hasilLuasSegitiga;
    private JLabel hasilKelilingSegitiga;
    
    private JTextField panjangPersegiPanjangField;
    private JTextField lebarPersegiPanjangField;
    private JLabel hasilLuasPersegiPanjang;
    private JLabel hasilKelilingPersegiPanjang;
    
    private JTextField sisiKubusField;
    private JLabel hasilVolumeKubus;
    private JLabel hasilLuasPermukaanKubus;

    public KalkulatorBentuk() {
        setTitle("Kalkulator Bentuk");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(0, 0, 400, 370);

        JPanel panelSegitiga = new JPanel();
        panelSegitiga.setLayout(null);
        initPanelSegitiga(panelSegitiga);

        JPanel panelPersegiPanjang = new JPanel();
        panelPersegiPanjang.setLayout(null);
        initPanelPersegiPanjang(panelPersegiPanjang);

        JPanel panelKubus = new JPanel();
        panelKubus.setLayout(null);
        initPanelKubus(panelKubus);

        tabbedPane.add("Segitiga", panelSegitiga);
        tabbedPane.add("Persegi Panjang", panelPersegiPanjang);
        tabbedPane.add("Kubus", panelKubus);

        add(tabbedPane);
    }

    private void initPanelSegitiga(JPanel panel) {
        JLabel alasLabel = new JLabel("Alas:");
        alasLabel.setBounds(10, 10, 80, 25);
        panel.add(alasLabel);

        alasSegitigaField = new JTextField();
        alasSegitigaField.setBounds(100, 10, 160, 25);
        panel.add(alasSegitigaField);

        JLabel tinggiLabel = new JLabel("Tinggi:");
        tinggiLabel.setBounds(10, 40, 80, 25);
        panel.add(tinggiLabel);

        tinggiSegitigaField = new JTextField();
        tinggiSegitigaField.setBounds(100, 40, 160, 25);
        panel.add(tinggiSegitigaField);

        JLabel sisi1Label = new JLabel("Sisi 1:");
        sisi1Label.setBounds(10, 70, 80, 25);
        panel.add(sisi1Label);

        sisi1SegitigaField = new JTextField();
        sisi1SegitigaField.setBounds(100, 70, 160, 25);
        panel.add(sisi1SegitigaField);

        JLabel sisi2Label = new JLabel("Sisi 2:");
        sisi2Label.setBounds(10, 100, 80, 25);
        panel.add(sisi2Label);

        sisi2SegitigaField = new JTextField();
        sisi2SegitigaField.setBounds(100, 100, 160, 25);
        panel.add(sisi2SegitigaField);

        JLabel sisi3Label = new JLabel("Sisi 3:");
        sisi3Label.setBounds(10, 130, 80, 25);
        panel.add(sisi3Label);

        sisi3SegitigaField = new JTextField();
        sisi3SegitigaField.setBounds(100, 130, 160, 25);
        panel.add(sisi3SegitigaField);

        JButton hitungSegitigaButton = new JButton("Hitung");
        hitungSegitigaButton.setBounds(10, 160, 250, 25);
        panel.add(hitungSegitigaButton);

        hasilLuasSegitiga = new JLabel("Luas: ");
        hasilLuasSegitiga.setBounds(10, 190, 250, 25);
        panel.add(hasilLuasSegitiga);

        hasilKelilingSegitiga = new JLabel("Keliling: ");
        hasilKelilingSegitiga.setBounds(10, 220, 250, 25);
        panel.add(hasilKelilingSegitiga);

        hitungSegitigaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hitungSegitiga();
            }
        });
    }

    private void hitungSegitiga() {
        try {
            double alas = Double.parseDouble(alasSegitigaField.getText());
            double tinggi = Double.parseDouble(tinggiSegitigaField.getText());
            double sisi1 = Double.parseDouble(sisi1SegitigaField.getText());
            double sisi2 = Double.parseDouble(sisi2SegitigaField.getText());
            double sisi3 = Double.parseDouble(sisi3SegitigaField.getText());

            double luas = 0.5 * alas * tinggi;
            double keliling = sisi1 + sisi2 + sisi3;

            hasilLuasSegitiga.setText("Luas: " + luas);
            hasilKelilingSegitiga.setText("Keliling: " + keliling);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void initPanelPersegiPanjang(JPanel panel) {
        JLabel panjangLabel = new JLabel("Panjang:");
        panjangLabel.setBounds(10, 10, 80, 25);
        panel.add(panjangLabel);

        panjangPersegiPanjangField = new JTextField();
        panjangPersegiPanjangField.setBounds(100, 10, 160, 25);
        panel.add(panjangPersegiPanjangField);

        JLabel lebarLabel = new JLabel("Lebar:");
        lebarLabel.setBounds(10, 40, 80, 25);
        panel.add(lebarLabel);

        lebarPersegiPanjangField = new JTextField();
        lebarPersegiPanjangField.setBounds(100, 40, 160, 25);
        panel.add(lebarPersegiPanjangField);

        JButton hitungPersegiPanjangButton = new JButton("Hitung");
        hitungPersegiPanjangButton.setBounds(10, 70, 250, 25);
        panel.add(hitungPersegiPanjangButton);

        hasilLuasPersegiPanjang = new JLabel("Luas: ");
        hasilLuasPersegiPanjang.setBounds(10, 100, 250, 25);
        panel.add(hasilLuasPersegiPanjang);

        hasilKelilingPersegiPanjang = new JLabel("Keliling: ");
        hasilKelilingPersegiPanjang.setBounds(10, 130, 250, 25);
        panel.add(hasilKelilingPersegiPanjang);

        hitungPersegiPanjangButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hitungPersegiPanjang();
            }
        });
    }

    private void hitungPersegiPanjang() {
        try {
            double panjang = Double.parseDouble(panjangPersegiPanjangField.getText());
            double lebar = Double.parseDouble(lebarPersegiPanjangField.getText());

            double luas = panjang * lebar;
            double keliling = 2 * (panjang + lebar);

            hasilLuasPersegiPanjang.setText("Luas: " + luas);
            hasilKelilingPersegiPanjang.setText("Keliling: " + keliling);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void initPanelKubus(JPanel panel) {
        JLabel sisiLabel = new JLabel("Sisi:");
        sisiLabel.setBounds(10, 10, 80, 25);
        panel.add(sisiLabel);

        sisiKubusField = new JTextField();
        sisiKubusField.setBounds(100, 10, 160, 25);
        panel.add(sisiKubusField);

        JButton hitungKubusButton = new JButton("Hitung");
        hitungKubusButton.setBounds(10, 40, 250, 25);
        panel.add(hitungKubusButton);

        hasilVolumeKubus = new JLabel("Volume: ");
        hasilVolumeKubus.setBounds(10, 70, 250, 25);
        panel.add(hasilVolumeKubus);

        hasilLuasPermukaanKubus = new JLabel("Luas Permukaan: ");
        hasilLuasPermukaanKubus.setBounds(10, 100, 250, 25);
        panel.add(hasilLuasPermukaanKubus);

        hitungKubusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hitungKubus();
            }
        });
    }

    private void hitungKubus() {
        try {
            double sisi = Double.parseDouble(sisiKubusField.getText());

            double volume = Math.pow(sisi, 3);
            double luasPermukaan = 6 * Math.pow(sisi, 2);

            hasilVolumeKubus.setText("Volume: " + volume);
            hasilLuasPermukaanKubus.setText("Luas Permukaan: " + luasPermukaan);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new KalkulatorBentuk().setVisible(true);
            }
        });
    }
}
