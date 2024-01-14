import java.io.*;

public class FileOperations {
    public static void main(String[] args) {
        try {
            // Task 1 and 2: Create and write to readme.txt
            String readmeFilePath = "D:/Utsav/Java/lab 14/readme.txt";
            writeToFile(readmeFilePath, "This is a readme file. You have all the information here.");

            // Task 3 and 4: Read the file and display size and path
            readAndDisplayFileInfo(readmeFilePath);

            // Task 5: Delete the file
            deleteFile(readmeFilePath);

            // Task 6: Character stream example
            String originalFilePath = "original.txt";
            String copyFilePath = "copy.txt";
            writeToFile(originalFilePath, "This is a file for copy example");
            copyFileUsingCharacterStream(originalFilePath, copyFilePath);

            // Task 7: Byte stream example
            String byteFilePath = "byteExample.txt";
            writeToFileUsingByteStream(byteFilePath, "Hello, this is a byte stream example.");
            readAndDisplayFileContent(byteFilePath);

            // Task 8: Serialization and deserialization
            String serializedFilePath = "serializedStudent.dat";
            Student student = new Student("Utsav", 23, "Computer Science");
            serializeObject(student, serializedFilePath);
            Student deserializedStudent = (Student) deserializeObject(serializedFilePath);
            System.out.println("Deserialized Student: " + deserializedStudent);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Task 1 and 2
    private static void writeToFile(String filePath, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        }
    }

    // Task 3 and 4
    private static void readAndDisplayFileInfo(String filePath) {
        File file = new File(filePath);
        System.out.println("File Size: " + file.length() + " bytes");
        System.out.println("File Path: " + file.getAbsolutePath());
    }

    // Task 5
    private static void deleteFile(String filePath) {
        File file = new File(filePath);
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    // Task 6
    private static void copyFileUsingCharacterStream(String sourcePath, String destinationPath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationPath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File copied successfully using character stream.");
        }
    }

    // Task 7
    private static void writeToFileUsingByteStream(String filePath, String content) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            byte[] bytes = content.getBytes();
            fos.write(bytes);
        }
    }

    // Task 7
    private static void readAndDisplayFileContent(String filePath) throws IOException {
        try (FileInputStream fis = new FileInputStream(filePath)) {
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
            System.out.println("\nFile read successfully using byte stream.");
        }
    }

    // Task 8
    private static void serializeObject(Object object, String filePath) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(object);
        }
        System.out.println("Object serialized successfully.");
    }

    // Task 8
    private static Object deserializeObject(String filePath) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return ois.readObject();
        }
    }

    // Task 8 - Student class for serialization
    static class Student implements Serializable {
        private String name;
        private int age;
        private String department;

        public Student(String name, int age, String department) {
            this.name = name;
            this.age = age;
            this.department = department;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", department='" + department + '\'' +
                    '}';
        }
    }
}
