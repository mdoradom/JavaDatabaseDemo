package com.company;

import java.util.Scanner;

public class Menu {

    static Scanner scanner = new Scanner(System.in);

    // RESET
    public static final String ANSI_RESET = "\u001B[0m";

    // BG COLOR
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";

    // BOLD TEXT COLOR
    public static final String BLACK_BOLD = "\033[1;30m";
    public static final String RED_BOLD = "\033[1;31m";

    public static int dbMenu() {
        while(true) {
            System.out.println(ANSI_PURPLE_BACKGROUND + BLACK_BOLD + "DATABASE SELECTOR:  " + ANSI_RESET);
            System.out.println(ANSI_PURPLE_BACKGROUND + BLACK_BOLD + "\t[1] MySql       " + ANSI_RESET);
            System.out.println(ANSI_PURPLE_BACKGROUND + BLACK_BOLD + "\t[2] MongoDB     " + ANSI_RESET);
            System.out.println(ANSI_PURPLE_BACKGROUND + BLACK_BOLD + "\t----------------" + ANSI_RESET);
            System.out.println(ANSI_PURPLE_BACKGROUND + BLACK_BOLD + "\t[q] Exit        " + ANSI_RESET);
            String dbSelector = scanner.next();

            if (dbSelector.equals("q")) {
                return 0;
            } else if (dbSelector.equals("1")) {
                System.out.println("MySql");
                return 1;
            } else if (dbSelector.equals("2")) {
                System.out.println("MongoDB");
                return 2;
            } else {
                System.out.println(RED_BOLD + "ERROR! Choose a valid option." + ANSI_RESET);
            }
        }
    }

    public static int actionMenu(String bgcolor) {
        while(true) {
            System.out.println(bgcolor + BLACK_BOLD + "SELECT ACTION:             " + ANSI_RESET);
            System.out.println(bgcolor + BLACK_BOLD + "\t[1] INSERT FILM        " + ANSI_RESET);
            System.out.println(bgcolor + BLACK_BOLD + "\t[2] SHOW FILM          " + ANSI_RESET);
            System.out.println(bgcolor + BLACK_BOLD + "\t[3] SHOW ALL FILMS     " + ANSI_RESET);
            System.out.println(bgcolor + BLACK_BOLD + "\t[4] DELETE FILM        " + ANSI_RESET);
            System.out.println(bgcolor + BLACK_BOLD + "\t[5] UPDATE FILM        " + ANSI_RESET);
            System.out.println(bgcolor + BLACK_BOLD + "\t                       " + ANSI_RESET);
            System.out.println(bgcolor + BLACK_BOLD + "\t[6] INSERT ACTOR       " + ANSI_RESET);
            System.out.println(bgcolor + BLACK_BOLD + "\t[7] SHOW ACTOR         " + ANSI_RESET);
            System.out.println(bgcolor + BLACK_BOLD + "\t[8] SHOW ALL ACTORS    " + ANSI_RESET);
            System.out.println(bgcolor + BLACK_BOLD + "\t[9] DELETE ACTOR       " + ANSI_RESET);
            System.out.println(bgcolor + BLACK_BOLD + "\t[10] UPDATE ACTOR      " + ANSI_RESET);
            System.out.println(bgcolor + BLACK_BOLD + "\t                       " + ANSI_RESET);
            System.out.println(bgcolor + BLACK_BOLD + "\t[11] INSERT RELATION   " + ANSI_RESET);
            System.out.println(bgcolor + BLACK_BOLD + "\t[12] DELETE RELATION   " + ANSI_RESET);
            System.out.println(bgcolor + BLACK_BOLD + "\t[13] QUERY RELATION    " + ANSI_RESET);
            System.out.println(bgcolor + BLACK_BOLD + "\t[14] QUERY ALL RELATION" + ANSI_RESET);
            System.out.println(bgcolor + BLACK_BOLD + "\t[q] Exit               " + ANSI_RESET);

            String actionSelector = scanner.next();

            switch (actionSelector) {
                case "q":
                    return 0;
                case "1":
                    return 1;
                case "2":
                    return 2;
                case "3":
                    return 3;
                case "4":
                    return 4;
                case "5":
                    return 5;
                case "6":
                    return 6;
                case "7":
                    return 7;
                case "8":
                    return 8;
                case "9":
                    return 9;
                case "10":
                    return 10;
                case "11":
                    return 11;
                case "12":
                    return 12;
                case "13":
                    return 13;
                case "14":
                    return 14;

                default:
                    System.out.println(RED_BOLD + "ERROR! Choose a valid option." + ANSI_RESET);
                    break;
            }
        }
    }
}
