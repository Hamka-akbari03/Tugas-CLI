package Tugas_CLI;

public class Menu extends BaseMenu {
    private UserService userService;

    public Menu() {
        // Composition: MainMenu memiliki UserService
        this.userService = new UserService();
    }

    @Override
    protected void printTitle() {
        System.out.println("==== MENU UTAMA ====");
    }

    @Override
    public void show() {
        int choice;
        do {
            printTitle();
            System.out.println("1. Input Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("❌ Input tidak valid, masukkan angka!\n");
                choice = -1;
                continue;
            }

            handleInput(choice);
        } while (choice != 3);
    }

    @Override
    public void handleInput(int choice) {
        switch (choice) {
            case 1 -> new InputMenu(userService).show();
            case 2 -> new ViewMenu(userService).show();
            case 3 -> System.out.println("👋 Keluar dari program...");
            default -> System.out.println("❌ Pilihan tidak valid!\n");
        }
    }
}

