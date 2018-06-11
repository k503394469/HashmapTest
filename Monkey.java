/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasptest;

/**
 *
 * @author Mr.A
 */
public class Monkey {
    String name;
    int num;

    public Monkey(String name, int num) {
        this.name = name;
        this.num = num;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }
    
}
