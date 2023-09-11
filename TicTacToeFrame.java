import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TicTacToeFrame extends JFrame {
    private static ArrayList<Integer> playerposition = new ArrayList<>();
    private static ArrayList<Integer> cpuposition = new ArrayList<>();
    private static final Color PLAYER_COLOR = Color.BLUE;
    private static final Color CPU_COLOR = Color.RED;

    public TicTacToeFrame() {
        // Set the frame properties
        setTitle("Tic Tac Toe");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the game board as a JPanel
        JPanel gameBoardPanel = new JPanel(new GridLayout(3, 3));
        add(gameBoardPanel, BorderLayout.CENTER);

        // Create cells for the game board and add them to the panel
        for (int i = 1; i <= 9; i++) {
            JLabel cell = new JLabel("", SwingConstants.CENTER);
            cell.setFont(new Font("Monospaced", Font.PLAIN, 40));
            cell.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            gameBoardPanel.add(cell);
        }

        // Start the game
        game(gameBoardPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TicTacToeFrame frame = new TicTacToeFrame();
            frame.setVisible(true);
        });
    }

    public static void game(JPanel gameBoardPanel) {
        char game[][] = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        while (true) {
            // Player's turn
            int playerpos = getPlayerMove(gameBoardPanel);
            place(game, playerpos, "player");
            printboard(gameBoardPanel, game);

            String result = checkwinner();
            if (result != null) {
                showMessage(result);
                break;
            }

            // CPU's turn
            int cpupos = getCPUMove();
            place(game, cpupos, "cpu");
            printboard(gameBoardPanel, game);

            result = checkwinner();
            if (result != null) {
                showMessage(result);
                break;
            }
        }
    }

    public static void printboard(JPanel gameBoardPanel, char[][] game) {
        for (int i = 0; i < 9; i++) {
            JLabel cell = (JLabel) gameBoardPanel.getComponent(i);
            int row = i / 3;
            int col = i % 3;
            cell.setText(String.valueOf(game[row * 2][col * 2]));
            if (cell.getText().equals("X")) {
                cell.setForeground(PLAYER_COLOR);
            } else if (cell.getText().equals("O")) {
                cell.setForeground(CPU_COLOR);
            }
        }
    }

    public static int getPlayerMove(JPanel gameBoardPanel) {
        String input = JOptionPane.showInputDialog(null, "Enter the place (1-9):");
        int playerpos;
        try {
            playerpos = Integer.parseInt(input);
            while (playerposition.contains(playerpos) || cpuposition.contains(playerpos) || playerpos < 1 || playerpos > 9) {
                input = JOptionPane.showInputDialog(null, "Invalid input. Enter a correct position (1-9):");
                playerpos = Integer.parseInt(input);
            }
        } catch (NumberFormatException e) {
            playerpos = getPlayerMove(gameBoardPanel);
        }
        return playerpos;
    }

    public static int getCPUMove() {
        Random ran = new Random();
        int cpupos = ran.nextInt(9) + 1;
        while (playerposition.contains(cpupos) || cpuposition.contains(cpupos)) {
            cpupos = ran.nextInt(9) + 1;
        }
        return cpupos;
    }

    public static void place(char game[][], int pos, String user) {
        char symbol;
        if (user.equals("player")) {
            symbol = 'X';
            playerposition.add(pos);
        } else {
            symbol = 'O';
            cpuposition.add(pos);
        }
        switch (pos) {
            case 1:
                game[0][0] = symbol;
                break;
            case 2:
                game[0][2] = symbol;
                break;
            case 3:
                game[0][4] = symbol;
                break;
            case 4:
                game[2][0] = symbol;
                break;
            case 5:
                game[2][2] = symbol;
                break;
            case 6:
                game[2][4] = symbol;
                break;
            case 7:
                game[4][0] = symbol;
                break;
            case 8:
                game[4][2] = symbol;
                break;
            case 9:
                game[4][4] = symbol;
                break;
            default:
                break;
        }
    }

    public static String checkwinner() {
        List<List<Integer>> winningCombinations = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(2, 4, 6),
                Arrays.asList(7, 8, 9),
                Arrays.asList(1, 4, 7),
                Arrays.asList(2, 5, 8),
                Arrays.asList(3, 6, 9),
                Arrays.asList(1, 5, 9),
                Arrays.asList(3, 5, 7)
        );

        for (List<Integer> combination : winningCombinations) {
            if (playerposition.containsAll(combination)) {
                return "Congratulation you won !!";
            } else if (cpuposition.containsAll(combination)) {
                return "CPU won !!";
            } else if (playerposition.size() + cpuposition.size() == 9) {
                return "CAT";
            }
        }
        return null;
    }

    public static void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
