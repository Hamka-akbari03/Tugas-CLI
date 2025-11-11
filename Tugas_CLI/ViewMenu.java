package Tugas_CLI;

public class ViewMenu extends BaseMenu {
    private UserService userService;

    public ViewMenu(UserService userService) {
        this.userService = userService;
    }

    @Override
    protected void printTitle() {
        System.out.println("\n=== Lihat Data Pengguna ===");
    }

    @Override
    public void show() {
        printTitle();
        if (userService.isEmpty()) {
            System.out.println("⚠️  Belum ada data yang dimasukkan.\n");
        } else {
            userService.getAllUsers().forEach(user ->
                    System.out.println("- " + user)
            );
            System.out.println();
        }
    }

    @Override
    public void handleInput(int choice) {
        // Tidak digunakan
    }
}

