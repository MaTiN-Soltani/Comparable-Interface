public class Sort<T> {
    private Comparable<T>[] list;
//====================================================================  
    public void setList(Comparable<T>[] list) {
        this.list = list;
    }
    public Comparable<T>[] getList() {
        return list;
    }

//====================================================================
    public void operate()
    {
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i].compare(list[j]) == 1)
                {
                    Comparable<T> temp;
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
}
