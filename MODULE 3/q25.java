import java.util.*;
class StudentMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        map.put(101, "John");
        map.put(102, "Alice");
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.println("Name: " + map.getOrDefault(id, "Not found"));
    }
}