package com.praktikum.main;

import com.praktikum.users.Admin;
import com.praktikum.users.Mahasiswa;
import com.praktikum.users.Users;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sementara hardcoded user
        Admin admin = new Admin("admin", "admin123");
        Mahasiswa mhs = new Mahasiswa("widyaamelia", "widya123");

        System.out.println("=== Sistem Login ===");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        Users currentUser = null;

        if (admin.login(username, password)) {
            currentUser = admin;
        } else if (mhs.login(username, password)) {
            currentUser = mhs;
        } else {
            System.out.println("Login gagal. Username atau password salah.");
            return;
        }

        System.out.println("Login berhasil sebagai " + currentUser.getClass().getSimpleName());
        currentUser.displayAppMenu(); // Polymorphic call
    }
}
