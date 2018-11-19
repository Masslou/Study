package homework.hw9.storage;

import homework.hw9.dateutil.DateUtil;
import homework.hw9.enteties.Record;
import org.w3c.dom.ranges.RangeException;

import java.util.*;

public class AddressBook {
    private Map<Long, Record> records = new HashMap<Long, Record>();
    private long nextId;

    private long getNextId() {
        if (nextId < Long.MAX_VALUE && !records.containsKey(nextId))
            return nextId++;
        nextId = 0;
        while (nextId < Long.MAX_VALUE) {
            if (!records.containsKey(nextId))
                return nextId;
            ++nextId;
        }
        throw new RangeException((short) 111, "No more IDs availiable");
    }

    public void showAllPersonPhoneBookOrderByName() {
        Comparator<Map.Entry<Long, Record>> sort;

        sort = Comparator.comparing(el -> el.getValue().getName());
        isEmptyPhoneBook();

        records.entrySet().stream()
                .sorted(sort)
                .forEach(el -> System.out.println(el.getValue()));


    }

    public boolean isEmptyPhoneBook() {
        boolean isEmptyPhoneBook = records.size() == 0;
        if (isEmptyPhoneBook) System.out.println("---Телефонная книга пуста----");
        return isEmptyPhoneBook;
    }


    public Record addRecord(String phone, String name, String address)
            throws CloneNotSupportedException {
        long recordId = getNextId();
        DateUtil dateUtil = new DateUtil();
        Record record = new Record(recordId, phone, name, address, dateUtil.getLocalDateTime().toString());
        records.put(recordId, record);
        return (Record) record.clone();
    }

    public Record getRecord(long id) throws CloneNotSupportedException {
        if (records.containsKey(id))
            return (Record) records.get(id).clone();
        return null;
    }

    public Record updateRecord(long id, String phone, String name, String address)
            throws CloneNotSupportedException {

        DateUtil dateUtil = new DateUtil();
        Record record = new Record(id, phone, name, address, dateUtil.getLocalDateTime().toString());
        records.put(id, record);
        return getRecord(id);
    }

    public void removeRecord(long id) {
        records.remove(id);
    }

    public List<Record> allRecords() {
        List<Record> result = new ArrayList<Record>();
        for (Record record : this.records.values())
            result.add(record);
        return result;
    }
}
