package com.company.subpack;

public class Human {
    private String name;
    private int ves, rost, vozrast;
    private boolean pol;
    private float a;
    private float DCI;
    private double totalCall=0;

    public Human(String name,int ves, int rost, int vozrast, boolean pol, float a) {
        this.name=name;
        this.ves = ves;
        this.rost = rost;
        this.vozrast = vozrast;
        this.pol = pol;
        this.a = a;
        this.DCI = DCI_formula();

    }

    private float DCI_formula(){
        if (pol) {
            DCI = (float) ((rost * 6.25 + ves * 10 - vozrast * 5 + 5) * a);
        }
        else {
            DCI = (float) ((rost * 6.25 + ves * 10 - vozrast * 5 - 161) * a);
        }

        return DCI;
    }

    public void setEat(double call){
        this.totalCall += call;
    }

    public double getTotalCall() {
        return totalCall;
    }

    public void resultDiet(){
        if(totalCall>DCI){
            System.out.println(name+" Fat");
        }else {
            System.out.println(name+" No Fat");
        }



    }

}
