/**
 * @program: 0424
 * @description
 * @author: matilda
 * @create: 2020-04-24 13:49
 **/
public class TestDemo {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);
        myLinkedList.addLast(6);
        myLinkedList.display();//

        System.out.println(myLinkedList.middleNode().data);

        /*Node ret = myLinkedList.reverseList();
        myLinkedList.display2(ret);*/

        /*System.out.println("删除开始:");
        myLinkedList.removeAllKey(81);
        myLinkedList.display();//*/
        /*boolean flg =  myLinkedList.contains(78);
        System.out.println(flg);*/
        /*System.out.println(myLinkedList.contains(78));
        System.out.println(myLinkedList.size());*/
    }
}
