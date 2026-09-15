public class TestBall {
    public static void main(String[] args){
        Ball ball = new Ball(5.0, 10.0);
        Ball ball2 = new Ball();

        System.out.println("Начальная позиция:");
        System.out.print("x: " + ball.getX()+ " ");
        System.out.println("y: " + ball.getY());

        ball.setX(20.0);
        ball.setY(30.0);

        System.out.println("После set:");
        System.out.print("x:  " + ball.getX() + " ");
        System.out.println("y: " + ball.getY());

        ball.move(3.0, 4.0);

        System.out.println("После 1 move:");
        System.out.print("x: " + ball.getX() + " ");
        System.out.println("y: " + ball.getY());

        ball.move(-5.0, -8.0);

        System.out.println("После 2 move:");
        System.out.print("x: " + ball.getX() + " ");
        System.out.println("y: " + ball.getY());
    }
    
}
