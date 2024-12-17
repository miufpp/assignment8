package org.miu.problem1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            ScoreCard scoreCard = new ScoreCard();
            System.out.println("Welcome to ScoreCard board");
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.println("Enter subject name:");
            String name=scanner.nextLine();
            scoreCard.setSubjectName(name);
            System.out.println("Enter subject score:");
            double score=scanner.nextDouble();
            if(score<0 || score>100) throw new UnsupportedOperationException("Score must be in range of 0 to 100");
            scoreCard.setSubjectScore(score);
            System.out.println("Your score is: " + scoreCard.getSubjectScore()  );
        }catch (InputMismatchException e){
            System.out.println("InputMismatch! The requested input type for score should be a number!");
        }catch(UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }finally {
            scanner.close();
            System.out.println("Exiting now");
            System.exit(0);
        }
    }
}
