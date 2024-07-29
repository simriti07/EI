/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filesystem;

/**
 *
 * @author DELL
 */
public class FileSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create files
        File file1 = new File("file1.txt", 1000);
        File file2 = new File("file2.txt", 2000);
        File file3 = new File("file3.txt", 3000);

        // Create directories and add files
        Directory dir1 = new Directory("dir1");
        dir1.addComponent(file1);
        dir1.addComponent(file2);

        Directory dir2 = new Directory("dir2");
        dir2.addComponent(file3);

        Directory rootDir = new Directory("root");
        rootDir.addComponent(dir1);
        rootDir.addComponent(dir2);

        // Show details of the root directory
        rootDir.showDetails();

        // Get total size of the root directory
        long totalSize = rootDir.getSize();
        System.out.println("Total size: " + totalSize + " bytes");
    }
    
}
