package model;

public class Disc {

    private DataBase[] arr = DataBase.values();


    public long calculateDuration() {
        long res = 0;
        for (DataBase i : arr) {
            res += i.getDuration();
        }
        return res;
    }

    public void bubbleSortToStyle() {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].getStyle().toString().charAt(0)
                        > arr[i + 1].getStyle().toString().charAt(0)) {
                    DataBase temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    public String findByDiapasonDuration(long first, long second) {
        StringBuilder stringBuilder = new StringBuilder("[ ");
        for (DataBase i : arr) {
            if (i.getDuration() > first && i.getDuration() < second)
                stringBuilder.append(i.toString()).append(" ");
        }
        return stringBuilder.append("]").toString();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[ ");
        for (DataBase i : arr) {
            stringBuilder.append(i.toString()).append(" ");
        }
        return stringBuilder.append("]").toString();
    }

}
