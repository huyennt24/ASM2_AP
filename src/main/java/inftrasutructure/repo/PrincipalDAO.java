package inftrasutructure.repo;

import inftrasutructure.domain.Principal;

import java.util.ArrayList;
import java.util.List;

public class PrincipalDAO extends IDataSource<Principal> {
    @Override
    public List<Principal> saveAll(List<Principal> data) {
        return data;
    }

    @Override
    public List<Principal> search(String filter) {
        return null;
    }

    public static void main(String[] args) {
        PrincipalDAO dao = new PrincipalDAO();
        List<Principal> data = new ArrayList<>();

    }
}
