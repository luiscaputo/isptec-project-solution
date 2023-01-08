package infra.databaseFile;

import java.io.File;
import java.io.IOException;

public class SaveFile {
  public int createFile(String fileName, Object data) {
    try {
      File file = new File("D:MarketFile.txt");
      return file;
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
