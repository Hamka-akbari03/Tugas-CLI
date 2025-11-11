package Tugas_CLI;

public class InputMenu extends BaseMenu {
    private UserService userService;

    public InputMenu(UserService userService) {
        this.userService = userService;
    }

    @Override
    protected void printTitle() {
        System.out.println("\n=== Input Data Pengguna ===");
    }

    @Override
    public void show() {
        printTitle();
        String name = input("Masukkan Nama");
        String email = input("Masukkan Email");
        userService.addUser(name, email);
        System.out.println("✅ Data berhasil disimpan!\n");
    }

    @Override
    public void handleInput(int choice) {
        // Tidak digunakan di sini
    }
}
