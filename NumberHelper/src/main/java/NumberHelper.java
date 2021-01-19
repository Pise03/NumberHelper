/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class NumberHelper {

    private int number;

    public NumberHelper(int n) {
        number = n;
    }

    public boolean isEven() {
        // ritorna true se number numero pari, altrimenti ritorna false
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOdd() {
        // ritorna true se number è un numero dispari, altrimenti ritorna false
        if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public int sum(int n) {
        // ritorna la somma tra number e n
        n += number;
        return n;

    }

    public boolean isPrime() {
        // ritorna true se number è un numero primo, altrimenti ritorna false
        int meta = number / 2;
        for (int i = 2; i <= meta; i++) {
            if (number % meta == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isDivisibleBy(int n) {
        // ritorna true se number è divisibile per il parametro n, altrimenti ritorna false
        if (number % n == 0) {
            return true;
        } else {
            return false;
        }
    }
}
