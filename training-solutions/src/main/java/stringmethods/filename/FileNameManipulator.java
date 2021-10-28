package stringmethods.filename;

public class FileNameManipulator {

    public char findLastCharacter (String str){
        return str.charAt(str.length()-1);
    }

    public String findFileExtension (String fileName){
        return fileName.substring(fileName.indexOf(".")+1);
    }

    public boolean identifyFilesByExtension (String ext, String fileName){
        return ext.equals(findFileExtension(fileName));
    }

    public boolean compareFilesByName (String searchedFileName, String actualFileName){
        return searchedFileName.substring(0,searchedFileName.indexOf(".")).equals(actualFileName.substring(0,actualFileName.indexOf(".")));
    }

    public String changeExtensionToLowerCase (String fileName){
        return this.findFileExtension(fileName).toLowerCase();
    }

    public String replaceStringPart (String filename, String present, String target){
        return filename.replace(present,target);
    }

    public static void main(String[] args) {

        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        System.out.println(fileNameManipulator.findLastCharacter("John"));
        System.out.println(fileNameManipulator.findFileExtension("something.txt"));
        System.out.println(fileNameManipulator.identifyFilesByExtension("exe","pc.exe"));
        System.out.println(fileNameManipulator.compareFilesByName("scv.txt","scv.exe"));
        System.out.println(fileNameManipulator.changeExtensionToLowerCase("something.TXT"));
        System.out.println(fileNameManipulator.replaceStringPart("something","thing","body"));
    }
}
