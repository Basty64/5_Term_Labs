package com.company;

import com.company.subpack.Human;
import com.company.subpack.Products;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Human> human = new ArrayList<>();
        human.add(new Human("Alex",85,189,19,true, 1.38F));
        human.add(new Human("Olga",63,175,20,false,1.46F));
        Products[] products = new Products[4];
        products[0] = new Products("Винегрет",1.7F,10.3F,8.2F);
        products[1] = new Products("Щавелевый суп",1.6F, 2.5F, 2.9F);
        products[2] = new Products("Рис белый",2.2F, 0.5F, 24.9F);
        products[3] = new Products("Роллы Калифорния",4.03F, 16.2F, 14.5F);

        human.get(0).setEat(products[0].kkalorii(300)+products[1].kkalorii(500)+
                products[2].kkalorii(250)+products[3].kkalorii(80));
        human.get(1).setEat(products[0].kkalorii(300)+products[1].kkalorii(500)+
                products[2].kkalorii(250)+products[3].kkalorii(80));


        human.get(0).resultDiet();
        human.get(1).resultDiet();


         }
}
