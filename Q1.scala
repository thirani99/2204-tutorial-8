object Q1 extends App{

    val p1 = Point(5,6);
    val p2 = Point(4,9);

    val p3 = p1+p2;
    val p4 = p1.move(3,1);
    val x = p1.distance(p2);
    val p5 = p1.invert();

    println("\nADD function");
    println(p3);
    println("\nMove function");
    println(p4);
    println("\nDistance between two given points");
    println(x);
    println("\nInvert x and y coordinates");
    println(p5);


}

case class Point(x:Int, y:Int){

    //add funtion
    def +(that:Point) = Point(this.x+that.x,this.y+that.y)

    //move function
    def move(dx:Int,dy:Int) = Point(this.x+dx,this.y+dy)

    //distance between two given points
    def distance(that:Point):Double = scala.math.sqrt((this.x-that.x)*(this.x-that.x) + (this.y-that.y)*(this.y-that.y))

    //invert x and y coordinates
    def invert() = Point(this.y,this.x)

}
