package org.example.Strategy;

import java.io.File;

public class FileAuth implements AuthStrategy{
    private File file;

    public FileAuth (File file) {
        this.file = file;
    }


    @Override
    public boolean checkAuth(String name, String pass) {
        System.out.println("Check with file ... ");
        return checkFromFile();
    }

    private boolean checkFromFile(){
        return true;
    }

}
