package lesson;

public class Main {
	public static void main(String[] args) {
        Person person = new Person();
        
        person.setName("まどか");

        // Nullオブジェクトのメンバー変数にアクセスし、NullPointerExceptionを引き起こす
        System.out.println("名前: " + person.getName());
        System.out.println("年齢: " + person.getAge());
    }
}
