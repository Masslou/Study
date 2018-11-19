package homework.hw8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CollectionsNums<T> {

    private T number;

    private List<CollectionsNums<? super CollectionsNums>> listCollectionsNums = new ArrayList<>();


    public CollectionsNums() {

    }

    private CollectionsNums(T num) {
        this.number = num;
    }

    public List<? extends CollectionsNums> getListBoxNumber() {
        return listCollectionsNums;
    }

    public T getNum() {
        return number;
    }

    public void addList(CollectionsNums<? super CollectionsNums> collectionsNums) {
        listCollectionsNums.add(collectionsNums);
    }


    public void printNumber(List<? extends CollectionsNums> list) {
        for (CollectionsNums integer :
                list) {
            System.out.println(integer.getNum());
        }
    }


    public void addNumberList(List<? super CollectionsNums> list, T num) {
        list.add(new CollectionsNums(num));
    }


    public static void main(String[] args) {
        CollectionsNums collectionsNums = new CollectionsNums();
        List listCollectionsNum = collectionsNums.getListBoxNumber();

        collectionsNums.addList(new CollectionsNums(new Float(5.0)));


        collectionsNums.addNumberList(listCollectionsNum, new Integer(1));
        collectionsNums.addNumberList(listCollectionsNum, new Long((200L)));
        collectionsNums.addNumberList(listCollectionsNum, new BigDecimal("100.00"));
        collectionsNums.addNumberList(listCollectionsNum, new Double(10.00));

        collectionsNums.printNumber(collectionsNums.getListBoxNumber());

    }
}
