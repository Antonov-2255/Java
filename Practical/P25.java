class Shape 
{
    public void draw() 
    {
        System.out.println("Drawing a shape");
    }

    public void erase() 
    {
        System.out.println("Erasing a shape");
    }
}


class Circle extends Shape 
{

    public void draw() 
    {
        System.out.println("Drawing a circle");
    }

 
    public void erase() 
    {
        System.out.println("Erasing a circle");
    }
}


class Triangle extends Shape 
{

    public void draw() 
    {
        System.out.println("Drawing a triangle");
    }

    public void erase() 
    {
        System.out.println("Erasing a triangle");
    }
}

class Square extends Shape 
{
    public void draw() 
    {
        System.out.println("Drawing a square");
    }

    public void erase() 
    {
        System.out.println("Erasing a square");
    }
}

class Test 
{
    public static void main(String[] args) 
    {

        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape square = new Square();

        circle.draw();
        circle.erase();

        triangle.draw();
        triangle.erase();

        square.draw();
        square.erase();
    }
}
