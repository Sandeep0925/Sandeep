public class ComplexNumber {
    int real, image;
    public ComplexNumber(int r, int i){
        this.real =r;
        this.image= i;
    }
    public void showc(){
        System.out.println(this.real + "+i" + this.image);
    }

    public static ComplexNumber add(ComplexNumber n1 , ComplexNumber n2){
        ComplexNumber res = new ComplexNumber(0,0);
        res.real = n1.real + n2.real;
        res.image = n1.image + n2.image;
        return res;
    }

    public static void main(String[] args) {
        ComplexNumber c1= new ComplexNumber(4,5);
        ComplexNumber c2 = new ComplexNumber(10,15);
        System.out.println("first complex number");
        c1.showc();
        System.out.println("second complex number ");
        c2.showc();
        ComplexNumber res = add(c1,c2);
        System.out.println(" The sum is");
        res.showc();

    }
    
}
