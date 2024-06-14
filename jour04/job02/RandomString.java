package job02;

import java.util.Random;
import java.io.FileOutputStream;
import java.io.IOException;


public class RandomString{
    FileOutputStream fileOut;

    public RandomString(FileOutputStream fileOut) {
        this.fileOut = fileOut;
    }

    public void appendRandomCharacter() {
        char randomCharacter = (char) (33 + new Random().nextInt(94));
        try {
            this.fileOut.write(randomCharacter);
        } catch (IOException e) {};
    }
}