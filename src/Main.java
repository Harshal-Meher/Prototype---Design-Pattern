public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Creating Prototype Design Pattern");
        NetworkConnection networkConnection = new NetworkConnection();
        NetworkConnection networkConnection1 = null;
        NetworkConnection networkConnection2 = null;

        networkConnection.setIp("198.160.4.5");
        networkConnection.loadData();

        try {
            networkConnection1 = (NetworkConnection) networkConnection.clone();
            networkConnection2 = (NetworkConnection) networkConnection.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
//      networkConnection.setData("Not IP DATA");
        System.out.println(networkConnection);
        System.out.println(networkConnection1);
        System.out.println(networkConnection2);

    }
}