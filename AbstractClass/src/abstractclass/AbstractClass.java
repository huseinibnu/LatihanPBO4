/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractclass;

/**
 *
 * @author ASUS
 */
public class AbstractClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // membuat objek dari class Triangle
        Shape segitiga = new Triangle(4, 5);

        // membuat objek dari class Circle
        Shape lingkaran = new Circle(10);
        
        
        System.out.println("Luas Segitiga: " + segitiga.getArea());
        System.out.println("Luas Lingkaran: " + lingkaran.getArea());
    }
    
    public static abstract class Shape {

        String color;

        void setColor(String color){
            this.color = color;
        }

        String getColor(){
            return this.color;
        }

        abstract float getArea();
    }
    
    public static class Triangle extends Shape {

        private float base;
        private float height;

        public Triangle(int base, int height) {
            this.base = base;
            this.height = height;
        }


        @Override
        float getArea() {
            return 0.5f * base * height;
        }

    }
    
    private static class Circle extends Shape {

        private float radius;

        public Circle(float radius) {
            this.radius = radius;
        }


        @Override
        float getArea() {
            return (float) (Math.PI * radius * radius);
        }

    }
}
