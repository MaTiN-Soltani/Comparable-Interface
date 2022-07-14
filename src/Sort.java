public class Sort {
    private Comparable[] list;
    
    public void setList(Comparable[] list) {
        this.list = list;
    }
    public Comparable[] getList() {
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
                    Comparable temp;
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
