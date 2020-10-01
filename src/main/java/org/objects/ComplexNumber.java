package org.objects;

public class ComplexNumber {
    private double realPart ,imaginaryPart;
    public ComplexNumber (double realPart , double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    public double getRealPart(){
        return realPart;
    }
    public double getImaginaryPart(){
        return imaginaryPart;
    }
    public void add (double realPart , double imaginaryPart){
        this.realPart = this .realPart + realPart;  //one -
        this.imaginaryPart = this.imaginaryPart + imaginaryPart;
    }
    public void add (ComplexNumber numbers){
        this.realPart = numbers.realPart + this.realPart;
        this.imaginaryPart = numbers.imaginaryPart + this.imaginaryPart;
    }
    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(6,5);  //6.0  5.0
        ComplexNumber numbers = new ComplexNumber(12,3);  // 12.0  3.0
        one.add(1.5 , 2.5);   //7.5  7.5
        System.out.println("one.realPart = " + one.getRealPart());   //7.5
        System.out.println("one.imaginaryPart = " + one.getImaginaryPart());   //7.5
        one.add(numbers);   //19.5  10.5
        System.out.println("one.realPart = " + one.getRealPart());  //19.5
        System.out.println("one.imaginaryPart = " + one.getImaginaryPart());  //10.5
        numbers.add(numbers);   //24.0  6.0
        System.out.println("numbers.realPart = " + numbers.getRealPart());  //24.0
        System.out.println("numbers.imaginaryPart = " + numbers.getImaginaryPart());  //6.0
        numbers.add(1.5 , 1.5);  //25.5  //7.5
        System.out.println("numbers.realPart = " + numbers.getRealPart());  //25.5
        System.out.println("numbers.imaginaryPart = " + numbers.getImaginaryPart());   //7.5


    }
}
