package fr.eni.controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Traitement
 */
@WebServlet("/Traitement")
public class Traitement extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Traitement() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String choixCPU = choixCPU();
		String choixJoueur = request.getParameter("choix");
		if(choixJoueur.equals("Pierre")) {
			switch(choixCPU) {
			case "Pierre" : request.setAttribute("resultat", "Egalite");break;
			case "Feuille" : request.setAttribute("resultat", "Défaite");break;
			case "Ciseaux" : request.setAttribute("resultat", "Victoire");break;
			}
		}else if(choixJoueur.equals("Feuille")) {
			switch(choixCPU) {
			case "Pierre" : request.setAttribute("resultat", "Victoire");break;
			case "Feuille" : request.setAttribute("resultat", "Egalite");break;
			case "Ciseaux" : request.setAttribute("resultat", "Defaite");break;
			}
		}else {
			switch(choixCPU) {
			case "Pierre" : request.setAttribute("resultat", "Défaite");break;
			case "Feuille" : request.setAttribute("resultat", "Victoire");break;
			case "Ciseaux" : request.setAttribute("resultat", "Egalite");break;
				}
			}
		request.setAttribute("choixCPU", choixCPU);
		request.setAttribute("choixJoueur", choixJoueur);
		request.getRequestDispatcher("/WEB-INF/resultat.jsp").forward(request, response);
	}

	protected String choixCPU() {
		String[] choixCPU = {"Pierre", "Feuille", "Ciseaux"};
		int temp;
		Random rd = new Random();
		temp = rd.nextInt(3);
		return choixCPU[temp];
		
	}
}
