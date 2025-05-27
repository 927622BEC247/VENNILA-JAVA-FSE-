class StudentDAO {
    private Connection conn;

    public StudentDAO(Connection conn) {
        this.conn = conn;
    }

    public void insertStudent(String name, int age) throws SQLException {
        PreparedStatement pstmt = conn.prepareStatement("INSERT INTO students(name, age) VALUES(?, ?)");
        pstmt.setString(1, name);
        pstmt.setInt(2, age);
        pstmt.executeUpdate();
    }

    public void updateStudent(String name, int newAge) throws SQLException {
        PreparedStatement pstmt = conn.prepareStatement("UPDATE students SET age = ? WHERE name = ?");
        pstmt.setInt(1, newAge);
        pstmt.setString(2, name);
        pstmt.executeUpdate();
    }
}
