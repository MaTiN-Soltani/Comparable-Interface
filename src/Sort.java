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
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j].compare(list[j+1]) == 1)
                {
                    Comparable<T> temp;
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    flag = 0;
                }
            }
            if (flag == 1)
                break;
        }
    }
}
