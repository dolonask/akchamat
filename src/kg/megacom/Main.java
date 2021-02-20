package kg.megacom;

import kg.megacom.models.Client;
import kg.megacom.services.ClientService;

public class Main {

    public static void main(String[] args) {

        ClientService clientService = ClientService.INSTANCE;

        String phone = "996999999999";
        String idCard = "IZ3723";

        Client client = clientService.findOrCreateClient(phone, idCard);

    }
}
