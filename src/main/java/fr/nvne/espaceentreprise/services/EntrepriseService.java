package fr.nvne.espaceentreprise.services;

import fr.nvne.espaceentreprise.entities.UserEntreprise;
public interface EntrepriseService {
	public UserEntreprise findByEmail(String email);
	public UserEntreprise registerEntreprise(UserEntreprise entreprise);
}
