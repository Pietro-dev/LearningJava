package LeetCode;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }
    public static int romanToInt(String s) {
        List<Integer> valores = new ArrayList<>();
        int soma = 0;

        for (int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case 'I':
                    valores.add(1);
                break;
                case  'V':
                    valores.add(5);
                break;
                case 'X':
                    valores.add(10);
                break;
                case 'L':
                    valores.add(50);
                break;
                case 'C':
                    valores.add(100);
                break;
                case 'D':
                    valores.add(500);
                break;
                case 'M':
                    valores.add(1000);
                break;
            }
        }
        for (int i = 0; i < valores.size()-1; i++){
            if(valores.get(i) < valores.get(i+1) || valores.get(i).equals(valores.get(i+1))){
                soma += valores.get(i);
            }else if(valores.get(i) > valores.get(i+1)){
                soma -=valores.get(i+1) -  valores.get(i);
            }else {
                soma += valores.get(i);
            }
            System.out.println(i);
        }
        System.out.println(s);
        System.out.println(valores);
        return soma;
    }
}
