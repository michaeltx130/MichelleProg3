//Michelle Jesús Obeso Sánchez IDS TV

package pacman;

import java.awt.Rectangle;

public class Pastilla {
    int x, y, diametro;

    public Pastilla(int x, int y, int diametro) {
        this.x = x;
        this.y = y;
        this.diametro = diametro;
    }
    
    public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	
	//Esto crea un objeto Rectangle que representa y obtiene los límites de la pastilla
	public Rectangle getBounds() {
        return new Rectangle(x, y, diametro, diametro);
    }
}
