package tictactoe;
import java.util.*;
//import java.sql.*;
/**
 *
 * @author segar
 */
class playername{
    Scanner input = new Scanner(System.in);
    static String player1, player2;
    static String board[][] = new String[3][3];
    void getPName(){
        System.out.print("Enter the Player 1 Name: ");
        player1=input.nextLine();
        System.out.print("Enter the Player 2 Name: ");
        player2=input.nextLine();
    }
}
class game extends playername{
    int ginput[]= new int[3];
    static int p1count=1;
    static int p2count=1;
    void boardinit(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j]="-";
            }
        }
    }
    void printboard(){
        //System.out.println("TicTacToe");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
    public int player1gameplay(){
        System.out.println("\n"+player1+"'s Turn "+p1count);
        System.out.println("Enter the Row and Column you want to Mark X: ");
        for (int i = 0; i < 2; i++) {
            ginput[i]=input.nextInt();
        }
        int row = ginput[0]-1;
        int column = ginput[1]-1;
        if (board[row][column].equals("-")) {
            board[row][column]="X";
            p1count++;
        }
        else{
            System.out.println("Space Already Ocupied in the board");
            return player1gameplay();
        }
        return 0;
    }
    public int player2gameplay(){
        System.out.println("\n"+player2+"'s Turn "+p2count);
        System.out.println("Enter the Row and Column you want to Mark O: ");
        for (int i = 0; i < 2; i++) {
            ginput[i]=input.nextInt();
        }
        int row = ginput[0]-1;
        int column = ginput[1]-1;
        if (board[row][column].equals("-")) {
            board[row][column]="O";
            p2count++;
        }
        else{
            System.out.println("Space Already Ocupied in the board");
            player2gameplay();
        }
        return 0;
    }
    void gameplay(){
        System.out.println("Welcome to TicTacToe Game");
        System.out.println(player1+" Takes X\n"+player2+" Takes O");
        for (int i = 0; i < p1count; i++) {
            player1gameplay();
            System.out.println("\n");
            printboard();
            if (board[0][0]=="X"&&board[0][1]=="X"&&board[0][2]=="X"||board[1][0]=="X"&&board[1][1]=="X"&&board[1][2]=="X"||board[2][0]=="X"&&board[2][1]=="X"&&board[2][2]=="X"||board[0][0]=="X"&&board[1][0]=="X"&&board[2][0]=="X"||board[0][1]=="X"&&board[1][1]=="X"&&board[2][1]=="X"||board[0][2]=="X"&&board[1][2]=="X"&&board[2][2]=="X"||board[0][0]=="X"&&board[1][1]=="X"&&board[2][2]=="X"||board[2][0]=="X"&&board[1][1]=="X"&&board[0][2]=="X") {
                System.out.println("\n"+player1+" has Won the Game");
                break;
            }
            else if(board[0][0]!="-"&&board[0][1]!="-"&&board[0][2]!="-"&&board[1][0]!="-"&&board[1][1]!="-"&&board[1][2]!="-"&&board[2][0]!="-"&&board[2][1]!="-"&&board[2][2]!="-"){
                System.out.println("Match Draw");
                break;
            }
            
            player2gameplay();
            System.out.println("\nThe Board Current Status");
            printboard();
            if (board[0][0]=="O"&&board[0][1]=="O"&&board[0][2]=="O"||board[1][0]=="O"&&board[1][1]=="O"&&board[1][2]=="O"||board[2][0]=="O"&&board[2][1]=="O"&&board[2][2]=="O"||board[0][0]=="O"&&board[1][0]=="O"&&board[2][0]=="O"||board[0][1]=="O"&&board[1][1]=="O"&&board[2][1]=="O"||board[0][2]=="O"&&board[1][2]=="O"&&board[2][2]=="O"||board[0][0]=="O"&&board[1][1]=="O"&&board[2][2]=="O"||board[2][0]=="O"&&board[1][1]=="O"&&board[0][2]=="O") {
                System.out.println("\n"+player2+" has Won the game");
                break;
            }
            else if(board[0][0]!="-"&&board[0][1]!="-"&&board[0][2]!="-"&&board[1][0]!="-"&&board[1][1]!="-"&&board[1][2]!="-"&&board[2][0]!="-"&&board[2][1]!="-"&&board[2][2]!="-"){
                System.out.println("\nMatch Draw!");
                break;
            }
            
        }
    }
}
public class TicTacToe {
    public static void main(String[] args) {
        game obj = new game();
        System.out.println("Welcome to TicTacToe\n");
        obj.getPName();
        System.out.println("Board: ");
        obj.boardinit();   
        obj.printboard();
        System.out.println("\n");
        obj.gameplay();
        System.out.println("\nFinal Board");
        obj.printboard();
//        Statement stmt = null;
//        try{
//            Class.forName("org.apache.derby.jdbc.ClientDriver");
//            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/TicTacToeDB","root","root");
//            stmt=con.createStatement();
//            stmt.executeUpdate("INSERT INTO TURNS VALUES ('"+obj.player1+"',"+obj.p1count+",'"+obj.player2+"',"+obj.p2count+")");
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
            
    }
    
}
