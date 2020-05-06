public class Flat {
    private String district;
    private String address;
    private String area;
    private int room;
    private String price;

    public Flat() {

    }

    public Flat(String district, String address, String area, int room, String price) {
        this.district = district;
        this.address = address;
        this.area = area;
        this.room = room;
        this.price = price;
    }


    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "district='" + district + '\'' +
                ", address='" + address + '\'' +
                ", area='" + area + '\'' +
                ", room=" + room +
                ", price='" + price + '\'' +
                '}' + "\n";
    }
}
