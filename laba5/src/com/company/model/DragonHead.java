package com.company.model;

public class DragonHead  implements Comparable<DragonHead>{
    private Integer size;

    @Override
    public int compareTo(DragonHead o) {
        return size - o.size;
    }

    public Integer getSize() {
        return size;
    }

    public DragonHead(Integer size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "DragonHead{" +
                "size=" + size +
                '}';
    }
}
