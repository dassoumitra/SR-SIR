import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TicTacToeFrame extends JFrame implements ActionListener {
    private static ArrayList<Integer> playerposition = new ArrayList<>();
    private static ArrayList<Integer> cpuposition = new ArrayList<>();
    private static final Color PLAYER_COLOR = Color.BLUE;
    private static final Color CPU_COLOR = Color.RED;
    private static final Color EMPTY_COLOR = Color.WHITE;
    private static final int BOARD_SIZE = 3;

    private JButton[][] buttons;
    private char[][] gameBoard;

    public TicTacToeFrame() {
        // Set the frame properties
        setTitle("Tic Tac Toe");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(BOARD_SIZE, BOARD_SIZE));

        // Initialize the game board
        gameBoard = new char[BOARD_SIZE][BOARD_SIZE];
        for (char[] row : gameBoard) {
            Arrays.fill(row, ' ');
        }

        // Create the game board as buttons
        buttons = new JButton[BOARD_SIZE][BOARD_SIZE];
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                buttons[i][j] = new JButton("");
                buttons[i][j].setFont(new Font("Monospaced", Font.PLAIN, 40));
                buttons[i][j].setBackground(EMPTY_COLOR);
                buttons[i][j].addActionListener(this);
                add(buttons[i][j]);
            }
        }

        // Start the game
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TicTacToeFrame::new);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton buttonClicked = (JButton) e.getSource();
        int row = -1;
        int col = -1;

        // Find the position of the clicked button in the game board
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (buttons[i][j] == buttonClicked) {
                    row = i;
                    col = j;
                    break;
                }
            }
        }

        // Check if the position is valid (not already occupied)
        if (gameBoard[row][col] == ' ' && !playerposition.contains(row * BOARD_SIZE + col + 1) &&
                !cpuposition.contains(row * BOARD_SIZE + col + 1)) {
            place(row, col, "player");
            String result = checkwinner();

            // If the game is not over, let CPU make a move
            if (result == null) {
                makeCPUMove();
                result = checkwinner();
            }

            // Display the updated game board
            printboard();

            // Check if the game is over
            if (result != null) {
                JOptionPane.showMessageDialog(null, result);
                resetGame();
            }
        }
    }

    private void makeCPUMove() {
        Random ran = new Random();
        int cpupos = ran.nextInt(BOARD_SIZE * BOARD_SIZE) + 1;
        while (playerposition.contains(cpupos) || cpuposition.contains(cpupos)) {
            cpupos = ran.nextInt(BOARD_SIZE * BOARD_SIZE) + 1;
        }
        int row = (cpupos - 1) / BOARD_SIZE;
        int col = (cpupos - 1) % BOARD_SIZE;
        place(row, col, "cpu");
    }

    private void place(int row, int col, String user) {
        char symbol = ' ';
        if (user.equals("player")) {
            symbol = 'X';
            playerposition.add(row * BOARD_SIZE + col + 1);
        } else {
            symbol = 'O';
            cpuposition.add(row * BOARD_SIZE + col + 1);
        }
        gameBoard[row][col] = symbol;
    }

    private String checkwinner() {
        List<List<Integer>> winningCombinations = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9),
                Arrays.asList(1, 4, 7),
                Arrays.asList(2, 5, 8),
                Arrays.asList(3, 6, 9),
                Arrays.asList(1, 5, 9),
                Arrays.asList(3, 5, 7)
        );

        for (List<Integer> combination : winningCombinations) {
            if (playerposition.containsAll(combination)) {
                highlightWinningCombination(combination, PLAYER_COLOR);
                return "Congratulations, you won!";
            } else if (cpuposition.containsAll(combination)) {
                highlightWinningCombination(combination, CPU_COLOR);
                return "CPU won!";
            } else if (playerposition.size() + cpuposition.size() == BOARD_SIZE * BOARD_SIZE) {
                return "It's a draw!";
            }
        }
        return null;
    }

    private void highlightWinningCombination(List<Integer> combination, Color color) {
        for (int pos : combination) {
            int row = (pos - 1) / BOARD_SIZE;
            int col = (pos - 1) % BOARD_SIZE;
            buttons[row][col].setBackground(color);
        }
    }

    private void printboard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                buttons[i][j].setText(String.valueOf(gameBoard[i][j]));
            }
        }
    }

    private void resetGame() {
        playerposition.clear();
        cpuposition.clear();
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                gameBoard[i][j] = ' ';
                buttons[i][j].setText("");
                buttons[i][j].setBackground(EMPTY_COLOR);
            }
        }
    }
}
