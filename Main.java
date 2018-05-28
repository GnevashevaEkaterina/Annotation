public class Main {
    public static void main(String[] args) {
        showoutVersionHistory(ClassVersion3.class);
    }

    private static void showoutVersionHistory(Class<?> versionedClass) {
        Version annotation = versionedClass.getAnnotation(Version.class);
        Class<?> versionedPreviousClass = annotation.previous();
        if (versionedPreviousClass != Void.class) {
            showoutVersionHistory(versionedPreviousClass);
        }

        System.out.println('\n' + versionedClass.getName() + ':');
        System.out.println("Version: " + annotation.value());
        System.out.println("Author: " +  annotation.author());
        System.out.println("Creation Date: " + annotation.creationDate());
    }
}
