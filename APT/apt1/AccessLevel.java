//package APT;

public class AccessLevel {
    public String canAccess(int[] rights, int minPermission){
        String permission = "";

        for (int i = 0; i < rights.length; i++) {
            if (rights[i] >= minPermission) {
                permission = permission + "A";
                //permission = permission.concat("A");
            } else {
                permission = permission + "D";
            }
        }
        return permission;
    }



/*
    public static void main(String[] args) {
        int[] rights = new int[]{34, 78, 9, 52, 11, 1};
        int minPermission = 49;

        String output = canAccess(rights, minPermission);
        System.out.println(output);
    } */
}
