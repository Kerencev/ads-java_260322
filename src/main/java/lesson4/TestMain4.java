package lesson4;

public class TestMain4 {

    public static void main(String[] args) {
        //Проверка итератора
//        testHomeWork();

        //Тест LinkedDeque
        LinkedDeque<Integer> list = new LinkedDeque<>();
        list.insertLeft(1);
        list.insertLeft(2);
        list.insertLeft(3);
        list.insertRight(4);
        list.removeLeft();
        list.removeRight();
        list.display();
    }

    private static void testHomeWork() {

        SimpleLinkedListImpl<Integer> linkedList = new SimpleLinkedListImpl<>();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertFirst(5);

        //ДОЛЖНО РАБОТАТЬ!
        for (Integer value : linkedList) {
            System.out.println("value: " + value);
        }
    }
}
