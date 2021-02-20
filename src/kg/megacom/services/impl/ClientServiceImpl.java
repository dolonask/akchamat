package kg.megacom.services.impl;

import kg.megacom.models.Client;
import kg.megacom.services.ClientService;

import java.util.ArrayList;

public class ClientServiceImpl implements ClientService {

    private ArrayList<Client> clients = new ArrayList<>();

    @Override
    public Client findOrCreateClient(String phone, String idCard) {

        for (Client client : clients) {
            if (client.getPhone().equals(phone) && client.getIdCard().equals(idCard)) {
                return client;
            }
        }

        Client client = new Client(phone, idCard);
        clients.add(client);

        return client;
    }

    @Override
    public void blockClient() {

    }
}
