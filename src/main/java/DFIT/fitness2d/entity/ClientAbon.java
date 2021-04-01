package DFIT.fitness2d.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
@Entity
public class ClientAbon {

    @ManyToOne(fetch = FetchType.LAZY) // чтобы не подтягивал связанную инфу всех клиентов в базе
    @MapsId("clientPhone")
    private Client client;
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("abonementId")
    private Abonements abonement;
    @EmbeddedId
    private ClientAbonKey clientAbonKey;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Abonements getAbonement() {
        return abonement;
    }

    public void setAbonement(Abonements abonement) {
        this.abonement = abonement;
    }

    public ClientAbonKey getClientAbonKey() {
        return clientAbonKey;
    }

    public void setClientAbonKey(ClientAbonKey clientAbonKey) {
        this.clientAbonKey = clientAbonKey;
    }

    @Embeddable
    public static class ClientAbonKey implements Serializable {
        @Column(name = "abonement_id")
        private int idAbon;
        @Column(name = "client_phone")
    private String clientPhone;

        public int getIdAbon() {
            return idAbon;
        }

        public void setIdAbon(int idAbon) {
            this.idAbon = idAbon;
        }

        public String getClientPhone() {
            return clientPhone;
        }

        public void setClientPhone(String clientPhone) {
            this.clientPhone = clientPhone;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ClientAbonKey that = (ClientAbonKey) o;
            return idAbon == that.idAbon &&
                    Objects.equals(clientPhone, that.clientPhone);
        }

        @Override
        public int hashCode() {
            return Objects.hash(idAbon, clientPhone);
        }
    }
}
