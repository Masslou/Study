package homework.hw9.enteties;

import homework.hw9.dateutil.DateUtil;

import java.io.Serializable;
import java.util.Objects;

public class Record implements Serializable, Cloneable {
    private final long id;
    private String phone;
    private String name;
    private String address;
    private String date;

    public Record(long id, String phone, String name, String address, String date) {
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.address = address;
        this.date = date;
    }


    @Override
    public String toString() {
        return "id: " + id + ", Номер телефона:" + phone + '\'' + ", ФИО: " + name + '\'' + ", Адрес: " + address + '\'' +
                ", Дата записи: " + date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record record = (Record) o;
        return id == record.id &&
                Objects.equals(phone, record.phone) &&
                Objects.equals(name, record.name) &&
                Objects.equals(address, record.address) &&
                Objects.equals(date, record.date);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, phone, name, address, date);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public long getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDate() {
        return date;
    }

}
