import java.util.List;

public interface FlatDao {
    List<Flat> findFlatForDistrict(String district);
    List<Flat>  findFlatForAddress(String address);
    List<Flat>  findFlatForArea(String area);
    List<Flat>  findFlatForRooms(int room);
    List<Flat>  findFlatForPrice(String price);
    List<Flat> showAllFlat();
}
