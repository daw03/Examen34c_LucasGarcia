package examen;

import java.util.*;

/**
 * @author Lucas
 * @version 1.0.0
 */

/**
 ** La clase RockPaperScissors nos permite jugar al juego piedra, papel o tijera contra el ordenador.
 */
public class RockPaperScissors {
	private static int keyboard = 0;
	private static Scanner scanner = new Scanner(System.in);
	
	/**
	 * Lista la cual va almacenar las opciones posibles a elegir por el ordenador.
	 */
	public static List<String> optionList;
	
	/**
	 * Constructor vacio.
	 */
	public RockPaperScissors() {
	}

	/**
	 * @hidden
	 */
	public static void main(String[] args) {
		optionList = Arrays.asList("Rock", "Paper", "Scissors");
		do {
			System.out.println("Welcome to Rock, Paper, Scissors!");
			System.out.print("Enter your choice (Rock(1), Paper(2), or Scissors(3)): ");
			keyboard = scanner.nextInt();
			scanner.nextLine();
		} while (keyboard < 1 || keyboard > 3);
		String computerChoice = optionList.get(new Random().nextInt(3));
		String userChoice = optionList.get(keyboard - 1);
		System.out.println("Your chose: " + userChoice + "\nComputer chose: " + computerChoice);
		System.out.println(RockPaperScissors.checkGame(userChoice, computerChoice));
		scanner.close();
	}
	
	/**
	 * El metodo nos devuelve como hemos quedado en el juego de piedra, papel o tijera.
	 * 
	 * @param userChoice Valor que ha elegido el usuario.
	 * @param computerChoice Valor que ha elegido el ordenador.
	 * @return Devuelve un String que contiene un mensaje con el resultado de la partida.
	 */
	public static String checkGame(String userChoice, String computerChoice) {
		String gameResult = "";
		if (userChoice.equals(computerChoice)) {
			gameResult = "It's a tie!";
		} else if (userChoice.equals("Rock") && computerChoice.equals("Scissors")) {
			gameResult = "You win this round!";
		} else if (userChoice.equals("Paper") && computerChoice.equals("Rock")) {
			gameResult = "You win this round!";
		} else if (userChoice.equals("Scissors") && computerChoice.equals("Paper")) {
			gameResult = "You win this round!";
		} else {
			gameResult = "Computer wins this round!";
		}
		return gameResult;
	}
}