package com.company;

class Лаба1 {
    public static void main(String[] args) {
        //массив
        int[] massiv = new int[5];
        int b = 10;
        System.out.println("Исходный массив:");
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = (int) (Math.random() * b);
            System.out.print(massiv[i] + " ");
        }
        System.out.println("\nЗеркальный массив:");
        for (int i = massiv.length - 1; i >= 0; i--) {
            System.out.print(massiv[i] + " ");
        }
        //матрица
        int[][] matrica = new int[5][5];
        int sum_diag = 0, sum_diag1 = 0, sum_diag2 = 0;
        int p1 = 0, p2 = 0, p = 0;
        System.out.println("\nМатрица 5x5:");
        for (int j = 0; j < matrica.length; j++) {
            for (int k = 0; k < matrica[0].length; k++) {
                matrica[j][k] = (int) (Math.random() * b);
                System.out.print(matrica[j][k] + "  ");

                if (j == k) {
                    sum_diag1 += matrica[j][k];
                }
                if (j == matrica.length - k - 1) {
                    sum_diag2 += matrica[j][k];
                }
                switch (j) {
                    case 0:
                    case 4:
                        p1 += matrica[j][k];
                        break;
                }
                switch (k) {
                    case 0:
                    case 4:
                        p2 += matrica[j][k];
                        break;
                }
            }
            System.out.println();
        }
        sum_diag = sum_diag1 + sum_diag2;
        p = p1 + p2 - matrica[0][0] - matrica[0][4] - matrica[4][0] - matrica[4][4];
        System.out.println("Сумма диагоналей = " + sum_diag);
        System.out.println("Сумма цифр по периметру = " + p);

        //доска шахматная
        System.out.println("Доска шахматная:");
        String[][] chessBoard = new String[10][10];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if ((i + j) % 2 == 0 && j != 0 && i != 0 && j!= 9 && i != 9) chessBoard[i][j] = "X";
                else if (j != 0 && i != 0 && j!= 9 && i != 9) chessBoard[i][j] = "Y";
                else if (j == 0 || i == 0 || j == 9 || i == 9) chessBoard[i][j] = chessBoardCoord(i,j);
                System.out.print(" " + chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static String chessBoardCoord(int a, int b) {
        String letters = "'ABCDEFGH'";
        String numbers = "'87654321'";
        if (b==0 || b == 9)  return (Character.toString(numbers.charAt(a))); /*charAt - метод, с помощью которого мы извлекаем из строки элемент под переданным номером, здесь - под номерами a и b. Character.toString - метод, который переводит полученный символ в строку*/
        else if (a==0 || a==9)  return (Character.toString(letters.charAt(b)));
        return "";
    }
    }
