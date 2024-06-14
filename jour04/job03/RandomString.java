package job03;

import java.util.Random;
import java.io.FileOutputStream;
import java.io.IOException;


public class RandomString extends Thread{
    FileOutputStream fileOut;
    int numberOfCharacters;

    public RandomString(FileOutputStream fileOut, int numberOfCharacters) {
        this.fileOut = fileOut;
        this.numberOfCharacters = numberOfCharacters;
    }

    @Override
    public void run() {
        for (int i = 0; i < numberOfCharacters; i++) {
            char randomCharacter = (char) (33 + new Random().nextInt(94));
            try {
                this.fileOut.write(randomCharacter);
            } catch (IOException e) {};
        }
    }
}