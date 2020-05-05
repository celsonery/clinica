/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.util;

import com.dropbox.core.DbxAccountInfo;
import com.dropbox.core.DbxAppInfo;
import com.dropbox.core.DbxAuthFinish;
import com.dropbox.core.DbxClient;
import com.dropbox.core.DbxEntry;
import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.DbxWebAuthNoRedirect;
import com.dropbox.core.DbxWriteMode;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author celso
 */
public class JavaDropbox {

    private static final String DROP_BOX_APP_KEY = "xxxxxxxxxxxxxx";
    private static final String DROP_BOX_APP_SECRET = "xxxxxxxxxxxxxxx";

    DbxClient dbxClient;

    public DbxClient authDropbox() throws IOException, DbxException {
        String dropBoxAppKey = DROP_BOX_APP_KEY;
        String dropBoxAppSecret = DROP_BOX_APP_SECRET;

        DbxAppInfo dbxAppInfo = new DbxAppInfo(dropBoxAppKey, dropBoxAppSecret);
        DbxRequestConfig dbxRequestConfig = new DbxRequestConfig("Clinica", Locale.getDefault().toString());
        DbxWebAuthNoRedirect dbxWebAuthNoRedirect = new DbxWebAuthNoRedirect(dbxRequestConfig, dbxAppInfo);
        String authorizeUrl = dbxWebAuthNoRedirect.start();
        String dropboxAuthCode = JOptionPane.showInputDialog(null, "Autorize o sistema a acessar seu Dropbox, acesse:\n "+ authorizeUrl +" \ne cole o código aqui.", "AUTORIZAÇÃO DROPBOX", JOptionPane.INFORMATION_MESSAGE).trim();
        //String dropboxAuthCode = "UibI9LUNe_AAAAAAAAABuA_Kx6Nb6WunlXthAK0nzg8";
        //System.out.println("1. Authorize: Go to URL and Click Allow: " + authorizeUrl);
        //System.out.println("2. Auth Code: Copy authorization code and input here ");
        //String dropboxAuthCode = new BufferedReader(new InputStreamReader(System.in)).readLine().trim();
        DbxAuthFinish authFinish = dbxWebAuthNoRedirect.finish(dropboxAuthCode);
        String authAccessToken = authFinish.accessToken;
        dbxClient = new DbxClient(dbxRequestConfig, authAccessToken);
        System.out.println("Dropbox Account Name: " + dbxClient.getAccountInfo().displayName);
        return dbxClient;
    }

    public String getAccountName() throws DbxException{
        return dbxClient.getAccountInfo().displayName;
    }
    
    public long getDroboxSize() throws DbxException {
        long dropboxSize;
        DbxAccountInfo dbxAccountInfo = dbxClient.getAccountInfo();
        dropboxSize = dbxAccountInfo.quota.total / 1024 / 1024 / 1024;
        return dropboxSize;
    }

    public int uploadToDropbox(String fileName){
        FileInputStream fis = null;
        try {
            File inputFile = new File(fileName);
            fis = new FileInputStream(inputFile);
            DbxEntry.File uploadedFile = dbxClient.uploadFile("/" + fileName, DbxWriteMode.add(), inputFile.length(), fis);
            String shareUrl = dbxClient.createShareableUrl("/" + fileName);
            System.out.println("Uploaded: " + uploadedFile.toString() + "URL " + shareUrl);
            return 1;
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Arquivo não encotrado!");
        } catch (DbxException ex) {
            return 0;
        } catch (IOException ex) {
            System.out.println("Erro de IO");
            return 0;
        } finally {
            try {
                if(fis != null){
                    fis.close();
                }
            } catch (IOException ex) {
                System.out.println("Erro ao fechar Stream");
            }
        }
        return 0;
    }

    public void createFolder(String folderName) throws DbxException {
        dbxClient.createFolder("/" + folderName);
    }

    public void listDropboxFolders(String folderPath) throws DbxException {
        DbxEntry.WithChildren listing = dbxClient.getMetadataWithChildren(folderPath);
        System.out.println("Files List: ");
        for (DbxEntry child : listing.children) {
            System.out.println(" - " + child.name + ": " + child.toString());
        }
    }

    public void downloadFromDropbox(String fileName) throws DbxException, IOException {
        FileOutputStream outputStream = new FileOutputStream(fileName);

        try {
            DbxEntry.File downloadedFile = dbxClient.getFile("/" + fileName, null, outputStream);
            System.out.println("Metadata: " + downloadedFile.toString());
        } finally {
            outputStream.close();
        }
    }
    
    public int removeFile(String fileName){
        try {
            dbxClient.delete("/" + fileName);
            return 1;
        } catch (DbxException ex) {
            return 0;
        }
       
    }
}
