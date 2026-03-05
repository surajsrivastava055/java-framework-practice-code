package com.gyan.byname;

public class Information {
    private int id;
    private String info;

    public Information() {
        System.out.println("Information class default Constructor Called..");
    }

    public Information(int id, String info) {
        System.out.println("Information class 2 argument Constructor Called..");
        this.id = id;
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Information class  id:"+id+" Setter Called..");
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        System.out.println("Information class  info:"+info+" Setter Called..");
        this.info = info;
    }

    @Override
    public String toString() {
        return "Information{" +
                "id=" + id +
                ", info='" + info + '\'' +
                '}';
    }
}
