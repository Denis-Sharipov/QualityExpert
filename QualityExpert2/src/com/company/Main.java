package com.company;

public class Main {

    public static void main(String[] args) {
	    int price = 21;
	    int money = 50;
	    sdacha(price, money);
    }

    private static void sdacha(int price, int money){
        int ost = money - price;
        System.out.println("Стоимость: " + price + " руб.");
        System.out.println("Ваши сумма: " + money + " руб.");
        System.out.println("Сдача:");
        if (ost >= 5000){
            int k = 0;
            while (ost >= 5000){
                k++;
                ost-=5000;
            }
            if (k!=0){
                System.out.println("5000 руб: " + k + " шт.");
            }
        }

        if (ost >= 2000){
            int k = 0;
            while (ost >= 2000){
                k++;
                ost-=2000;
            }
            if (k!=0){
                System.out.println("2000 руб: " + k + " шт.");
            }
        }

        if (ost >= 1000){
            int k = 0;
            while (ost >= 1000){
                k++;
                ost-=1000;
            }
            if (k!=0){
                System.out.println("1000 руб: " + k + " шт.");
            }
        }


        if (ost >= 500){
            int k = 0;
            while (ost >= 500){
                k++;
                ost-=500;
            }
            if (k!=0){
                System.out.println("500 руб: " + k + " шт.");
            }
        }

        if (ost >= 100){
            int k = 0;
            while (ost >= 100){
                k++;
                ost-=100;
            }
            if (k!=0){
                System.out.println("100 руб: " + k + " шт.");
            }
        }

        if (ost >= 50){
            int k = 0;
            while (ost >= 50){
                k++;
                ost-=50;
            }
            if (k!=0){
                System.out.println("50 руб: " + k + " шт.");
            }
        }

        if (ost >= 10){
            int k = 0;
            while (ost >= 10){
                k++;
                ost-=10;
            }
            if (k!=0){
                System.out.println("10 руб: " + k + " шт.");
            }
        }

        if (ost >= 5){
            int k = 0;
            while (ost >= 5){
                k++;
                ost-=5;
            }
            if (k!=0){
                System.out.println("5 руб: " + k + " шт.");
            }
        }

        if (ost >= 2){
            int k = 0;
            while (ost >= 2){
                k++;
                ost-=2;
            }
            if (k!=0){
                System.out.println("2 руб: " + k + " шт.");
            }
        }

        if (ost >= 1){
            int k = 0;
            while (ost >= 1){
                k++;
                ost-=1;
            }
            if (k!=0){
                System.out.println("1 руб: " + k + " шт.");
            }
        }
    }
}
