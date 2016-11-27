package dao;

import model.Achat;

import java.util.List;


public interface AchatDAO {
    public void addAchat(Achat a);
    public void modifierAchat(Achat a);
    public List<Achat> listAchat();
    public Achat getAchatById(int id);
    public void removeAchat(int id);
}