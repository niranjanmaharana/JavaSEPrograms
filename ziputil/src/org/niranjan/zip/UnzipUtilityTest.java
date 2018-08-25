package org.niranjan.zip;

public class UnzipUtilityTest {

	public static void main(String[] args) {
        String zipFilePath = "D:/test/project.zip";
        String destDirectory = "D:/test/project";
        UnzipUtility unzipper = new UnzipUtility();
        try {
            unzipper.unzip(zipFilePath, destDirectory);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}