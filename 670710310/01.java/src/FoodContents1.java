import java.util.Scanner;
class Food {
    String foodName;
    String content;
    int w;

    Food(String foodName, String content1, int w1){
        this.foodName = foodName;
        this.content = content1;
        this.w = w1;
    }
    void addcontent(String content,int w){
        this.content += " " + content;
        this.w += w;
    }
    void printinfo(){
        System.out.println(this.foodName);
        System.out.println(this.w);
        System.out.println(this.content);
    }
}

public class FoodContents1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String foodName = scan.next();
        String content1 = scan.next();
        int w1 = scan.nextInt();
	
        Food fd = new Food(foodName,content1,w1);
        int q = scan.nextInt();
        while (q != 0) {
            if(q == 1){
                fd.printinfo();
            }
            else if(q == 2){
                String content = scan.next();
                int w = scan.nextInt();
                fd.addcontent(content, w);
            }
            q = scan.nextInt();
        }
    }
}