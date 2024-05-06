package lesson11.CoinFlip;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class CoinFlipGameGUI extends JFrame {
    private JLabel resultLabel;
    private JLabel scoreLabel;
    private JButton headsButton;
    private JButton tailsButton;
    private int userWins = 0;
    private int computerWins = 0;
    private static final int INITIAL_SCORE = 0;

    public CoinFlipGameGUI() {
        setTitle("Coin Flip Game");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.WHITE);

        resultLabel = new JLabel("Welcome to Coin Flip Game!");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 20));
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mainPanel.add(resultLabel, BorderLayout.CENTER);

        JPanel scorePanel = new JPanel();
        scorePanel.setBackground(Color.DARK_GRAY);
        scorePanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        scoreLabel = new JLabel("Score: User - " + userWins + ", Computer - " + computerWins);
        scoreLabel.setFont(new Font("Arial", Font.BOLD, 16));
        scoreLabel.setForeground(Color.WHITE);
        scorePanel.add(scoreLabel);

        mainPanel.add(scorePanel, BorderLayout.NORTH);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        inputPanel.setBackground(Color.WHITE);

        headsButton = createButton("Heads", Color.BLACK);
        tailsButton = createButton("Tails", Color.BLACK);


        inputPanel.add(headsButton);
        inputPanel.add(tailsButton);

        mainPanel.add(inputPanel, BorderLayout.SOUTH);

        add(mainPanel);
    }

    private JButton createButton(String label, Color color) {
        JButton button = new JButton(label);
        button.setPreferredSize(new Dimension(100, 50));
        button.setFont(new Font("Arial", Font.PLAIN, 16));
        button.setBackground(color);
        button.setForeground(Color.BLACK);
        button.setFocusPainted(false);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guess(label.toLowerCase());
            }
        });
        return button;
    }


    private void guess(String userGuess) {
        Random random = new Random();
        int coinResult = random.nextInt(2); // 0 for heads, 1 for tails

        String result = (coinResult == 0) ? "heads" : "tails";
        resultLabel.setText("The coin shows: " + result);

        if (userGuess.equals(result)) {
            userWins++;
            resultLabel.setText(resultLabel.getText() + " - User scores!");
        } else {
            computerWins++;
            resultLabel.setText(resultLabel.getText() + " - Computer scores!");
        }

        updateScore();

        if (userWins == 3) {
            int choice = JOptionPane.showConfirmDialog(this, "Congratulations! You won 3 games. Do you want to continue?", "Game Over", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                resetGame();
            } else {
                System.exit(0);
            }
        } else if (computerWins == 3) {
            int choice = JOptionPane.showConfirmDialog(this, "Computer wins 3 games. Do you want to continue?", "Game Over", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                resetGame();
            } else {
                System.exit(0);
            }
        }
    }

    private void updateScore() {
        scoreLabel.setText("Score: User - " + userWins + ", Computer - " + computerWins);
    }

    private void resetGame() {
        userWins = INITIAL_SCORE;
        computerWins = INITIAL_SCORE;
        updateScore();
        resultLabel.setText("Welcome to Coin Flip Game!");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CoinFlipGameGUI game = new CoinFlipGameGUI();
                game.setVisible(true);
            }
        });
    }
}
