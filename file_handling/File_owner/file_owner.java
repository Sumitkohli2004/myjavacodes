package File_owner;

import java.util.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;

public class file_owner {
    public static void main(String[] args) throws IOException {
        String path = "C:/Users/DELL/Documents/ColectionFrameWork/file_handling/File_owner/owner.txt";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the path here - ");
        String A = sc.nextLine();
        Path p = Path.get(A);

        FileOwnerAttributeView view = Files.getFileAttributeView(p, FileOwnerAttributeView.class);

        UserPrincipal userPrincipal = view.getOwner();
        System.out.println("Owner of the file is :" + userPrincipal.getName());

    }
}
