
public class Main {
    public static void main(String[] args) {
        String gitlab = new GitLab()
                .setApiToken("glpat-jVnzpzEsi-bawzn1Yz5s")
                .setProjectId("26454241")
                .build();

        if (gitlab != null) {
            System.out.println("Description: " + gitlab);
        }
    }
}
