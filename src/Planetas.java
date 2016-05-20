import sistema.Planeta;
import sistema.SistemaSolar;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URL;

public class Planetas extends JFrame implements ActionListener {
    JFrame janela;
    JPanel painel;
    JLabel pesoterra;

    JTextField peso;
    JLabel pesoNoPlaneta;
    JLabel pesoNoPlanetaResult;

    JLabel escolha;
    ButtonGroup grupo;
    JRadioButton mercurio;
    JRadioButton venus;
    JRadioButton marte;
    JRadioButton jupiter;
    JRadioButton saturno;
    JRadioButton urano;
    JLabel imagem;

    private SistemaSolar galaxia;

    public Planetas() throws IOException {
        this.setLayout(new BorderLayout());

        janela = new JFrame("OutrosPesos");
        painel = new JPanel();
        pesoterra = new JLabel("Peso na Terra-kg");
        peso = new JTextField("", 10);
        pesoNoPlaneta = new JLabel("Peso na Planeta selecionado.");
        pesoNoPlanetaResult = new JLabel("", 10);
        escolha = new JLabel("Escolha:");
        grupo = new ButtonGroup();
        mercurio = new JRadioButton("Mercurio");
        venus = new JRadioButton("Venus");
        marte = new JRadioButton("Marte");
        jupiter = new JRadioButton("Jupiter");
        saturno = new JRadioButton("Saturno");
        urano = new JRadioButton("Urano");

        SetImage(this.getClass().getResource("./planetas.jpg"));

        janela.setSize(300, 300);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        painel.add(pesoterra);
        painel.add(peso);
        painel.add(pesoNoPlaneta);
        painel.add(pesoNoPlanetaResult);
        painel.add(escolha);

        grupo.add(mercurio);
        grupo.add(venus);
        grupo.add(marte);
        grupo.add(jupiter);
        grupo.add(saturno);
        grupo.add(urano);

        painel.add(mercurio);
        painel.add(venus);
        painel.add(marte);
        painel.add(jupiter);
        painel.add(saturno);
        painel.add(urano);

        painel.add(imagem);

        janela.add(painel);

        mercurio.addActionListener(this);
        venus.addActionListener(this);
        marte.addActionListener(this);
        jupiter.addActionListener(this);
        saturno.addActionListener(this);
        urano.addActionListener(this);

        galaxia = new SistemaSolar();
    }

    private void SetImage(URL fileImagem) throws IOException {
        ImageIcon image = new ImageIcon(ImageIO.read(fileImagem));
        if(imagem == null){
            imagem = new JLabel(image);
        }else{
            imagem.setIcon(image);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JRadioButton) {
            String nomePlaneta = ((JRadioButton) e.getSource()).getText();
            Double inputPeso = Double.parseDouble(this.peso.getText());

            Planeta planeta = galaxia.EncontrarPlaneta(nomePlaneta);
            Double num = planeta.ConvertPeso(inputPeso);

            pesoNoPlanetaResult.setText("" + num);

            try {
                this.SetImage(planeta.MinhaImagem());

            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}