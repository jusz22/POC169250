package pl.edu.uwm.a2;

public abstract class ComputerGraphic {
    int width;
    int height;
    String fileName;

    abstract void loadFile();

    abstract void saveFile();
}
