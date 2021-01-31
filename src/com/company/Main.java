package com.company;

public class Main {

    //Перечисления 

    enum Cofe{S(300),M(220), B(100){
            String getCofe(){
                return "1";
            }
        };

        String classCofe = "2";
        int milk;

        Cofe(int milk){
            this.milk = milk;
        }

        String getCofe(){
            return classCofe;
        }

    }

    public static void main(String[] args) {
        Cofe cofe1 = Cofe.S;
        Cofe cofe2 = Cofe.M;
        Cofe cofe3 = Cofe.B;

        System.out.println("--------------------------");
        System.out.println("cofe1");
        System.out.println(cofe1.getCofe());
        System.out.println(cofe1.milk);

        System.out.println("--------------------------");
        System.out.println("cofe2");
        System.out.println(cofe2.getCofe());
        System.out.println(cofe2.milk);

        System.out.println("--------------------------");
        System.out.println("cofe3");
        System.out.println(cofe3.getCofe());
        System.out.println(cofe3.milk);

        System.out.println("--------------------------");
        // write your code here
    }
}
