public class Sort<T> {
    private Comparable<T>[] list;
    
    public void setList(Comparable<T>[] list) {
        this.list = list;
    }
    public Comparable<T>[] getList() {
        return list;
    }

    public void operate()
    {
        int flag = 0;
        for (int i = 0; i < list.length; i++) {
            flag = 1;
            for (int j = i + 1; j < list.length; j++) {
                if (list[i].compare(list[j]) == 1)
                {
                    Comparable<T> temp;
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                    flag = 0;
                }
            }
            if (flag == 1)
                break;
        }
    }
}
