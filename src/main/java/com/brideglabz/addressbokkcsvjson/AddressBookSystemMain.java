package com.brideglabz.addressbokkcsvjson;

import java.io.IOException;

public class AddressBookSystemMain {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to the Address book System by using IO.");
        Operations operations = new Operations();
        System.out.println("-----------------------------*****-------------------------");
        operations.AddressBook(operations);
    }
}
