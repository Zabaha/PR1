package TestBall;

public class TestBall {

    public static void main(String[] args) {
        int length = 4;
        Ball[] arr = new Ball[length];
        arr[0] = new Ball("Футбольный", "Белый");
        arr[1] = new Ball("Футбольный");
        arr[2] = new Ball("Баскетбольный", "Коричневый");
        arr[3] = new Ball();
        arr[3].setType("Волейбольный");
        arr[1].setColor("Желтый");
        System.out.println(arr[3].getType());
        System.out.println(arr[1].getColor());
        for (int i = 0; i < length; i++) {
            System.out.println(arr[i].toStr());
        }
        Ball.searchOfBall("Футбольный", arr, 4);
        Ball.searchOfBall("Тенисный", arr, 4);
    }
}
