package Atividades;
import java.util.Timer;
import java.util.TimerTask;
public class MyTimer {
	public static final long TEMPO = (1000 * 5); // atualiza o site a cada 5 segundos
	public static void main(String[] args) {
		System.out.println("Començar...");
		Timer timer = null;
		if (timer == null) {
			timer = new Timer();
			TimerTask tarefa = new TimerTask() {
				public void run() {
					try {
						System.out.println("+"+TEMPO/1000+"seg");
						//chamar metodo
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			timer.scheduleAtFixedRate(tarefa, TEMPO, TEMPO);
		}
	}
}