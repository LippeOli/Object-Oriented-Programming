// Bruno Garcia de Oliveira Breda 11212702
// Felipe Oliveira Carvalho - 14613879
// Vitor Antonio de Almeida Lacerda - 12544761

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    public Calculator() {
        // Criar o JFrame
        JFrame frame = new JFrame("Calculadora");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criar o JPanel
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        // Tornar o frame visível
        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // Campo de texto para o primeiro número
        JTextField firstNumberField = new JTextField(10);
        firstNumberField.setBounds(50, 20, 200, 25);
        panel.add(firstNumberField);

        // Campo de texto para o segundo número
        JTextField secondNumberField = new JTextField(10);
        secondNumberField.setBounds(50, 50, 200, 25);
        panel.add(secondNumberField);

        // Label para exibir o resultado
        JLabel resultLabel = new JLabel("Resultado:");
        resultLabel.setBounds(50, 80, 200, 25);
        panel.add(resultLabel);

        // Botão de Adição
        JButton addButton = new JButton("+");
        addButton.setBounds(50, 110, 50, 25);
        panel.add(addButton);

        // Botão de Subtração
        JButton subButton = new JButton("-");
        subButton.setBounds(110, 110, 50, 25);
        panel.add(subButton);

        // Botão de Multiplicação
        JButton mulButton = new JButton("*");
        mulButton.setBounds(170, 110, 50, 25);
        panel.add(mulButton);

        // Botão de Divisão
        JButton divButton = new JButton("/");
        divButton.setBounds(230, 110, 50, 25);
        panel.add(divButton);

        // ActionListener para o botão de Adição
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(firstNumberField.getText());
                    double num2 = Double.parseDouble(secondNumberField.getText());
                    double result = num1 + num2;
                    resultLabel.setText("Resultado: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Entrada inválida");
                }
            }
        });

        // ActionListener para o botão de Subtração
        subButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(firstNumberField.getText());
                    double num2 = Double.parseDouble(secondNumberField.getText());
                    double result = num1 - num2;
                    resultLabel.setText("Resultado: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Entrada inválida");
                }
            }
        });

        // ActionListener para o botão de Multiplicação
        mulButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(firstNumberField.getText());
                    double num2 = Double.parseDouble(secondNumberField.getText());
                    double result = num1 * num2;
                    resultLabel.setText("Resultado: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Entrada inválida");
                }
            }
        });

        // ActionListener para o botão de Divisão
        divButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(firstNumberField.getText());
                    double num2 = Double.parseDouble(secondNumberField.getText());
                    if (num2 != 0) {
                        double result = num1 / num2;
                        resultLabel.setText("Resultado: " + result);
                    } else {
                        resultLabel.setText("Divisão por zero");
                    }
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Entrada inválida");
                }
            }
        });
    }
}
