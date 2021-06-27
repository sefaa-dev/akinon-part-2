package com.sefayilmaz.dsfsdfs;

import io.javalin.Javalin;

public class main {
    public static void main(String[] args) {

        Javalin app = Javalin.create().start(7000);

        app.get("/factoryel/:n", ctx -> {
            String nParameter = ctx.pathParam("n");
            // int factor = Integer.parseInt(nParameter, n);
            String calculated = String.valueOf(factoryel(nParameter));
            ctx.result("Sayinizin Factoryeli = " + calculated);
        });
    }
    public static int factoryel(String number) {
        int i, fact = 1;
        Integer convertToNumber = Integer.parseInt(number);
        for (i = 1; i <= convertToNumber; i++) {
            fact = fact * i;
            System.out.println("Factorial of " + convertToNumber + " is: " + fact);
        }
        return fact;
    }
}