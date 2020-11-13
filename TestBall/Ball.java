package TestBall;

public class Ball {
    private String type;
    private String color;

    public Ball(){
        type = "unknown";
        color = "unknown";
    }
    public Ball(String type){
        this.type = type;
        color = "unknown";
    }
    public Ball(String type, String color){
        this.type = type;
        this.color = color;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getType(){
        return type;
    }
    public String getColor(){
        return color;
    }

    public String toStr(){
        return "Тип мяча: " + type + " цвет: " + color;
    }
    public static void searchOfBall(String someType, Ball[] arr, int length){
        boolean err = true;
        for (int i = 0; i < length; i++){
            if (someType.equals(arr[i].type)){
                System.out.println(arr[i].toStr());
                err = false;
            }
        }
        if (err){
            System.out.println("Ошибка");
        }
    }
}
