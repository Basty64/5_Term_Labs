package com.company.subpack;

public class Products {
    private float belki, zhiri,uglevodi;
    private String pr;

            public Products(String pr, float belki, float zhiri,float uglevodi){
                this.pr  = pr;
                this.belki = belki;
                this.uglevodi = uglevodi;
                this.zhiri = zhiri;

            }
    public double kkalorii(int massa_gr){

        return   (belki * 4.1F + zhiri * 9.29F + uglevodi * 4.1F)/100 * massa_gr;


    }


    public String getPr(){
                return this.pr;
    }
}
