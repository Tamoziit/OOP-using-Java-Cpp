package mycomplex;

public class Helper {
    int real, img;

    public Helper(int r, int i) {
        this.real = r;
        this.img = i;
    }

    public Helper add(Helper ob) {
        Helper temp = new Helper(0, 0);
        temp.real = this.real + ob.real;
        temp.img = this.img + ob.img;

        return temp;
    }

    public Helper sub(Helper ob) {
        Helper temp = new Helper(0, 0);
        temp.real = this.real - ob.real;
        temp.img = this.img - ob.img;

        return temp;
    }

    public Helper mul(Helper ob) {
        Helper temp = new Helper(0, 0);
        temp.real = (this.real * ob.real) - (this.img * ob.img);
        temp.img = (this.real * ob.img) + (this.img * ob.real);

        return temp;
    }

    public void show() {
        System.out.println("(" + this.real + ") + (" + this.img + ")i");
    }
}
