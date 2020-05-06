import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlatDaoImpl implements FlatDao {
    private final Connection conn;

    public FlatDaoImpl(Connection conn) {
        super();
        this.conn = conn;
    }

    @Override
    public List<Flat> findFlatForDistrict(String district) {
        List<Flat> res = new ArrayList<>();
        try {
            PreparedStatement st = conn.prepareStatement("SELECT * FROM flats WHERE district='" + district + "'");
            ResultSet resultSet = st.executeQuery();
            while (resultSet.next()) {
                Flat flat = new Flat();
                flat.setRoom(resultSet.getInt("room"));
                flat.setAddress(resultSet.getString("address"));
                flat.setArea(resultSet.getString("area"));
                flat.setPrice(resultSet.getString("price"));
                flat.setDistrict(resultSet.getString("district"));
                res.add(flat);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public List<Flat> findFlatForAddress(String address) {

        List<Flat> res = new ArrayList<>();
        try {
            PreparedStatement st = conn.prepareStatement("SELECT * FROM flats WHERE address='" + address + "'");
            ResultSet resultSet = st.executeQuery();
            while (resultSet.next()) {
                Flat flat = new Flat();
                flat.setRoom(resultSet.getInt("room"));
                flat.setAddress(resultSet.getString("address"));
                flat.setArea(resultSet.getString("area"));
                flat.setPrice(resultSet.getString("price"));
                flat.setDistrict((resultSet.getString("district")));
                res.add(flat);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public List<Flat> findFlatForArea(String area) {
        List<Flat> res = new ArrayList<>();
        try {
            PreparedStatement st = conn.prepareStatement("SELECT * FROM flats WHERE area='" + area + "'");
            ResultSet resultSet = st.executeQuery();

            while (resultSet.next()) {
                Flat flat = new Flat();
                flat.setRoom(resultSet.getInt("room"));
                flat.setAddress(resultSet.getString("address"));
                flat.setArea(resultSet.getString("area"));
                flat.setPrice(resultSet.getString("price"));
                flat.setDistrict(resultSet.getString("district"));
                res.add(flat);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public List<Flat> findFlatForRooms(int room) {
        List<Flat> res = new ArrayList<>();
        try {
            PreparedStatement st = conn.prepareStatement("SELECT * FROM flats WHERE room='" + room + "'");
            ResultSet resultSet = st.executeQuery();
            while (resultSet.next()) {
                Flat flat = new Flat();
                flat.setRoom(resultSet.getInt("room"));
                flat.setAddress(resultSet.getString("address"));
                flat.setArea(resultSet.getString("area"));
                flat.setPrice(resultSet.getString("price"));
                flat.setDistrict(resultSet.getString("district"));
                res.add(flat);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public List<Flat> findFlatForPrice(String price) {
        List<Flat> res = new ArrayList<>();
        try {
            PreparedStatement st = conn.prepareStatement("SELECT * FROM flats WHERE price='" + price + "'");
            ResultSet resultSet = st.executeQuery();
            while (resultSet.next()) {
                Flat flat = new Flat();
                flat.setRoom(resultSet.getInt("room"));
                flat.setAddress(resultSet.getString("address"));
                flat.setArea(resultSet.getString("area"));
                flat.setPrice(resultSet.getString("price"));
                flat.setDistrict(resultSet.getString("district"));
                res.add(flat);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public List<Flat> showAllFlat(){
        List<Flat> res = new ArrayList<>();
        try {
            PreparedStatement st = conn.prepareStatement("SELECT * FROM flats");
            ResultSet resultSet = st.executeQuery();
            while (resultSet.next()) {
                Flat flat = new Flat();
                flat.setDistrict(resultSet.getString("district"));
                flat.setPrice(resultSet.getString("price"));
                flat.setArea(resultSet.getString("area"));
                flat.setRoom(resultSet.getInt("room"));
                flat.setAddress(resultSet.getString("address"));
                res.add(flat);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return res;
    }
}
