package lesson;

public class Main {
	public static void main(String[] args) {
        Person person = new Person();
        
        person.setName("�܂ǂ�");

        // Null�I�u�W�F�N�g�̃����o�[�ϐ��ɃA�N�Z�X���ANullPointerException�������N����
        System.out.println("���O: " + person.getName());
        System.out.println("�N��: " + person.getAge());
    }
}
