/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yapısal_decorator;

/**
 *
 * @author mehmet
 */
public abstract class Component {

    private int sayi1;

    protected int getSayi1() {
        return sayi1;
    }

    public void setSayi1(int sayi1) {
        this.sayi1 = sayi1;
    }

    abstract int islem();

}

class Cikarma extends Component {

    private int sayi2;

    private int getSayi2() {
        return sayi2;
    }

    public void setSayi2(int sayi2) {
        this.sayi2 = sayi2;
    }

    @Override
    public int islem() {

        return this.getSayi1() - this.getSayi2();

    }

}

class Decorator extends Component {

    private Component component;

    protected Component getComponent() {
        return component;
    }

    protected void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public int islem() {

        return this.getComponent().islem();

    }
}

class IkiliIslem extends Decorator {

    public IkiliIslem(Component component) {

        this.setComponent(component);

    }

    public void sifrele() {

        if (this.carp() > 150) {
            System.out.println("Şifrelenmek için uygun");
        } else {
            System.out.println("Uygunsuz");
        }

    }

    private int carp() {

        return this.getComponent().islem() * this.getSayi1();

    }

}
