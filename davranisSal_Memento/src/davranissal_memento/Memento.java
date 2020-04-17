/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davranissal_memento;

/**
 *
 * @author mehmet
 */
public class Memento {

    private int a;
    private String b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}

class memoli {

    private int a;
    private String b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void geriYukle(Memento memente) {

        this.setA(memente.getA());
        this.setB(memente.getB());
    }

    public Memento geriYuklemeNoktasi() {

        Memento memo = new Memento();
        memo.setA(this.getA());
        memo.setB(this.getB());

        return memo;
    }
}

class yedek {

    private Memento memo;

    public Memento getMemo() {
        return memo;
    }

    public void setMemo(Memento memo) {
        this.memo = memo;
    }

}
