package Objects;

import java.io.Serializable;
import java.util.ArrayList;

public class DataForCinema implements Serializable {
    private static final long serialVersionUID = 1L;
    private ArrayList<Cinema> dataList;

    public DataForCinema(ArrayList<Cinema> listCinema) {
        this.dataList = listCinema;
    }

    public ArrayList<Cinema> getDataList() {
        return dataList;
    }

    public void setDataList(ArrayList<Cinema> dataList) {
        this.dataList = dataList;
    }
}
